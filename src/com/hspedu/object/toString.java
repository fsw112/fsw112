package com.hspedu.object;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/5 11:13
 */
public class toString {
        public static void main(String[] args) {
                Monster monster = new Monster("monest", "大桂山", 2500);
                System.out.println(monster);
        }
}
class Monster{
        private String name;
        private String job;
        private double sal;

        public Monster(String name, String job, double sal) {
                this.name = name;
                this.job = job;
                this.sal = sal;
        }

        @Override
        public String toString() {
                return "Monster{" +
                        "name='" + name + '\'' +
                        ", job='" + job + '\'' +
                        ", sal=" + sal +
                        '}';
        }
}
