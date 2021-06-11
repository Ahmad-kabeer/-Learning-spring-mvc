package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.validation.CourseCode;

//we use this class for validation
public class CustomerModel {
	
	//adding validation for integer value with min and max size
	@NotNull(message="is required")
	@Min(value=0, message="must be more than and equal to 0")
	@Max(value=10, message="must be less than and equal to 10")
	private Integer customerAmout;

	//adding validation for not null name
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String firstName;
	
	private String lastName;
	
	//adding rule for regular expression(postal should be in 6 digit in B/t a to z and A to Z)
	@Pattern(regexp="^[a-zA-Z0-9]{6}", message="only 6 digit alpha numeric value")
	private String postalcode;

	//going to create a new field to test our own annotation CourseCode
//	@CourseCode						//here it will take the default value as LUV and message "must start with LUV"
	@CourseCode(value={"ICS", "LUV"}, message="must start with ICS or LUV")						
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Integer getCustomerAmout() {
		return customerAmout;
	}

	public void setCustomerAmout(Integer customerAmout) {
		this.customerAmout = customerAmout;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	
	
}
