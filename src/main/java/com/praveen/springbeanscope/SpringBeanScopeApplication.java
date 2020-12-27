package com.praveen.springbeanscope;

import com.praveen.springbeanscope.bean.PrototypeBean;
import com.praveen.springbeanscope.bean.SingletonBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBeanScopeApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.praveen.springbeanscope");
//		checkSingletonBean(context);
//		checkPrototypeBean(context);
		School schoolObj = context.getBean("school", School.class);
		System.out.println(schoolObj.getStudent());
		System.out.println(schoolObj.getStudent());
	}

	private static void checkPrototypeBean(ApplicationContext context) {
		PrototypeBean pb1 = context.getBean("prototypeBean", PrototypeBean.class);
		PrototypeBean pb2 = context.getBean("prototypeBean", PrototypeBean.class);
		System.out.println(pb1 + " "+ pb2);
	}

	private static void checkSingletonBean(ApplicationContext context) {
		SingletonBean sb1 = (SingletonBean) context.getBean("singletonBean");
		SingletonBean sb2 = (SingletonBean) context.getBean("singletonBean");
		System.out.println(sb1 + " " + sb2);
	}

}
