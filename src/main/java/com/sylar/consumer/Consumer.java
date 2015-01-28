package com.sylar.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sylar.service.IProcessData;

public class Consumer {
	
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();

		IProcessData demoService = (IProcessData) context.getBean("demoService"); // get service invocation
																				
		// proxy
		String hello = demoService.deal("hello dubbo"); // do invoke!

		System.out.println(Thread.currentThread().getName() + " " + hello);
	}
}
