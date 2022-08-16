package com.hspedu.encap;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/6/19 16:42
 */
public class AccountTest {
        public static void main(String[] args) {
                Account account = new Account();
                account.setName("qhb");
                account.setBalance(30);
                account.setPwd("226878");
                account.info();
        }
}
