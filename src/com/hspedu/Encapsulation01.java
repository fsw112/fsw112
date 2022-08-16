package com.hspedu;

import java.util.Scanner;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/6/17 15:08
 */
public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(20);
        person.setSalary(30000);
        System.out.println(person.info());
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        if(key==123) {
            System.out.println(person.getSalary());
        }else {
            System.out.println("无法查看");
        }
        Person smith = new Person("smith", 20, 30000);
        System.out.println("smith的信息如下");
        System.out.println(smith.info());
    }
}
class Person{
    public String name;
    private int age;
    private double salary;

    public Person(){

    }
    public Person(String name,int age,double salary){
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2&&name.length()<=6){
            this.name = name;
        }else {
            System.out.println("输入的名字不符合，默认名字");
            this.name="tom";
        }
    }

    public double getSalary() {
            return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info(){
        return "信息为名字="+name+"年龄="+age+"薪水="+salary;
    }
}
