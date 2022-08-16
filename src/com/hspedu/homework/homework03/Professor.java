package com.hspedu.homework.homework03;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/7 15:10
 */
public class Professor extends Teacher{
        public Professor(String name, int age, String post, double salary, double grade) {
                super(name, age, post, salary, grade);
        }

        @Override
        public void introduce() {
                super.introduce();
        }
}
