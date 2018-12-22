package com.sou.lambda.demo;

public class ResponseClass {
	String greetings;
	String transactionID;
	String error;
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

	public ResponseClass(String greetings) {
		this.greetings = greetings;
	}

	public ResponseClass() {
	}

	@Override
	public String toString() {
		return "ResponseClass [greetings=" + greetings + ", transactionID=" + transactionID + ", error=" + error + "]";
	}

}