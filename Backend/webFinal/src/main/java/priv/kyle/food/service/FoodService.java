package priv.kyle.food.service;

import java.io.File;
import java.util.List;

import priv.kyle.food.entity.Food;

public interface FoodService {
	List<Food> getAllWithFtype();
	Food getByFid(int fid);
	boolean add(Food food);
	boolean remove(int fid);
	boolean change(Food food);
	List<Food> getLikeWithFtype(String name,String desc);
}
