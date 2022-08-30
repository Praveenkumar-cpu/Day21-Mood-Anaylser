package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @Test
    public void analyseSadMood() {
        MoodAnalyser mood = new MoodAnalyser();
        mood.setMessage("I am in Sad Mood");
        String actualResult = mood.analyseMood();
        Assert.assertEquals("SAD", actualResult);
    }
    @Test
    public void analyseAnyMood() {
        MoodAnalyser mood1 = new MoodAnalyser();
        mood1.setMessage("I am in any Mood");
        String actualResult = mood1.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }

}
