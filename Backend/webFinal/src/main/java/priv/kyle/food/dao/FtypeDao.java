package priv.kyle.food.dao;

import java.util.List;

import priv.kyle.food.entity.Ftype;

public interface FtypeDao {
	Ftype selectByTid(int tid);
	List<Ftype> selectAll();
	
}
