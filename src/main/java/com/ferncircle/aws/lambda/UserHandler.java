package com.ferncircle.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ferncircle.aws.lambda.model.Request;
import com.ferncircle.aws.lambda.model.Response;

public class UserHandler implements RequestHandler<Request, Response> {

	public Response handleRequest(Request request, Context context) {
		String greetingString = String.format("Hello %s %s.", request.getFirstName(), request.getLastName());
		return new Response(greetingString);
	}
}
