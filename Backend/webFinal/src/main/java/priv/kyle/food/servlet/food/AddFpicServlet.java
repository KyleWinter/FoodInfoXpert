package priv.kyle.food.servlet.food;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.google.gson.Gson;

import priv.kyle.food.entity.Food;

@WebServlet("/Food/Upload")
@MultipartConfig
public class AddFpicServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String IMG_DIRECTORY = "http://localhost:8080/webFinal/foods";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    			Part part = request.getPart("file");
    			System.out.println("the file name is:"+part.getSubmittedFileName());
    			String path = request.getSession().getServletContext().getRealPath("/foods");
    			part.write(path+"\\"+part.getSubmittedFileName());
    			Map<String, Object> map = new HashMap<String, Object>();
    			map.put("fpic", part.getSubmittedFileName());
    			map.put("isOK",true);
    			response.getWriter().write(new Gson().toJson(map));
    }
}