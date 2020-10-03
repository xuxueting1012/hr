package cn.mldn.demo;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;






import java.util.Map;
import java.util.Scanner;

import javax.xml.crypto.Data;

import cn.mldn.vo.Dept;
import cn.mldn.vo.Emp;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ReadJSONDataDemoB {
   public static void main(String[] args) {
	  System.out.println(load());
	   JSONObject obj=JSONObject.fromObject(load());//文本变为json对象
	   System.out.println("部门名称："+obj.getString("dname"));
	   System.out.println("部门人数："+obj.getString("count"));
	   System.out.println("雇员信息：");
	   JSONArray array=obj.getJSONArray("emps");
	   for(int x=0;x<array.size();x++){
		   JSONObject temp=array.getJSONObject(x);
		  // System.out.println("\t|-姓名："+temp.get("ename")+"\t|-编号："+temp.get("empno"));
		   
	   }
	 
	   
}
   public static String load(){
	   StringBuffer buf=new StringBuffer();
	 try{
	   File file=new File("E:"+File.separator+"mytest"+File.separator+"data.txt");
       Scanner scan= new Scanner(new FileInputStream(file));
       while(scan.hasNext()){
    	   buf.append(scan.next());
       }
       scan.close();
	 }catch(Exception e){
	   }
	 return buf.toString();
   }
}
