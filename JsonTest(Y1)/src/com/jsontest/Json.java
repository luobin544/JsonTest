package com.jsontest;
import org.json.JSONArray;
 
public class Json {  
  
    public static void main(String[] args) throws Exception{  
              
        JSONArray jsonarray = new JSONArray("[{'name':'xiazdong','age':20},{'name':'xzdong','age':15}]");  
        for(int i=0;i<jsonarray.length();i++){  
            String name = jsonarray.getJSONObject(i).getString("name");  
            int age = jsonarray.getJSONObject(i).getInt("age");  
            System.out.println("name="+name);  
            System.out.println("age="+age);  
        }  
          
    }  
}
