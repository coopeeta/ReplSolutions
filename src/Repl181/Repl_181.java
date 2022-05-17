package Repl181;

class Main {
    public static void main(String[] args){
        Account account=new Account("7560504000","Sumair","sumair@syntax.com",50000.0);
        System.out.print(account.getAcc()+" "+account.getName()+" "+account.getEMail()+" "+account.getAmount());
    }

}