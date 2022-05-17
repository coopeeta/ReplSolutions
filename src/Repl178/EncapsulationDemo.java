package Repl178;

class EncapsulationDemo{
    private String empName;
    private int empAge;

    EncapsulationDemo(String empName,int empAge){
        setEmpName(empName);
        setEmpAge(empAge);
    }
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