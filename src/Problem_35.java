import java.util.Scanner;

public class Problem_35 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean isLoanRequired=scanner.nextBoolean();
        int creditScore;
        if(isLoanRequired){
            System.out.println("What is your credit score?");
            creditScore=scanner.nextInt();
                    if(creditScore<600){
                        System.out.println("The eligibility is Not eligible");
                    }else if(creditScore<=700){
                        System.out.println("The eligibility is Maybe eligible");
                    }else if(creditScore<=800){
                        System.out.println("The eligibility is Eligible");
                    }else {
                        System.out.println("The eligibility is Definitely eligible");
                    }
        }else {
            System.out.println("Unknown");
        }

    }
}
