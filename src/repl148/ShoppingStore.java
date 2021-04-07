package repl148;

public class ShoppingStore {
    String item;
    double price;
    int quantity;

    ShoppingStore(String item,double price,int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    void itemTotalPrice(String item1,double price1, int quantity1,String item2,double price2, int quantity2){
        System.out.println(item1+" Total Value "+(price1*quantity1));
        System.out.println(item2+" Total Value "+(price2*quantity2));
        System.out.println("You purchased "+((price1*quantity1)+(price2*quantity2))+ " Today");

    }
}
