import java.util.Scanner;

public class Problem_36 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two strings");
        String string1=scanner.next();
        String string2=scanner.next();
        System.out.println("Please enter two numbers");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        if(string1.equals(string2)&&number1==number2){
            System.out.println("AND");
        }else if(string1.equals(string2) || number1==number2){
            System.out.println("OR");
        }else {
            System.out.println("NONE");
        }

    }
}
