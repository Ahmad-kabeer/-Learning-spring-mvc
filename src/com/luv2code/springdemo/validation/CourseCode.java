package com.luv2code.springdemo.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ FIELD, METHOD })
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
//@Target({ElementType.METHOD, ElementType.FIELD}) 				//it is where you will use it
@Retention(RetentionPolicy.RUNTIME)								//use it at runtime
public @interface CourseCode {
	
	//define default course code
//	public String value() default "LUV";				//use to validate a single string
	public String[] value() default {"LUV","KHAN"};		//use to validate many string
	
	//define default eroor message
	public String message() default "must start with LUV";

	//define default groups
	public Class<?>[] groups() default {}; 
	
	//define default payload(give additional details of the error)
	public Class<? extends Payload>[] payload() default {};

}

