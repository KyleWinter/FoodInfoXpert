package priv.kyle.food.servlet.food;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import priv.kyle.food.entity.Food;
import priv.kyle.food.service.FoodService;
import priv.kyle.food.service.impl.FoodServiceImpl;
@WebServlet("/Food/All")
public class GetAllServlet extends HttpServlet{
	private FoodService foodService = new FoodServiceImpl();

	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		List<Food> list = foodService.getAllWithFtype();
		request.setAttribute("list", list);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("list", list);
		response.getWriter().write(new Gson().toJson(map));
	}
}
