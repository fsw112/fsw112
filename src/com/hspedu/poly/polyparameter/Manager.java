package com.hspedu.poly.polyparameter;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/1 15:18
 */
public class Manager extends Employee{
        private double bonus;

        public Manager(String name, double salary, double bonus) {
                super(name, salary);
                this.bonus = bonus;
        }

        public void manager(){
                System.out.println("经理"+getName()+"正在管理人员");
        }

        public double getBonus() {
                return bonus;
        }

        public void setBonus(double bonus) {
                this.bonus = bonus;
        }

        @Override
        public double getAnnual() {
                return super.getAnnual()+bonus;
        }
}
