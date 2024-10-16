package java_basic.access.ex.test;

public class ShoppingCart {

    private Item[] items = new  Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount > items.length) {
            System.out.println("다참 불가 돌아가");
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void disPlayItem() {

        for (int i=0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명 : " + item.getName()+", 합계 :" + item.totalPrice());
        }
    }
}
