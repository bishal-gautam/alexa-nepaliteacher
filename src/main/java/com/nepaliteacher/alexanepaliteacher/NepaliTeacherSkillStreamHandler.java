package com.nepaliteacher.alexanepaliteacher;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.nepaliteacher.alexanepaliteacher.handlers.SessionEndedRequestHandler;
import com.nepaliteacher.alexanepaliteacher.handlers.TerminateIntentHandler;
import com.nepaliteacher.alexanepaliteacher.handlers.NepaliAlphabetIntentHandler;
import com.nepaliteacher.alexanepaliteacher.handlers.FallBackIntentHandler;
import com.nepaliteacher.alexanepaliteacher.handlers.HelpIntentHandler;
import com.nepaliteacher.alexanepaliteacher.handlers.LaunchRequestHandler;

public class NepaliTeacherSkillStreamHandler extends SkillStreamHandler {

  public NepaliTeacherSkillStreamHandler() {
    super(allSkillsRequiredForNepaliTeacher());
  }

  private static Skill allSkillsRequiredForNepaliTeacher() {
    return Skills.standard().addRequestHandlers(
        new TerminateIntentHandler(),
        new NepaliAlphabetIntentHandler(),
        new HelpIntentHandler(),
        new LaunchRequestHandler(),
        new SessionEndedRequestHandler(),
        new FallBackIntentHandler())
        .withSkillId("nepali-teacher-alexa-application-id")
        .build();
  }

}
