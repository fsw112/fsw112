package com.hspedu.ovrride;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/6/28 15:35
 */
public class Student extends Person{
        private int id;
        private double score;

        public Student(String name, int age, int id, double score) {
                super(name, age);
                this.id = id;
                this.score = score;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public double getScore() {
                return score;
        }

        public void setScore(double score) {
                this.score = score;
        }

        public String say(){
                return super.say()+"id："+id+"成绩："+score;
        }
}
