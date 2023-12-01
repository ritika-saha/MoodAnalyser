package com.mood;

public class MoodAnalyser {

    public String mood;

    //default constructor
    public MoodAnalyser() {
        this.mood = "";
    }

    //parameterized constructor
    public MoodAnalyser(String data){
        this.mood=data;
    }

    public String analyseMood() throws MoodAnalyserException {

        //exception handling with try catch block
        try{

            if(mood == null || mood.isEmpty()){
                throw new MoodAnalyserException(MoodAnalyserErr.EMPTY_MOOD);
            }
            else if(mood.toLowerCase().contains("happy") || mood.toLowerCase().contains("any")){
                return MoodStatus.HAPPY.toString();
            }else if(mood.toLowerCase().contains("sad")){
                return MoodStatus.SAD.toString();
            }
            else{
                throw new MoodAnalyserException(MoodAnalyserErr.INVALID_MOOD);
            }

        }catch(MoodAnalyserException e){
            throw e;

        }
    }

     public enum MoodStatus{
        HAPPY,
        SAD
    }
}
