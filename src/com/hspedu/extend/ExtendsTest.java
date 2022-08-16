package com.hspedu.extend;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/6/20 15:27
 */
public class ExtendsTest {
    public static void main(String[] args) {
        pupil pupil = new pupil();
        pupil.name="阿松大";
        pupil.age=20;
        pupil.test();
        pupil.setScore(70);
        pupil.showinfo();


        Graduate graduate = new Graduate();
        graduate.name="是否";
        graduate.age=21;
        graduate.test();
        graduate.setScore(90);
        graduate.showinfo();
    }
}
