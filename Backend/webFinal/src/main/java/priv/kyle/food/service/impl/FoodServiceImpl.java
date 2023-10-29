package priv.kyle.food.service.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import priv.kyle.food.dao.FoodDao;
import priv.kyle.food.dao.FtypeDao;
import priv.kyle.food.dao.impl.FoodDaoImpl;
import priv.kyle.food.dao.impl.FtypeDaoImpl;
import priv.kyle.food.entity.Food;
import priv.kyle.food.service.FoodService;
import priv.kyle.food.entity.*;
public class FoodServiceImpl implements FoodService{
	private FoodDao foodDao = new FoodDaoImpl();
	private FtypeDao ftypeDao = new FtypeDaoImpl();
	@Override
	public List<Food> getAllWithFtype() {
		List<Food> list = foodDao.selectAll();
		Map<Integer,Ftype> map = new HashMap<Integer,Ftype>();
		int count = 0;
		for(int i=0;i<list.size();i++) {
			Food food = list.get(i);
			int tid = food.getTid();
			Ftype ftype = map.get(tid);
			if(ftype==null) {
				ftype = ftypeDao.selectByTid(tid);
				count++;
				map.put(tid, ftype);
			}
			food.setFtype(ftype);
		}
//		System.out.println(count);
		return list;
	}

	@Override
	public Food getByFid(int fid) {
		return foodDao.selectByFid(fid);
	}

	@Override
	public boolean add(Food food) {
		int count = foodDao.insert(food);
		if(count>0)
			return true;
		return false;
	}

	@Override
	public boolean remove(int fid) {
		int count = foodDao.delete(fid);
		if(count>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean change(Food food) {
		System.out.println(food);
		if(food==null)
			return false;
		if(food.getFid()==null)
			return false;
		if(food.getTid()==null && food.getFname()== null && food.getFpic()==null && food.getFprice() == null &&food.getFdesc()==null)
			return false;
		int count = foodDao.update(food);
		if(count>0)
			return true; 
		System.out.println(food);
		return false;
	}

	
	@Override
	public List<Food> getLikeWithFtype(String name,String desc){
		List<Food> list = foodDao.selectByLike(name,desc);
		
		Map<Integer,Ftype> map = new HashMap<Integer, Ftype>();
		int count =0;
		for(int i=0;i<list.size();i++) {
			Food food = list.get(i);
			int tid = food.getTid();
			
			Ftype ftype = map.get(tid);
			
			if(ftype==null) {
				ftype = ftypeDao.selectByTid(tid);
				count++;
				map.put(tid,ftype);
			}
			
			food.setFtype(ftype);
			
		}
		System.out.println(count);		
		return list;
	}

}
