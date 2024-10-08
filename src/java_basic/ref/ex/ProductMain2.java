package java_basic.ref.ex;

public class ProductMain2 {
    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부",2000,2);
        orders[1] = createOrder("김치",5000,1);
        orders[2] = createOrder("콜라",1500,2);


        printOrders(orders);

        System.out.println("총 결제 금액 : " + getTotalAmout(orders));

    }
    static ProductOrder createOrder(String productName, int price, int qty) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.qty = qty;

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.qty);
        }
    }

    static int getTotalAmout(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.qty;

        }
        return totalAmount;
    }




}
