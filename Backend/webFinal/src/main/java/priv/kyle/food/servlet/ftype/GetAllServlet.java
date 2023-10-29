package priv.kyle.food.servlet.ftype;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import priv.kyle.food.service.FtypeService;
import priv.kyle.food.service.impl.FtypeServiceImpl;


@WebServlet("/Ftype/All")
public class GetAllServlet extends HttpServlet {
	private FtypeService ftypeService = new FtypeServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("list", ftypeService.getAll());
		response.getWriter().write(new Gson().toJson(map));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
