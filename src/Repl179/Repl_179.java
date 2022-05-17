package Repl179;

class EncapsulationDemo{
   private String empName;
    private int empAge;
    public void setEmpName(String empName){
        if(empName.length()>1){
            this.empName=empName;
        }else{
            System.out.println("Name must be provided");
        }
    }
    public void setEmpAge(int empAge){
        if(empAge>18){
            this.empAge=empAge;
        }else{
            System.out.println("Employee must be at least 18");
        }
    }
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
        encapsulation.setEmpName("Mario");
        encapsulation.setEmpAge(32);
        System.out.print("Employee Name: "+encapsulation.getEmpName()+"\n");
        System.out.print("Employee Age: "+encapsulation.getEmpAge());
    }
}