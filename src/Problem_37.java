import java.util.Scanner;

public class Problem_37 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean isThirsty=scanner.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean isSleepy=scanner.nextBoolean();
        if(isThirsty &&!isSleepy){
            System.out.println("Looks like you need to drink water");
        }else if(isThirsty){
            System.out.println("Looks like you need to drink coffee");

        }else if(isSleepy){
            System.out.println("Looks like you need to drink tea");

        }else {
            System.out.println("Looks like you need to drink nothing");

        }
    }
}
