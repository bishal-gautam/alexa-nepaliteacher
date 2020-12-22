package com.nepaliteacher.alexanepaliteacher.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import java.util.Optional;

public class FallBackIntentHandler implements RequestHandler {

  @Override
  public boolean canHandle(HandlerInput handlerInput) {
    return handlerInput.matches(intentName("AMAZON.FallbackIntent"));
  }

  @Override
  public Optional<Response> handle(HandlerInput handlerInput) {
    String speechText = "Sorry, I don't know that. Would you like to learn from Nepali Teacher?";
    return handlerInput.getResponseBuilder()
        .withSpeech(speechText)
        .withSimpleCard("Nepali Teacher", speechText)
        .withReprompt(speechText)
        .build();
  }
}
