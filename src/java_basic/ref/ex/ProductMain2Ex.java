package java_basic.ref.ex;

public class ProductMain2Ex {
    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부",5000,2);
        orders[1] = createOrder("김치", 10000,2);
        orders[2] = createOrder("쪽파", 30000,2);

        printOrders(orders);
        totalAmount(orders);


    }
    static ProductOrder createOrder(String productName, int price, int qty) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.qty = qty;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + " 가격 : " + order.price + " 수량 : " + order.qty);
        }
    }

    static int totalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.qty;


        }
        System.out.println("총 결제 금액 : " + totalAmount);
        return totalAmount;
    }
}
