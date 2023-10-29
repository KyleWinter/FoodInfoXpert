package priv.kyle.food.dao;

import priv.kyle.food.entity.Userinfo;

public interface UserDao {
	Userinfo selectByUsercodeAndUserpwd(Userinfo user);
}
