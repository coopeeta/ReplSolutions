import java.util.Scanner;

public class Problem_041 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age of the Child");
        int age=scanner.nextInt();
        switch (age){
            case 1:
                System.out.println("You can Crawl");
                break;
            case 2:
                System.out.println("You can Talk");
            case 3:
                System.out.println("You can Dance");
            case 4:
                System.out.println("You can get  Trouble");
            default:
                System.out.println("I don't know how old you are");
        }
    }
}
