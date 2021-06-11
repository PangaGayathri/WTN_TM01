package com.wipro.eb.exception;

@SuppressWarnings("serial")
public class InvalidConnectionException extends Exception {
	public String toString()
	{
		return "Invalid ConnectionType";
	}
	public InvalidConnectionException()
	{
		super();
	}

}
