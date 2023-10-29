package priv.kyle.food.servlet.food;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

import priv.kyle.food.entity.Food;
import priv.kyle.food.entity.Userinfo;
import priv.kyle.food.service.FoodService;
import priv.kyle.food.service.impl.FoodServiceImpl;

@WebServlet("/Food/Add")
public class AddServlet extends HttpServlet {
	private FoodService foodService = new FoodServiceImpl();
	private Gson gson = new Gson();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("isOK", foodService.add(gson.fromJson(br.readLine(), Food.class)));
		
		response.getWriter().write(new Gson().toJson(map));
	}

}
