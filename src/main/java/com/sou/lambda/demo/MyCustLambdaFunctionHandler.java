package com.sou.lambda.demo;

import java.util.Date;
import java.util.UUID;

import org.json.simple.parser.JSONParser;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MyCustLambdaFunctionHandler implements RequestHandler<RequestClass, ResponseClass> {

	JSONParser parser = new JSONParser();

	public ResponseClass handleRequest(RequestClass input, Context context) {

		LambdaLogger logger = context.getLogger();
		logger.log("Loading Java Lambda handler of ProxyWithStream");
		ResponseClass lambdaResponse = new ResponseClass();
		try {
			lambdaResponse.setGreetings("Hello " + input.getFirstName() + " Response Time : " + input.getLastName() + " Response Time : " + new Date());
			lambdaResponse.setTransactionID(UUID.randomUUID().toString());
		} catch (Exception e) {
			e.printStackTrace();
			lambdaResponse.setError(e.getMessage());
		}
		context.getLogger().log("Response 1: " + lambdaResponse);
		return lambdaResponse;
	}

}
