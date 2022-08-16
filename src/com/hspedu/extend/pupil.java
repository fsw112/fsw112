package com.hspedu.extend;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/6/20 15:24
 */
public class pupil extends Student{
        public void test(){
                System.out.println("小学生" +name+ "正在考试"+getN4());
                calltest400();
        }
        public pupil(){
                super("ass",20);
                System.out.println("pupil被调用");
        }
}
