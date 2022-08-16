package com.hspedu.poly.polyarr;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/1 14:32
 */
public class Student extends Person{

    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say()+"score="+score;
    }

    public void student(){
        System.out.println("学生"+getName()+"正在学java。。。");
    }
}
