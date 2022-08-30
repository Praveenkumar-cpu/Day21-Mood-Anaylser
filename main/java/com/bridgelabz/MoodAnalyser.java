package com.bridgelabz;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser() {
        this.message = null;
    }


    public MoodAnalyser(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e) {
            return "HAPPY";
        }
    }


    public static void main(String args[]) {
        System.out.println("Mood Analyser");

        MoodAnalyser mood = new MoodAnalyser();

        mood.setMessage("I am Happy");
        System.out.println(mood.analyseMood());

        mood.setMessage("I am Sad");
        System.out.println(mood.analyseMood());

        mood.setMessage(null);
        System.out.println(mood.analyseMood());

    }
}