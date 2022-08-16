package com.hspedu.encap;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/6/19 16:08
 */
public class Account {
        private String name;
        private double balance;
        private String pwd;

        public Account() {
        }

        public Account(String name, double balance, String pwd) {
                this.setName(name);
                this.setPwd(pwd);
                this.setBalance(balance);
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                if(name.length()>=2&&name.length()<=6){
                        this.name = name;
                }else {
                        this.name="小米";
                }
        }

        public double getBalance() {
                return balance;
        }

        public void setBalance(double balance) {
                if(balance>20){
                        this.balance = balance;
                }else{
                        this.balance=0;
                }
        }

        public String getPwd() {
                return pwd;
        }

        public void setPwd(String pwd) {
                if(pwd.length()>=6){
                        this.pwd=pwd;
                }else {
                        this.pwd="123456";
                }
        }

        public void info(){
                System.out.println("账户信息 name="+name+"密码="+pwd+"余额="+balance);
        }
}
