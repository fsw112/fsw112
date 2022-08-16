package com.hspedu.Exercise;

/**
 * @author fsw
 * @version 1.0
 * @data 2022/6/24 10:44
 */
public class Computer {
        private String CPU;
        private int memory;
        private int disk;

        public Computer(String CPU,int memory,int disk){
                this.setCPU(CPU);
                this.setMemory(memory);
                this.setDisk(disk);
        }

        public void setCPU(String CPU) {
                this.CPU = CPU;
        }

        public String getCPU() {
                return CPU;
        }

        public void setDisk(int disk) {
                this.disk = disk;
        }


        public int getDisk() {
                return disk;
        }

        public void setMemory(int memory) {
                this.memory = memory;
        }

        public int getMemory() {
                return memory;
        }

        public String getDetail(){
                return "cpu="+CPU+"mermory="+memory+"disk="+disk;
        }
}
