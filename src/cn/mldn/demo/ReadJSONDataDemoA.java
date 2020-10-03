package cn.mldn.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;






import java.util.Map;

import cn.mldn.vo.Dept;
import cn.mldn.vo.Emp;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ReadJSONDataDemoA {
   public static void main(String[] args) {
	  String str="{\"name\":\"将与\",\"age\":39}";
	  JSONObject obj=JSONObject.fromObject(str);//解析字符串内容
	  System.out.println("姓名："+obj.getString("name"));
	  System.out.println("年龄："+obj.getInt("age"));
}
}
