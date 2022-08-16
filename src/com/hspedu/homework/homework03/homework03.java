package com.hspedu.homework.homework03;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/7 15:22
 */
public class homework03 {
        public static void main(String[] args) {
                Teacher teacher = new Teacher("ton", 22, "大数据",2000,1.3);
                teacher.introduce();
                Professor professor = new Professor("sdw", 10, "ssas", 2000, 1.1);
                professor.introduce();
        }
}
