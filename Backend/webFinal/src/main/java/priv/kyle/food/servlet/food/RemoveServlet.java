package priv.kyle.food.servlet.food;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import priv.kyle.food.service.FoodService;
import priv.kyle.food.service.impl.FoodServiceImpl;
@WebServlet("/Food/Remove")
public class RemoveServlet extends HttpServlet{
	private FoodService foodService =  new FoodServiceImpl();
	private Gson gson = new Gson();
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("isOK", foodService.remove(Integer.parseInt(request.getParameter("fid"))));
		response.getWriter().write(new Gson().toJson(map));
		
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException {
		doGet(request, response);
	}
}
