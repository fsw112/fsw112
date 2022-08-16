package com.hspedu.poly.polyparameter;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/7/1 15:24
 */
public class PolyParameter {
        public static void main(String[] args) {
                Worker dsw = new Worker("dsw", 2500);
                Manager qwe = new Manager("qwe", 2000, 21000);
                PolyParameter polyParameter = new PolyParameter();
                polyParameter.showEmpAnnual(dsw);
                polyParameter.showEmpAnnual(qwe);
                polyParameter.testWork(dsw);
                polyParameter.testWork(qwe);
        }
        public void showEmpAnnual(Employee e){
                System.out.println(e.getAnnual());
        }

        public void testWork(Employee e){
                if(e instanceof Worker){
                        ((Worker) e).work();
                }else if(e instanceof Manager){
                        ((Manager) e).manager();
                }else{
                        System.out.println("不做处理");
                }
        }
}
