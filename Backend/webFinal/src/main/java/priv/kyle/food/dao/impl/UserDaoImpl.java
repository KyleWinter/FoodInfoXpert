package priv.kyle.food.dao.impl;

import java.security.interfaces.RSAKey;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.ast.TrueLiteral;

import priv.kyle.food.dao.UserDao;
import priv.kyle.food.entity.Userinfo;
import priv.kyle.util.db.BaseDao;

public class UserDaoImpl implements UserDao{

	@Override
	public Userinfo selectByUsercodeAndUserpwd(Userinfo user) {
		String sql = "select * from userinfo where usercode=? and userpwd=?";
		Userinfo getUser = null;
		BaseDao baseDao = new BaseDao();
		baseDao.open();
		ResultSet resultSet = baseDao.executeDQL(sql, user.getUsercode(),user.getUserpwd());
		try {
			if(resultSet.next()) {
				getUser = new Userinfo(resultSet.getInt("userid"),
						user.getUsercode(),"******",
						resultSet.getString("nickname"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		baseDao.close();
		return getUser;
	}

}
