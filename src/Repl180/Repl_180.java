package Repl180;

class EncapsulationDemo{
    private String empName="John";
    private int empAge=30;



    public String getEmpName(){
        return this.empName;
    }
    public int getEmpAge(){
        return this.empAge;
    }

}
class Main {
    public static void main(String[] args){
        EncapsulationDemo encapsulation=new EncapsulationDemo();
        System.out.println("Employee Name: "+encapsulation.getEmpName());
        System.out.print("Employee Age: "+encapsulation.getEmpAge());
    }
}