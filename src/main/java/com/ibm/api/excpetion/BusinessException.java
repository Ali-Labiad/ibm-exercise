package com.ibm.api.excpetion;

public class BusinessException extends Exception {

    String message;

    public BusinessException(String message) {
	super();
	this.message = message;
    }

    @Override
    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

}
