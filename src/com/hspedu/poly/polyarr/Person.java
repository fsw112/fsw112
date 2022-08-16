package com.hspedu.poly.polyarr;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/1 14:28
 */
public class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
                this.name = name;
                this.age = age;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String say(){
                return name+"\t"+age+"\t";
        }
}
