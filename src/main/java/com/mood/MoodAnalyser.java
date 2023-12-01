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

    public String analyseMood(){

        //exception handling with try catch block
        try{

            if(mood == null || mood.toLowerCase().contains("happy") || mood.toLowerCase().contains("any")){
                return "HAPPY";
            }else if(mood.toLowerCase().contains("sad")){
                return "SAD";
            }else{
                throw new MoodAnalyserException("Exception occured! Don't know current mood");
            }

        }catch(MoodAnalyserException e){
            return e.getMessage();

        }
    }
}
