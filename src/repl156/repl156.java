package repl156;

class Main {
    public static void main(String[] args) {
        B obj = new B(10);
        B obj2 = new B(20);
        obj2.display();
        obj.display();

    }
}

class A {
    int i;

    A(int i) {
        this.i = i;
    }

    public void display() {
        System.out.println(this.i);
    }
}

class B extends A {
    int i;

    B(int i) {
        super(i);
    }

}



