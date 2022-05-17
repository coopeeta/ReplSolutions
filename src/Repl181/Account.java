package Repl181;

class Account{
    String acc_no;
    String name;
    String email;
    double amount;

    Account(String acc_no,String name,String email,double amount){
        setAcc(acc_no);
        setName(name);
        setEMail(email);
        setAmount(amount);
    }
    public void setAcc(String acc_no){
        this.acc_no=acc_no;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEMail(String email){
        this.email=email;
    }
    public void setAmount(Double amount){
        this.amount=amount;
    }
    public String getAcc(){
        return this.acc_no;
    }
    public String getName(){
        return this.name;
    }
    public String getEMail(){
        return this.email;
    }
    public double getAmount(){
        return this.amount;
    }
}