package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @Test
    public void mood_Is_Sad_Return_Sad() {
        MoodAnalyser m1 = new MoodAnalyser("i am in sad mood");
        String mood = m1.analyseMood();
        assertSame("SAD", mood);
    }

    @Test
    public void mood_Is_Happy_Return_Happy() {
        MoodAnalyser m1 = new MoodAnalyser("i am in Any mood");
        String mood = m1.analyseMood();
        assertSame("HAPPY", mood);


    }
}