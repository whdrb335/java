package java_basic.access.ex.test2;

public class ShoppingCartMain {
    public static void main(String[] args) {


        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("신계",2000,2);
        Item item2 = new Item("상추", 3000,4);


        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
