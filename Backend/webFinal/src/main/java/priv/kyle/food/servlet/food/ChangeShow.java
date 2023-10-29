package priv.kyle.food.servlet.food;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import priv.kyle.food.entity.Food;
import priv.kyle.food.service.*;
import priv.kyle.food.service.impl.*;
@WebServlet("/Food/ShowChange")


public class ChangeShow extends HttpServlet{
	private FoodService foodService = new FoodServiceImpl();
	private FtypeService ftypeService = new FtypeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		int fid = Integer.parseInt(request.getParameter("fid"));
		Food food = foodService.getByFid(fid);
		request.setAttribute("food", food);
		request.setAttribute("typeList", ftypeService.getAll());
		request.getRequestDispatcher("/ShowChange.jsp").forward(request, response);
		
	}
}
