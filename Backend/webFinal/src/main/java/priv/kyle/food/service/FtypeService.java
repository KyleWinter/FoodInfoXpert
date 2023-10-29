package priv.kyle.food.service;

import java.util.List;

import priv.kyle.food.entity.Ftype;

public interface FtypeService {
	List<Ftype> getAllWithFood();
	List<Ftype> getAll();
}
