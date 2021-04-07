package repl148;

class Main {
    public static void main(String[] args){
        ShoppingStore item1=new ShoppingStore("Blanket",49.99,2);
        ShoppingStore item2=new ShoppingStore("Mattress",439.18,1);
        item1.itemTotalPrice(item1.item,item1.price,item1.quantity,item2.item,item2.price,item2.quantity);
    }
}