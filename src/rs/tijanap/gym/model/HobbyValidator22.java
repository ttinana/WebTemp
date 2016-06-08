package rs.tijanap.gym.model;

/**
 * @author tijana.pavicic
 *
 */

	import javax.validation.ConstraintValidator;
	import javax.validation.ConstraintValidatorContext;
	 
	public class HobbyValidator22 implements ConstraintValidator<IsValidHobby22, String> {
		
		private String listOfValidHobbies;
	 
	    @Override
	    public void initialize(IsValidHobby22 isValidHobby22) { 
	    	this.listOfValidHobbies= isValidHobby22.listOfValidHobbies();
	    }
	 
	    @Override
	    public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
	        
	    	if(studentHobby == null) {
	    		
	            return false;
	        }
	        
	    	if (studentHobby.matches(listOfValidHobbies)) {
	    		
	    		return true;
	    	} else {
	    		
	    		return false;
	    	}
	    }
	 
	}