package java_basic.access.ex.test4;

public class ShoppingCart {


    Item[] items = new Item[10];
    private int count;

    public void addItem(Item item) {
        if (count > 10) {
            System.out.println("더이상 추가 불가용");
        }
        items[count] = item;
        count++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i=0; i<count; i++) {
            Item item = items[i];
            System.out.println("상품명 : " + item.getName() + " 합계 ; " + item.totalPrice());
        }
    }
}
