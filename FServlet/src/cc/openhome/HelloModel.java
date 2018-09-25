package cc.openhome;

import java.util.HashMap;
import java.util.Map;

public class HelloModel {
	
	private Map<String, String>  messages = new  HashMap<String,String>();

	public HelloModel() { 					//构造函数
		messages.put("zhangs", "Hello");
		messages.put("lis", "Welcome");
		messages.put("wangw", "Hi");
		messages.put("123", "555555");
		messages.put("林", "哈哈");
	}
	
	public String doHello(String user) {
		String message = messages.get(user);
		return message+","+user;
	}
	
	public static void main(String[] args) {
		   HelloModel helloModel = new HelloModel();
					System.out.println(helloModel.doHello("林"));		
					System.out.println("xxsdfaerf");		
					System.out.println(helloModel.doHello("123"));
	}
	
}
