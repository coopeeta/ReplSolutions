package Repl199;

import java.util.*;
class Main {
    public static void main(String[] args) {
        LinkedHashSet <String> mySet = new LinkedHashSet<>();
        mySet.add("null");
        mySet.add("Sohil");
        mySet.add("Diego");
        mySet.add("Alijon");
        mySet.add("Asel");
        mySet.add("Sumair");
        for (String element:mySet){
            System.out.println(element);
        }
        Iterator<String>iterator=mySet.iterator();
        while (iterator.hasNext()){
            String element=iterator.next();
            System.out.println(element);
        }
    }
}
