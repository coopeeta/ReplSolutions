package Repl191;

import java.util.*;
class Main {
    public static void main(String[] args){
        ArrayList<Boolean>listA=new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);
        ArrayList<Boolean> listB = new ArrayList<>(listA);
        Iterator<Boolean>iterator=listB.iterator();
        while (iterator.hasNext()){
            Boolean element=iterator.next();
            System.out.println(element);
        }
    }
}