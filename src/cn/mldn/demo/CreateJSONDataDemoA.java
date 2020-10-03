package cn.mldn.demo;

import net.sf.json.JSONObject;

public class CreateJSONDataDemoA {
   public static void main(String[] args) {
	JSONObject obj=new JSONObject();//指的最外层数据
	obj.put("name", "将于");
	obj.put("age", 39);
	System.out.println(obj);
	
}
}
