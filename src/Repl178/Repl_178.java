package Repl178;

class Main {
    public static void main(String[] args){
        EncapsulationDemo encapsulation=new EncapsulationDemo("John",30);
        System.out.print("Employee Name: "+encapsulation.getEmpName()+"\n");
        System.out.print("Employee Age: "+encapsulation.getEmpAge());
    }
}