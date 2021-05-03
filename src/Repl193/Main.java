package Repl193;

import java.util.*;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);
        //Integer sum = list.stream().reduce(0, Integer::sum);
        int sum=0;
        for (Integer i:list
             ) {
            sum+=i;
        }
        System.out.println("Result of sum is "+sum);
    }
}