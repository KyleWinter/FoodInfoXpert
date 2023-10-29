package priv.kyle.food.service.impl;

import java.util.List;

import priv.kyle.food.dao.FoodDao;
import priv.kyle.food.dao.FtypeDao;
import priv.kyle.food.dao.impl.FoodDaoImpl;
import priv.kyle.food.dao.impl.FtypeDaoImpl;
import priv.kyle.food.entity.Ftype;
import priv.kyle.food.service.FtypeService;

public class FtypeServiceImpl implements FtypeService{
	private FoodDao foodDao = new FoodDaoImpl();
	private FtypeDao ftypeDao = new FtypeDaoImpl();
	
	@Override
	public List<Ftype> getAllWithFood() {
		List<Ftype> list=ftypeDao.selectAll();
		for(int i=0;i<list.size();i++) {
			Ftype ftype = list.get(i);
			ftype.setFoodList(foodDao.selectByTid(ftype.getTid()));
		}
		return list;
	}

	@Override
	public List<Ftype> getAll() {
		return ftypeDao.selectAll();
	}
}
