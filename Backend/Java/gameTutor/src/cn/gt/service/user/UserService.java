package cn.gt.service.user;

import cn.gt.pojo.User;

public interface UserService {
	
	//判断账号是否可用
	User userNameExist(String userName);

	//添加用户
	int addUser(User user);

	boolean selectUser(User user);

	boolean upload(String idPicPath, int uId);

	int findId(String userName);

}
