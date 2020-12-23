package com.nepaliteacher.alexanepaliteacher.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import java.util.Optional;

public class NepaliAlphabetIntentHandler implements RequestHandler {

  @Override
  public boolean canHandle(HandlerInput handlerInput) {
    return false;
  }

  @Override
  public Optional<Response> handle(HandlerInput handlerInput) {
    String speechText = "Letters of the Nepali alphabets are:"
        + "ka "
        + "kha "
        + "ga "
        + "gha "
        + "ṅa "
        + "ca "
        + "cha "
        + "ja "
        + "jha "
        + "ña "
        + "ta "
        + "tha "
        + "da "
        + "dha "
        + "ṇa "
        + "pa "
        + "pha "
        + "ba "
        + "bha "
        + "ma "
        + "ya "
        + "ra "
        + "la "
        + "va "
        + "sa "
        + "shha "
        + "sha "
        + "ha "
        + "ksa "
        + "tra "
        + "jna ";

    return handlerInput.getResponseBuilder()
        .withSpeech(speechText)
        .withSimpleCard("Nepali Teacher", speechText)
        .withReprompt(speechText)
        .build();
  }
}
