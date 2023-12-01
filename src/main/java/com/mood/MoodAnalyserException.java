package com.mood;

public class MoodAnalyserException extends Exception {

    //handling exception
    public MoodAnalyserErr err;

    public MoodAnalyserException(MoodAnalyserErr e) {
        super(e.getMessage());
        this.err = e;
    }

    public MoodAnalyserErr getError(){
        return err;
    }
    
}
