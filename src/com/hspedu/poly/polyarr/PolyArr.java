package com.hspedu.poly.polyarr;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/1 14:36
 */
public class PolyArr {
        public static void main(String[] args) {
                Person[] persons = new Person[5];
                persons[0]=new Person("asd",20);
                persons[1]=new Student("as",21,89.6);
                persons[2]=new Student("ds",18,90);
                persons[3]=new Teacher("dsw",25,19000);
                persons[4]=new Teacher("dcw",24,21000);

                for (int i=0;i< persons.length;i++){
                        System.out.println(persons[i].say());//动态绑定机制
                        if(persons[i] instanceof Student){
                                Student student =(Student)persons[i];
                                student.student();
                                //((Student) persons[i]).student();
                        }else if(persons[i] instanceof Teacher){
                                Teacher teacher = (Teacher)persons[i];
                                teacher.teacher();
                        }else if(persons[i] instanceof Person){

                        }else {
                                System.out.println("输入有误");
                        }
                }
        }
}
