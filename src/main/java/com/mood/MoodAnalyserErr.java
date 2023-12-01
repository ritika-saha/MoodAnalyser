package com.mood;

public enum MoodAnalyserErr {
    EMPTY_MOOD("Mood should not be empty or null"),
    INVALID_MOOD("Invalid mood provided");

    public String message;

    MoodAnalyserErr(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
    
}
