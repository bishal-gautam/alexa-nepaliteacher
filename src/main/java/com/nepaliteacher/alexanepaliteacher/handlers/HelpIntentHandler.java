package com.nepaliteacher.alexanepaliteacher.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import java.util.Optional;

public class HelpIntentHandler implements RequestHandler {

  @Override
  public boolean canHandle(HandlerInput handlerInput) {
    return handlerInput.matches(intentName("AMAZON.HelpIntent"));
  }

  @Override
  public Optional<Response> handle(HandlerInput handlerInput) {
    String speechText = "Hello! I am your Nepali Teacher. Try saying teach me Nepali alphabets.";
    return handlerInput.getResponseBuilder()
        .withSpeech(speechText)
        .withSimpleCard("Nepali Teacher", speechText)
        .withReprompt(speechText)
        .build();
  }
}
