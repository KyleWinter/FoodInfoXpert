package priv.kyle.food.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import priv.kyle.food.dao.FtypeDao;
import priv.kyle.food.entity.Ftype;
import priv.kyle.util.db.BaseDao;

public class FtypeDaoImpl implements FtypeDao{

	@Override
	public Ftype selectByTid(int tid) {
		String sql = "select * from ftype where tid=?";
		Ftype ftype = null;
		BaseDao baseDao = new BaseDao();
		baseDao.open();
		ResultSet resultSet = baseDao.executeDQL(sql, tid);
		try {
			if(resultSet.next()) {
				ftype = new Ftype(resultSet.getInt("tid"), 
						resultSet.getString("tname"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		baseDao.close();
		return ftype;
	}

	@Override
	public List<Ftype> selectAll() {
		String sql = "select * from ftype";
		List<Ftype> list = new ArrayList<Ftype>();
		BaseDao baseDao = new BaseDao();
		baseDao.open();
		ResultSet resultSet = baseDao.executeDQL(sql);
		try {
			while(resultSet.next()) {
				list.add(new Ftype(resultSet.getInt("tid"), 
						resultSet.getString("tname")));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		baseDao.close();
		return list;
	}

}
