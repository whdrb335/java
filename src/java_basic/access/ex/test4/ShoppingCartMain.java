package java_basic.access.ex.test4;

public class ShoppingCartMain {
    public static void main(String[] args) {


        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("안녀",3000,2);
        Item item2 = new Item("종규",3300,2);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
