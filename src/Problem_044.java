import java.util.Scanner;

public class Problem_044 {
    public static void main(String[] args) {
        System.out.println("Please enter your favorite car make");
        Scanner scanner=new Scanner(System.in);
        String carModel=scanner.next();
        switch (carModel){
            case "BMW":
                System.out.println("Your favorite car is german car");
                break;
            case "Toyota":
                System.out.println("Your favorite car is japanese car");
                break;
            case "Maserati":
                System.out.println("Your favorite car is italian car");
                break;
            default:
                System.out.println("Your favorite car is unknown");

        }
    }
}
