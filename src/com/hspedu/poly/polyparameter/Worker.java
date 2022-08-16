package com.hspedu.poly.polyparameter;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/1 15:14
 */
public class Worker extends Employee{
        public Worker(String name, double salary) {
                super(name, salary);
        }

        public void work(){
                System.out.println("普通员工"+getName()+"is working");
        }

        @Override
        public double getAnnual() {
                return super.getAnnual();
        }
}
