package cn.gt.controller.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import cn.gt.pojo.User;
import cn.gt.service.user.UserService;

@Controller
@RequestMapping("/log")
public class LogController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	// profile.jsp中的更换图片
	@RequestMapping("/upload")
	@ResponseBody
	public String upload(HttpServletRequest request, HttpServletResponse response){
		String idPicPath = null;
        String idPicRealPath = null;
		String dataURL = request.getParameter("dataURL");
		String imgURL = request.getParameter("imgURL");
		
		// 验证是否登录
		String userName = (String)request.getSession().getAttribute("userName");
		int uId = userService.findId(userName);
		boolean flag = false;
		if(uId != 0){
			// 存储图片到本地（服务器）
			String path = request.getContextPath() + File.separator + "statics"+ File.separator+"uploadfiles";
            String realPath = request.getSession().getServletContext().getRealPath("statics"+ File.separator+"uploadfiles");
            String fileName = System.currentTimeMillis()+ RandomUtils.nextInt(1000000)+uId+"_Personal.txt";
            
            // 文件相对路径
            idPicPath = path+File.separator+fileName;
            // 文件绝对路径
            idPicRealPath = realPath+File.separator+fileName;
            File targetFile = new File(realPath, fileName);
            // 判断路径是否存在，不存在就新建这个路径
            if(!targetFile.exists()){
                targetFile.mkdirs();
            }
            //保存
            FileReader r = null;
            FileWriter w = null;
            try {
            	r = new FileReader(dataURL);
            	w = new FileWriter("fileName");
            	int len = 0;
            	char[] c = new char[2048];
            	while((len=r.read(c))!=-1){
            		w.write(c, 0, len);
            		w.flush();
            	}
            	
            } catch (Exception e) {
                e.printStackTrace();
                return JSON.toJSONString("error");
            }finally{
            	try {
					r.close();
					w.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	
            }
			flag = userService.upload(idPicPath,uId);
			if(flag){
				Object img = JSON.toJSON(imgURL);
			}
		}else{
			request.setAttribute("uploadFileError", " * 上传失败！");
		}
		return "imgURL";
		
	}
	
	
	
	/*// profile.jsp中的更换图片
	@RequestMapping("/upload")
	@ResponseBody
	public String upload(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "changePorfileBut", required = false) MultipartFile attach) {
		String showView = "";
		if (!attach.isEmpty()) {
			// 选中文件的绝对路径
			String realPath = request.getSession().getServletContext()
					.getRealPath("statics" + File.separator + "uploadfiles");
			String oldFileName = attach.getOriginalFilename();// 原文件名
			String suffix = FilenameUtils.getExtension(oldFileName);// 原文件后缀
			int filesize = 5242880;// 上传文件最大5M
			if (attach.getSize() > filesize) {// 上传大小不得超过 5M
				request.setAttribute("uploadFileError", " * 上传大小不得超过 5M");
				return "profile";
			} else if (suffix.equalsIgnoreCase("jpg") || suffix.equalsIgnoreCase("png")
					|| suffix.equalsIgnoreCase("jpeg") || suffix.equalsIgnoreCase("pneg")) {// 上传图片格式不正确
				String fileName = System.currentTimeMillis() + RandomUtils.nextInt(1000000) + "_Personal.jpg";
				// 将图片转成二进制数据
				byte[] file = null;
				try {
					file = attach.getBytes();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (file == null) {
					request.setAttribute("uploadFileError", " * 文件为空！");
					return "profile";
				} else {
					String userName = (String)request.getSession().getAttribute("userName");
					// 验证是否登录
					int uId = userService.findId(userName);
					boolean flag = false;
					if(uId != 0){
						// profile.jsp更换图片
						flag = userService.upload(file,uId);
					}else{
						return JSON.toJSONString("error");
					}
					
					if (flag) {
						// 下载

					} else {
						return JSON.toJSONString(flag);
					}
				}
			}
		} else {
			request.setAttribute("uploadFileError", " * 上传图片格式不正确");
			return "profile";
		}
		return showView;
	}*/

	// 登出
	@RequestMapping("/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().invalidate();

	}

	// 登录
	@RequestMapping("/selectUser")
	@ResponseBody
	public String selectUser(HttpServletRequest request, HttpServletResponse response) {
		String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");
		User user = new User();
		user.setName(userName);
		user.setPwd(userPwd);
		boolean flag = userService.selectUser(user);
		if(flag){
			request.getSession().setAttribute("userName", userName);
			request.getSession().setAttribute("userPwd", userPwd);
		}
		return JSON.toJSONString(flag);

	}

}
