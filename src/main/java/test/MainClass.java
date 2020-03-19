package test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("SpringTestConfigure.xml");
		Hello hello = ctx.getBean("helloTest",Hello.class);
		Hello2 hello2 = ctx.getBean("helloTest2",Hello2.class);
		
		hello.sendHello();
		hello2.sendHello();
		
		ctx.close();
	}
}
