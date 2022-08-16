package com.hspedu.ovrride;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/6/28 15:33
 */
public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("swe",21);
        System.out.println(person.say());
        Student student = new Student("sdw",25,05,89.6);
        System.out.println(student.say());

    }
}
