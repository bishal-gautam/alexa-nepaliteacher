package com.nepaliteacher.alexanepaliteacher.handlers;

import static com.amazon.ask.request.Predicates.requestType;
import static java.lang.System.out;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.RequestEnvelope;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.SessionEndedRequest;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import java.util.Optional;

public class SessionEndedRequestHandler implements RequestHandler {

  @Override
  public boolean canHandle(HandlerInput handlerInput) {
    return handlerInput.matches(requestType(SessionEndedRequest.class));
  }

  @Override
  public Optional<Response> handle(HandlerInput handlerInput) {
    return handlerInput.getResponseBuilder().build();
  }
}
