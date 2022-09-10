package com.Libary.exceptionhandling;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus (value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException {

	private static final long serialVersionUID =1L;
	private String resourceName;
	private String fieldName;
	private Object fieldValue;
	
	public String getResourceName() {
		return resourceName;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public Object getFieldValue() {
		return fieldValue;
	}
	
	public ResourceNotFoundException(String resourceName,String fieldName,Object fieldValue) {
		
	super();
	this.resourceName =resourceName;
	this.fieldName =fieldName;
	this.fieldValue = fieldValue;
	}
	
}

