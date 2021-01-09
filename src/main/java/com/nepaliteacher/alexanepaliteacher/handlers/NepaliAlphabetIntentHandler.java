package com.nepaliteacher.alexanepaliteacher.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import java.util.Optional;

public class NepaliAlphabetIntentHandler implements RequestHandler {

  private static final String NEPALI_LETTERS = "क ख ग घ ङ "
      + "च छ ज झ ञ "
      + "ट ठ ड ढ ण "
      + "त थ द ध न "
      + "प फ ब भ म "
      + "य र ल व श ष स "
      + "ह क्ष त्र ज्ञ";

  @Override
  public boolean canHandle(HandlerInput handlerInput) {
    return (handlerInput.matches(intentName("NepaliAlphabetsIntent"))
        || handlerInput.matches(intentName("AMAZON.YesIntent")));
  }

  @Override
  public Optional<Response> handle(HandlerInput handlerInput) {
    String speechText = getNepaliSpeakerVoice()
        + "The letters of the Nepali alphabet are:"
        + "<break time=\"1s\"/> "
        + "क"
        + getPauseForAWhile()
        + "ख"
        + getPauseForAWhile()
        + "ग"
        + getPauseForAWhile()
        + "घ"
        + getPauseForAWhile()
        + "नअ"
        + getPauseForAWhile()
        + "च"
        + getPauseForAWhile()
        + "छ"
        + getPauseForAWhile()
        + "ज"
        + getPauseForAWhile()
        + "झ"
        + getPauseForAWhile()
        + "ञ"
        + getPauseForAWhile()
        + "ट"
        + getPauseForAWhile()
        + "ठ"
        + getPauseForAWhile()
        + "ड"
        + getPauseForAWhile()
        + "ढ"
        + getPauseForAWhile()
        + "ण"
        + getPauseForAWhile()
        + "त"
        + getPauseForAWhile()
        + "थ"
        + getPauseForAWhile()
        + "द"
        + getPauseForAWhile()
        + "ध"
        + getPauseForAWhile()
        + "न"
        + getPauseForAWhile()
        + "प"
        + getPauseForAWhile()
        + "फ"
        + getPauseForAWhile()
        + "ब"
        + getPauseForAWhile()
        + "भ"
        + getPauseForAWhile()
        + "म"
        + getPauseForAWhile()
        + "य"
        + getPauseForAWhile()
        + "र"
        + getPauseForAWhile()
        + "ल"
        + getPauseForAWhile()
        + "व"
        + getPauseForAWhile()
        + "श"
        + getPauseForAWhile()
        + "ष"
        + getPauseForAWhile()
        + "स"
        + getPauseForAWhile()
        + "ह"
        + getPauseForAWhile()
        + "छय"
        + getPauseForAWhile()
        + "त्र"
        + getPauseForAWhile()
        + "ज्ञ"
        + "</lang></voice>";

    return handlerInput.getResponseBuilder()
        .withSpeech(speechText)
        .withSimpleCard("Nepali Teacher", NEPALI_LETTERS)
        .withReprompt("Would you like to learn again?")
        .build();
  }

  private String getNepaliSpeakerVoice() {
    return "<voice name=\"Aditi\"><lang xml:lang=\"en-IN\">";
  }

  private String getPauseForAWhile() {
    return "<break time=\"100ms\"/> ";
  }
}
