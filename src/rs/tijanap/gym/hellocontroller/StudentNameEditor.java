package rs.tijanap.gym.hellocontroller;

import java.beans.PropertyEditorSupport;

/**
 * 16.cas your own custom property editor class
 * https://www.youtube.com/watch?v=7YlOekkqAlw
 * ovde se mogu naci svi built in sustom eitor za validation:
 * http://docs.spring.io/spring/docs/current/spring-framework-reference/html/validation.html
 */

public class StudentNameEditor extends PropertyEditorSupport{
	//when you submitt the sdmission form
	//spring MVC will run setAsText() function of this class
	// before performinf data binding
	
	@Override
	public void setAsText(String studentName){
		if(studentName.contains("Mr.") || studentName.contains("Ms.")){
			setValue(studentName);
			
		}else{
			studentName = "Ms." + studentName;
			setValue(studentName);
			
		}
		
	}

}
