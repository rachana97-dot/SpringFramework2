package com.SpringFramework2.SpringFrameworkProg2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SpringFramework2.SpringFrameworkProg2.config.SpringConfigFile;
import com.SpringFramework2.SpringFrameworkProg2.entity.student;

//Spring Container File

public class Main {
	public static void main(String[] args) {
		/* ApplicationContext (Spring container) is an interface in spring which is used to manage beans, 
		 handle application events, and access resources 
		 
		 * Some implemented classes of apllicationcontext are:- 
		 1. ClassPathXmlApplicationContext(used for xml Configuration)
		 2. AnnotationConfigApplicationContext(used for java Config)
		 */
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		student std = (student)context.getBean("stdId");
		std.display();
	
//	OR	student std = context.getBean(student.class);
//		std.display();
		
//	OR	student std = (student) context.getBean("anothermethodname");
//		std.display();
		
		
	}

}
 