package Repl195;

import java.util.*;
class Main {
    public static void main(String[] args) {
        HashSet<Integer> mySet=new HashSet<>();
        mySet.add(111);
        mySet.add(111);
        mySet.add(111);
        mySet.add(999);
        mySet.add(999);
        mySet.add(999);
      //  mySet.forEach(System.out::println); using lambdas
        for (Integer i:mySet
             ) {
            System.out.println(i);
        }
    }
}