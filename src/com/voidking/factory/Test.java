package com.voidking.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		/*
		Human human=null;
		human= new Factory().getHuman("Chinese");
		human.eat();
		human.walk();
		
		human= new Factory().getHuman("American");
		human.eat();
		human.walk();
		*/
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		Human human = null;
		human =(Human)ctx.getBean("chinese");
		human.eat();
		human.walk();
		human = (Human)ctx.getBean("american");
		human.eat();
		human.walk();
	}
}
