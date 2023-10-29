package priv.kyle.food.servlet.userinfo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import priv.kyle.food.entity.Userinfo;
import priv.kyle.food.service.UserService;
import priv.kyle.food.service.impl.UserServiceImpl;

@WebServlet("/Userinfo/Login")
public class LoginServlet extends HttpServlet {
	private UserService userService = new UserServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usercode = request.getParameter("usercode");
		String userpwd = request.getParameter("userpwd");
		
		Userinfo user = userService.login(new Userinfo(null,usercode,userpwd,null));
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("isOK", false);
		if(user!=null) {
			map.put("isOK", true);
			HttpSession  session = request.getSession();
			session.setAttribute("loginUser", user);
		}
		response.getWriter().write(new Gson().toJson(map));
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
