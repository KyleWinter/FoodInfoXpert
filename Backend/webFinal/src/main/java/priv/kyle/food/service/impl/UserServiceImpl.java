package priv.kyle.food.service.impl;

import priv.kyle.food.dao.impl.UserDaoImpl;
import priv.kyle.food.entity.Userinfo;
import priv.kyle.food.service.UserService;
import priv.kyle.food.dao.*;
public class UserServiceImpl implements UserService {
	private UserDao userDao =  new UserDaoImpl();
	@Override
	public Userinfo login(Userinfo userinfo) {
		return userDao.selectByUsercodeAndUserpwd(userinfo);
	}
	
}
