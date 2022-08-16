package com.hspedu.object;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/2 14:14
 */
public class EqualsExercise {
        public static void main(String[] args) {
                Person person1 = new Person("jack", 20, '男');
                Person person2 = new Person("jack", 20, '男');
                System.out.println(person1.equals(person2));
        }

}
class Person{
        private String name;
        private int age;
        private char gender;

        public Person(String name, int age, char gender) {
                this.name = name;
                this.age = age;
                this.gender = gender;
        }

        public boolean equals(Object obj){
                if(this==obj){
                        return true;
                }
                if(obj instanceof Person){
                        Person p = (Person) obj;
                        return this.name.equals(p.name)&&this.age==p.age&&this.gender==p.gender;
                }else {
                        return false;
                }
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

        public char getGender() {
                return gender;
        }

        public void setGender(char gender) {
                this.gender = gender;
        }
}
