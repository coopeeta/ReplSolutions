package Repl196;

import java.util.*;
class Main {
    public static void main(String[] args) {
        HashSet<String> mySet=new HashSet<>();
        mySet.add("third");
        mySet.add("first");
        mySet.add("second");
        System.out.println(mySet);
        mySet.clear();
        System.out.println(mySet);
    }
}