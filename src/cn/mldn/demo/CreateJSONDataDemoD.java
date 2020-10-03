package cn.mldn.demo;

import java.util.ArrayList;
import java.util.List;






import cn.mldn.vo.Dept;
import cn.mldn.vo.Emp;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class CreateJSONDataDemoD {
   public static void main(String[] args) {
	   List<Emp> all=new ArrayList<Emp>();
	   for(int x=0;x<10;x++){
		   Emp emp=new Emp();
		   emp.setEmpno(x);
		   emp.setEname("姓名-"+x);
		   emp.getDept().setDeptno(x+1000);
		   emp.getDept().setDname("部门-"+x);
		   all.add(emp);
	   }
	JSONObject obj=new JSONObject();//指的最外层数据
	obj.put("dname", "开发部");
	obj.put("count", 10);
	obj.put("emps", all);
	
	System.out.println(obj);//结果是因为list里面放入的是emp对象。所以结果按照emp的属性放置的。属性有dept,ename,empno三个做为key.
	
}
}
