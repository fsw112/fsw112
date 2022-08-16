package com.hspedu.poly.polyarr;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/1 14:35
 */
public class Teacher extends Person{

        private double salary;

        public Teacher(String name, int age, double salary) {
                super(name, age);
                this.salary = salary;
        }

        public double getSalary() {
                return salary;
        }

        public void setSalary(double salary) {
                this.salary = salary;
        }

        @Override
        public String say() {
                return super.say()+"salary="+salary;
        }

        public void teacher(){
                System.out.println("教师"+getName()+"正在教课");
        }
}
