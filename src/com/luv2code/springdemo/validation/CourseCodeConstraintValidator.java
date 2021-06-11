package com.luv2code.springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

//	private String coursePrefix;				//use to validate a single string
	private String[] coursePrefix;			//use to validate many string
	
	@Override
	public void initialize(CourseCode thecoursecode) {
		coursePrefix=thecoursecode.value();
	}
	
	
	
//	this method is used to chech tha isvalid of a single string
//	@Override
//	public boolean isValid(String thefrontendinput, ConstraintValidatorContext theConstraintValidatorContext) {
//		
//		if (thefrontendinput !=null) {
//			return thefrontendinput.startsWith(coursePrefix);
//		}
//		
//		return false; 
//		
//	}
	
//	this method is used to check isValid of many string
	@Override
	public boolean isValid(String thefrontendinput, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result = false;
        
        if (thefrontendinput != null) {
            
            //
            // loop thru course prefixes
            //
            // check to see if code matches any of the course prefixes
            //
            for (String tempPrefix : coursePrefix) {
                result = thefrontendinput.startsWith(tempPrefix);
                
                // if we found a match then break out of the loop
                if (result) {
                    break;
                }
            }
        }
        else {
            result = true;
        }
        
        return result;
	}

}
