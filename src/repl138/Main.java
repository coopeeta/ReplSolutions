package repl138;

class AnotherClass {
    private String myMethod1() {
        final String aPrivate = "private";
        return aPrivate;
    }

    String myMethod2() {
        final String aDefault = "default";
        return aDefault;
    }

    protected String myMethod3() {
        final String aProtected = "protected";
        return aProtected;
    }

    public String myMethod4() {
        final String aPublic = "public";
        return aPublic;
    }
}

class Main {
    public static void main(String[] args) {
        AnotherClass obj = new AnotherClass();
        System.out.println(obj.myMethod2());
        System.out.println(obj.myMethod3());
        System.out.println(obj.myMethod4());
    }
}

