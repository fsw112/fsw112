package com.hspedu.extend;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/6/20 15:21
 */
public class Student {
        public String name;
        public int age;
        public double score;
        private int n4;

        public Student(String name,int age){
                System.out.println("父类被调用");
        }

        public int getN4() {
                return n4;
        }

        public void setScore(double score) {
                this.score = score;
        }

        public void showinfo(){
                System.out.println("学生" +name+ "年龄" +age+ "成绩" +score);
        }

        private void test400(){
                System.out.println("test400");
        }

        public void calltest400(){
                test400();
        }
}
