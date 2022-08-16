package com.hspedu.object;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/1 15:44
 */
//==如果判断引用类型，则是判断地址是否相等
public class Equals {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        B obj = a;
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(obj==c);
    }
}

class B {}
class A extends B{}