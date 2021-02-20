import java.util.Scanner;

public class Problem_38 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean isWeekend=scanner.nextBoolean();
        if(!isWeekend){
            System.out.println("Today you will be learning manual testing");
        }else {
            System.out.println("Today you will be learning Java");
        }
    }
}
