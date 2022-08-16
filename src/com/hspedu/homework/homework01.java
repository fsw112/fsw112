package com.hspedu.homework;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/7 14:43
 */
public class homework01 {
        public static void main(String[] args) {
                Person[] people = new Person[3];
                people[0]=new Person("tom",20,"大数据");
                people[1]=new Person("jek",25,"软件技术");
                people[2]=new Person("rob",22,"撒旦");
                Person temp=null;
                for(int i=0;i<people.length-1;i++){
                        for(int j=0;j< people.length-1-i;j++){
                                if(people[i].getAge()<people[i+1].getAge()){
                                        temp=people[i+1];
                                        people[i+1]=people[i];
                                        people[i]=temp;
                                }
                        }
                }
                System.out.println("排序后的结果");
                for (int i=0;i<people.length;i++){
                        System.out.println(people[i]);
                }
        }
}
class Person{
        private String name;
        private int age;
        private String job;

        public Person(String name, int age, String job) {
                this.name = name;
                this.age = age;
                this.job = job;
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

        public String getJob() {
                return job;
        }

        public void setJob(String job) {
                this.job = job;
        }

        @Override
        public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", job='" + job + '\'' +
                        '}';
        }
}
