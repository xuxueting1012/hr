package cn.mldn.demo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class CopyOfCreateJSONDataDemoB {
   public static void main(String[] args) {
	JSONObject obj=new JSONObject();//指的最外层数据
	obj.put("dname", "开发部");
	obj.put("count", 10);
	JSONArray array=new JSONArray();
	for(int x=0;x<3;x++){
		JSONObject temp=new JSONObject();
		temp.put("ename", "姓名-"+x);
		temp.put("job", "职位-"+x);
		array.add(temp);
	}
	obj.put("emps", array);
	System.out.println(obj);
	
}
}
