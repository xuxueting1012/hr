package cn.mldn.demo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class CreateJSONDataDemoC {
   public static void main(String[] args) {
	JSONObject obj=new JSONObject();//指的最外层数据
	obj.put("name", "将于");
	obj.put("age", 39);
	JSONArray array=new JSONArray();
	array.add("java开发");
	array.add("jsp开发");
	array.add("Oracle开发");
	obj.put("skill", array);
	System.out.println(obj);
	
}
}
