package Exceptions;

public class SomeThingWrongException extends Exception{
	
	public SomeThingWrongException() {}
	
	public SomeThingWrongException(String message) {
		super(message);
	}

}