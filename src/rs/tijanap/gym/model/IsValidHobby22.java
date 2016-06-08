/**
 * 
 */
package rs.tijanap.gym.model;

/**
 * @author tijana.pavicic
 * 22cas custom Form Validation 
 *annotation with parameters in anotation
 */

	import java.lang.annotation.Documented;
	import java.lang.annotation.ElementType;
	import java.lang.annotation.Retention;
	import java.lang.annotation.RetentionPolicy;
	import java.lang.annotation.Target;

	import javax.validation.Constraint;
	import javax.validation.Payload;
	 
	@Documented
	@Constraint(validatedBy = HobbyValidator22.class)
	@Target( { ElementType.FIELD })
	@Retention(RetentionPolicy.RUNTIME)
	public @interface IsValidHobby22 {
		
		String listOfValidHobbies() default "Music|Football|Cricket|Hockey";
		
		 String message() default "Please provide a valid Hobby; " +
		    		"accepted hobbies are - Music, Football, Cricket and Hockey ( choose anyone )";
		      
		    Class<?>[] groups() default {};
		      
		    Class<? extends Payload>[] payload() default {};

	}
