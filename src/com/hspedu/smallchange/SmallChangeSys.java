package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/6 14:38
 */
public class SmallChangeSys {
        public static void main(String[] args) {
                boolean tool = true;
                Scanner scanner = new Scanner(System.in);
                String key = "";
                String details = "-----------零钱通明细-----------";
                String note = "";
                double money = 0;
                double balance = 0;
                Date data = null;
                SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm");
                do {
                        System.out.println("\n============零钱通菜单============");
                        System.out.println("\t\t\t1 零钱通明细");
                        System.out.println("\t\t\t2 收益入账");
                        System.out.println("\t\t\t3 消费");
                        System.out.println("\t\t\t4 退出系统");
                        System.out.println("请选择(1-4)");
                        key = scanner.next();
                        switch (key) {
                                case "1":
                                        System.out.println(details);
                                        break;
                                case "2":
                                        System.out.print("收益入账金额：\t");
                                        money = scanner.nextDouble();
                                        if(money<=0){
                                                System.out.println("收入金额有误");
                                                break;
                                        }
                                        balance+=money;
                                        data=new Date();
                                        System.out.print(sdf.format(data));
                                        details += "\n收益入账\t"+money+"\t"+sdf.format(data)+"\t"+balance;
                                        break;
                                case "3":
                                        System.out.print("消费金额");
                                        money = scanner.nextDouble();
                                        if(money<=0||money>balance){
                                                System.out.println("你的消费金额应该在0-"+balance);
                                                 break;
                                        }
                                        System.out.print("消费说明");
                                        note = scanner.next();
                                        balance -=money;
                                        data = new Date();
                                        System.out.println(sdf.format(data));
                                        details += "\n"+note+"\t-"+money+"\t"+sdf.format(data)+"\t"+balance;
                                        break;
                                case "4":
                                        String choice = "";
                                        while (true){
                                                System.out.println("是否要退出y/n");
                                                choice = scanner.next();
                                                if("y".equals(choice)||"n".equals(choice)){
                                                        break;
                                                }
                                        }
                                        if(choice.equals("y")){
                                                tool=false;
                                        }
                                        break;
                                default:
                                        System.out.println("输入错误");
                        }
                }while (tool);
                System.out.println("退出了系统");
        }
}
