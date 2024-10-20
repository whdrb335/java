package java_basic.access.ex.test3;

public class Item {

    private String name;
    private int price;
    private int qty;


    public Item(String name, int qty, int price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int totalPrice() {
        return qty * price;
    }
}
