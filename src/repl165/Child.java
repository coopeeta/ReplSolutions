package repl165;

class Child extends Parent{
    public void Public_Method(){
        System.out.println("I am a child public method");
    }
    protected void Protected_Method(){
        System.out.println("I am a child protected method");
    }
    void Default_Method(){
        System.out.println("I am a child default method");
    }
    private void Private_Method(){
        System.out.println("I am a child private method");
    }
}