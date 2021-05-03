package Repl190;

import java.util.*;
class Main {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(0);
        list.add(1);
        for(int i=0;i<8;i++){
            list.add(list.get(i)+ list.get(i+1));
        }
        list.forEach(i -> System.out.print(i+" "));
    }
}