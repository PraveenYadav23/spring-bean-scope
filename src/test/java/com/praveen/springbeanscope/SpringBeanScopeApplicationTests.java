package com.praveen.springbeanscope;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class SpringBeanScopeApplicationTests {

	@Test
	public void checkSingletonScope(){
		ApplicationContext context = new AnnotationConfigApplicationContext("com.praveen.springbeanscope");
		Person person1 = (Person) context.getBean("personSingleton");
		Person person2 = (Person) context.getBean("personSingleton");
		System.out.println(person1 + " "+ person2);
	}

	@Test
	public void checkPrototypeScope(){
		ApplicationContext context = new AnnotationConfigApplicationContext("com.praveen.springbeanscope");
		Person person1 = (Person) context.getBean("personPrototype");
		Person person2 = (Person) context.getBean("personPrototype");
		System.out.println(person1 + " "+ person2);
	}

}
