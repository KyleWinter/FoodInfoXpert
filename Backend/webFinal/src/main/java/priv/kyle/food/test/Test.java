package priv.kyle.food.test;

import java.util.List;

import priv.kyle.food.dao.FoodDao;
import priv.kyle.food.dao.FtypeDao;
import priv.kyle.food.dao.UserDao;
import priv.kyle.food.dao.impl.FoodDaoImpl;
import priv.kyle.food.dao.impl.FtypeDaoImpl;
import priv.kyle.food.dao.impl.UserDaoImpl;
import priv.kyle.food.entity.Food;
import priv.kyle.food.entity.Ftype;
import priv.kyle.food.entity.Userinfo;
import priv.kyle.food.service.FoodService;
import priv.kyle.food.service.FtypeService;
import priv.kyle.food.service.impl.FoodServiceImpl;
import priv.kyle.food.service.impl.FtypeServiceImpl;

public class Test {
	public static void main(String[] args) {
//		UserDao dao = new UserDaoImpl();
//		Userinfo userinfo = dao.selectByUsercodeAndUserpwd(new Userinfo(null,"a","1",""));
//		System.out.println(userinfo);
//		
//		FoodDao dao2 = new FoodDaoImpl();
//		List<Food> list = dao2.selectAll();
//		for(Food f:list) {
//			System.out.println(f);
//		}
		
//		FtypeDao dao3 = new FtypeDaoImpl();
//		Ftype ftype  = dao3.selectByTid(14);
//		System.out.println(ftype);
//	
//		List<Ftype> list2 = dao3.selectAll();
//		System.out.println(list2);
		
		FoodService service = new FoodServiceImpl();
		List<Food> list3 = service.getAllWithFtype();
		
		for(Food f:list3) {
			System.out.println(f);
		}	
		FtypeService service2 = new FtypeServiceImpl();
		List<Ftype> list4 = service2.getAllWithFood();
		for(Ftype f:list4) {
			System.out.println(f);
			System.out.println(f.getFoodList());
		}
	}
}
