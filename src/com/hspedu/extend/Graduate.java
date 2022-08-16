package com.hspedu.extend;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/6/20 15:26
 */
public class Graduate extends Student{
        public void test(){
                System.out.println("大学生" +name+ "正在考试"+getN4());
        }
        public Graduate(){
                super("wer",21);
                System.out.println("Graduate被调用");
        }
}
