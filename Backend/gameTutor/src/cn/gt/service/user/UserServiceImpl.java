package cn.gt.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gt.dao.user.UserDao;
import cn.gt.pojo.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	//登录
	public boolean selectUser(User user){
		User users = userDao.selectUser(user);
		boolean flag = false;
		if(users != null){
			flag = true;
		}
		return flag;
		
	}
	
	//判断账号是否可用
	@Override
	public User userNameExist(String userName) {
		// TODO Auto-generated method stub
		User user = userDao.userNameExist(userName);
		return user;
	}

	//添加用户
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		int i = userDao.addUser(user);
		return i;
	}

	//profile.jsp中提交图片到数据库
	@Override
	public boolean upload(String idPicPath, int uId) {
		// TODO Auto-generated method stub
		int i = userDao.upload(idPicPath, uId);
		boolean flag = false;
		if(i != 0){
			flag = true;	
		}
		return flag;
	}

	//profile.jsp中更换图片前验证是否登录状态
	@Override
	public int findId(String userName) {
		// TODO Auto-generated method stub
		int uId = userDao.findId(userName);
		return uId;
	}

}
