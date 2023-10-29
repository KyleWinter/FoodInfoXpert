package priv.kyle.food.servlet.food;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.google.gson.Gson;

import priv.kyle.food.entity.Food;
import priv.kyle.food.service.FoodService;
import priv.kyle.food.service.impl.FoodServiceImpl;
@WebServlet("/Food/Change")
@MultipartConfig
public class ChangeServlet extends HttpServlet{
private FoodService foodService = new FoodServiceImpl();
private Gson gson = new Gson();
@Override
protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
	BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));

	Map<String, Object> map = new HashMap<String, Object>();
	Food food = gson.fromJson(br.readLine(), Food.class);
	System.out.println(food);
	map.put("isOK", foodService.change(food));
	response.getWriter().write(new Gson().toJson(map));
}
}
