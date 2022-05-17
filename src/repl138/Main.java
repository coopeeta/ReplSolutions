package repl138;

class AnotherClass {
    private static String myMethod1() {
        return  "private";

    }

   static String myMethod2() {
        return  "default";

    }

    protected static String myMethod3() {
        return  "protected";

    }

    public static String myMethod4() {
        return "public";

    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(AnotherClass.myMethod2());
        System.out.println(AnotherClass.myMethod3());
        System.out.println(AnotherClass.myMethod4());
    }
}

