package test;

import org.springframework.context.support.GenericXmlApplicationContext;

import test2.Hello3;

public class MainClass {
	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("SpringTestConfigure.xml");
		Hello hello = ctx.getBean("helloTest",Hello.class);
		Hello2 hello2 = ctx.getBean("helloTest2",Hello2.class);
		Hello3 hello3 = ctx.getBean("helloTest3", Hello3.class);
		
		hello.sendHello();
		hello2.sendHello();
		hello3.sendHello();
		
		ctx.close();
	}
}
