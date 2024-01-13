package com.SpringFramework2.SpringFrameworkProg2.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.SpringFramework2.SpringFrameworkProg2.entity.student;

//Configartion file

//class="com.SpringFramework1.SpringFrameworkProg1.beans.student" id="stdId">
//this work will done by this @configureation annotation in java file 
@Configuration 
public class SpringConfigFile {
	
	/* The method annotation @Bean will:
	 create a new student object
	 configure the student object setting property using set method
	 the default bean name for this method will be stdId which is the same as the method name
	 return the configure studnet object
	 
	 */
	@Bean()
	// OR @Bean("anothermethodname")
	public student stdId() {
		
		student std = new student();
		
		std.setId(1);
		std.setName("rachana");
		std.setRollno(101);
			
		return std;
	}


}
