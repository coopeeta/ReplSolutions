package repl136;

public class Main {
    private static void privateMethod() {
        System.out.println("This is Private Method");
    }

    void defaultMethod() {
        System.out.println("This is Default Method");
    }

    protected static void protectedMethod() {
        System.out.println("This is Protected Method");
    }

    public void publicMethod() {
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        privateMethod();
        obj.defaultMethod();
        protectedMethod();
        obj.publicMethod();
    }
}

