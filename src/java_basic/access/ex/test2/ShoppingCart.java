package java_basic.access.ex.test2;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;


    public void addItem(Item item) {
        if (itemCount > 10 ) {
            System.out.println("더이상 담을 수 없습니다.");
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        for (int i=0; i<itemCount; i++) {
             Item item = items[i];
            System.out.println("상품명 : " + item.getName() + ", 합계 ; " + item.totalPrice());
        }
    }
}
