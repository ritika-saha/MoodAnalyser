package com.mood;

public class MoodAnalyser {

    public String mood;

    public MoodAnalyser(String data){
        this.mood=data;
    }

    public String analyseMood(){
        try{

            if(mood.toLowerCase().contains("happy")){
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
