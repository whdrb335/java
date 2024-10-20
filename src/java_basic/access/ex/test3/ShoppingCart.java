package java_basic.access.ex.test3;

public class ShoppingCart {


    Item[] items = new Item[10];
    private int cartCount;


    public void addItem(Item item) {

        if (cartCount > 10) {
            System.out.println("더이상 추가할 수 없습니다.");
        }
        items[cartCount] = item;
        cartCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (int i=0; i<cartCount; i++) {
            Item item = items[i];
            System.out.println("상품명 ; " + item.getName() + " 합계 : " + item.totalPrice());
        }
    }



}
