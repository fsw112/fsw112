package com.hspedu.poly.polyparameter;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/1 15:11
 */
public class Employee {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
        }

        public double getAnnual(){
                return 12*salary;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public double getSalary() {
                return salary;
        }

        public void setSalary(double salary) {
                this.salary = salary;
        }
}
