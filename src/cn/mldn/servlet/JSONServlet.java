package cn.mldn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
@WebServlet(urlPatterns="/JSONServlet")
public class JSONServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html");//这个就是文本格式
    	JSONObject obj=new JSONObject();//最外层的大括号
    	JSONArray array=new JSONArray();
    	for(int x=0;x<10;x++){
    		JSONObject temp=new JSONObject();
    		temp.put("id",x);
    		temp.put("title","城市-"+x);
    		array.add(temp);
    	}
    	obj.put("allCities", array);
    	resp.getWriter().print(obj);
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	
    	this.doGet(req, resp);
    }
}
