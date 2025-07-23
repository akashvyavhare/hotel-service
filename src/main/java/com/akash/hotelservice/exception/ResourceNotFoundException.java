package com.akash.hotelservice.exception;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException(){
		super("Rosource Not Found..!");
	}
	
	public ResourceNotFoundException(String massage)
	{
		super(massage);
	}

}
