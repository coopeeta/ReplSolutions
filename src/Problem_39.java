import java.util.Scanner;

public class Problem_39 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your mark");
        int marks = scanner.nextInt();
        if(marks>=1 && marks<=25){
            System.out.println("Your grade is F");
        }else if(marks>25 && marks<=45){
            System.out.println("Your grade is E");
        }else if(marks>45 && marks<=50){
            System.out.println("Your grade is D");
        }else if(marks>50 && marks<=60){
            System.out.println("Your grade is C");
        }else if(marks>60 && marks<=80){
            System.out.println("Your grade is B");
        }else if(marks>80 &&marks<=100){
            System.out.println("Your grade is A");
        }else {
            System.out.println("Please enter valid mark");
        }

    }
}
