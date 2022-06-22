package com.Exception.SelfException;

public class Teacher{
    public static void checkScore(int score) throws ScoreException{
        if(score<0 || score>100){
            throw new ScoreException("分数异常");
        }else{
            System.out.println("分数正常");
        }
    }
}
