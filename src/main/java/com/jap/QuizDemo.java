package com.jap;

public class QuizDemo {

    //Handle the NumberFormatException
    public String highestScore(String[] nameOfSchool, String[] scores) {

        int[] score = new int[scores.length];
        int maxat;
        try{
            for (int i = 0; i < score.length; i++){
                score[i] = Integer.parseInt(scores[i]);
            }
            int max = score[0];
            maxat = 0;
            for (int i = 0; i < scores.length; i++){
                if (max < score[i]){
                    max = score[i];
                    maxat = i;
                }
            }
        }catch (NumberFormatException e){
            return e.toString();
        }
        //return the school name which has got the highest score in quiz
        return nameOfSchool[maxat];
    }

    //convert all the names in uppercase
    public String[] convertAllNamesToCapital(String name[]) {
        String upperCase[] = new String[0];
        //Handle the NullPointerException
        try {
            for (int i = 0; i < name.length; i++) {
                upperCase[i] = name[i].toUpperCase();
            }
        } catch (Exception e) {

        }
        return upperCase;
    }
}






