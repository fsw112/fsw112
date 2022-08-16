package com.hspedu.Exercise;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/6/24 10:52
 */
public class PC extends Computer{
        private String brand;
        public PC(String CPU,int mermory,int disk,String brand){
                super(CPU,mermory,disk);
                this.brand=brand;
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }

        public String getBrand() {
                return brand;
        }
        public void printinfo(){
                System.out.println(getDetail()+"brand="+brand);
        }
}
