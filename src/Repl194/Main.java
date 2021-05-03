package Repl194;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        //countries.removeIf(x-> x.startsWith("A")); using lambdas
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }

        System.out.print(countries);
    }
}
