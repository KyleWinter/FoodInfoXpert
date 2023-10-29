package priv.kyle.food.dao;

import java.util.List;
import priv.kyle.food.entity.*;
public interface FoodDao {
	List<Food> selectAll();
	List<Food> selectByTid(int tid);
	Food selectByFid(int fid);
	int insert(Food food);
	int delete(int fid);
	int update(Food food);
	List<Food> selectByLike(String name, String desc);
}
