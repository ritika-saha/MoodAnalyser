package com.mood;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------Welcome to Mood Analyzer Program------------");
        String mood="I am in happy mood";
        MoodAnalyser moodOb=new MoodAnalyser(mood);
        mood=moodOb.analyseMood();
        System.out.println(mood);
    }
}