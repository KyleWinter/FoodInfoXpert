package priv.kyle.food.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import priv.kyle.food.dao.FoodDao;
import priv.kyle.food.entity.Food;
import priv.kyle.util.db.BaseDao;

public class FoodDaoImpl implements FoodDao{

	@Override
	public List<Food> selectAll() {
		List<Food> list = new ArrayList<Food>();
		String sql = "select * from food";
		BaseDao baseDao = new BaseDao();
		baseDao.open();
		ResultSet resultSet = baseDao.executeDQL(sql);
		try {
			while(resultSet.next()) {
				list.add(new Food(resultSet.getInt("fid"),
						resultSet.getInt("tid"),
						resultSet.getString("fname"),
						resultSet.getString("fpic"),
						resultSet.getDouble("fprice"),
						resultSet.getString("fdesc"),
						resultSet.getString("fregtime")));
				
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
			baseDao.close();
			return list;
	}

	@Override
	public List<Food> selectByTid(int tid) {
		List<Food> list = new ArrayList<Food>();
		String sql = "select * from food where tid=?";
		BaseDao baseDao = new BaseDao();
		baseDao.open();
		ResultSet resultSet = baseDao.executeDQL(sql,tid);
		try {
			if(resultSet.next()) {
				list.add(new Food(resultSet.getInt("fid"),
						resultSet.getInt("tid"),
						resultSet.getString("fname"),
						resultSet.getString("fpic"),
						resultSet.getDouble("fprice"),
						resultSet.getString("fdesc"),
						resultSet.getString("fregtime")));
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
			baseDao.close();
			return list;
	
		}

	@Override
	public Food selectByFid(int fid) {
		String sql = "select * from food where fid=?";
		Food food = null;
		BaseDao baseDao = new BaseDao();
		baseDao.open();
		ResultSet resultSet = baseDao.executeDQL(sql, fid);
		try {
			if(resultSet.next()) {
				food = new Food(resultSet.getInt("fid"),
						resultSet.getInt("tid"),
						resultSet.getString("fname"),
						resultSet.getString("fpic"),
						resultSet.getDouble("fprice"),
						resultSet.getString("fdesc"),
						resultSet.getString("fregtime"));
				
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
			baseDao.close();
			return food;
	}

	@Override
	public int insert(Food food) {
		String sql = "insert into food(tid,fname,fprice,fdesc,fregtime,fpic) values(?,?,?,?,?,?)";
		int count = -1;
		BaseDao baseDao = new BaseDao();
		baseDao.open();
		count = baseDao.executeDML(sql, food.getTid(),food.getFname(),food.getFprice(),food.getFdesc(),food.getFregtime(),food.getFpic());
		baseDao.close();
		return count;
	}

	@Override
	public int delete(int fid) {
		String sql = "delete from food where fid=?";
		int count = -1;
		BaseDao baseDao = new BaseDao();	
		baseDao.open();	
		count = baseDao.executeDML(sql,fid);
		baseDao.close();
		return count;
	}

	@Override
	public int update(Food food) {

		StringBuilder sql = new StringBuilder("update food set ");
		
		Integer tid = food.getTid();
		String fname = food.getFname();
		String fpic = food.getFpic();
		Double fprice = food.getFprice();
		String fdesc = food.getFdesc();
		List<Object> param = new ArrayList<Object>();
	
		if(tid!=null) {
			sql.append("tid=?,");
			param.add(tid);
		}
		if(fname!=null) {
			sql.append("fname=?,");
			param.add(fname);
		}
		if(fpic!=null) {
			sql.append("fpic=?,");
			param.add(fpic);
		}
		if(fprice!=null) {
			sql.append("fprice=?,");
			param.add(fprice);
		}
		if(fdesc!=null) {
			sql.append("fdesc=?,");
			param.add(fdesc);
		}
					
		String sqlStr = sql.toString();		
		String tSql = sql.substring(0,sql.length()-1)+" where fid=?";
		param.add(food.getFid());
		
//		System.out.println(tSql);
		
		int count = -1;		
		BaseDao baseDao = new BaseDao();	
		baseDao.open();				
		count = baseDao.executeDML(tSql,param);		
		baseDao.close();
		
		return count;
		
	}
	
	
	@Override
	public List<Food> selectByLike(String name, String desc) {
		
		String sql = "select * from food";
		if(name!=""&&desc!="") {
			sql = "select * from food where fname like '%"+name+"%' and fdesc like '%"+desc+"%'";
		}else if(name==""&&desc!="") {
			sql = "select * from food where fdesc like '%"+desc+"%'";
		}else if(name!=""&&desc=="") {
			sql = "select * from food where fname like '%"+name+"%'";
		}
		
		List<Food> list = new ArrayList<Food>();
		
		BaseDao baseDao = new BaseDao();
		
		baseDao.open();
		
		
		ResultSet rs = baseDao.executeDQL(sql);
		
			
		try {
			while(rs.next()) {	
				list.add(new Food(rs.getInt("fid"),
						rs.getInt("tid"),
						rs.getString("fname"),
						rs.getString("fpic"),
						rs.getDouble("fprice"),
						rs.getString("fdesc"),
						rs.getString("fregtime")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		baseDao.close();
		return list;
	}
}
