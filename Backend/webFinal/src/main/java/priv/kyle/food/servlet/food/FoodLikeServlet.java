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
import priv.kyle.food.service.impl.FoodServiceImpl;
import priv.kyle.food.entity.Food;
import priv.kyle.food.service.FoodService;

/**
 * Servlet implementation class FoodLikeServlet
 */
@WebServlet("/FoodLikeServlet")
public class FoodLikeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FoodService foodService = new FoodServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodLikeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("name");
		String desc = request.getParameter("desc");
		
		List<Food> list = foodService.getLikeWithFtype(name,desc);
		Map<String,Object> map = new HashMap<String, Object>();
		
		map.put("list",list);
		
		response.getWriter().write(new Gson().toJson(map));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
