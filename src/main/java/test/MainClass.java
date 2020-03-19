package test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("SpringTestConfigure.xml");
		Hello hello = ctx.getBean("helloTest",Hello.class);
		
		hello.sendHello();
		
		ctx.close();
	}
}
