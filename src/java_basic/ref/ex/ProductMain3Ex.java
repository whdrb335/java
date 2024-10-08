package java_basic.ref.ex;

import java.util.Scanner;

public class ProductMain3Ex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("주문할 수량을 입력하세요 :");
        int cnt = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[cnt];

        for (int i=0; i<orders.length; i++) {
            System.out.println((i+1)+"번쨰 상품정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = scanner.nextLine();
            System.out.print(" 가격 : ");
            int price = scanner.nextInt();
            System.out.print(" 수량 : ");
            int qty = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrders(productName,price,qty);

        }

        printOrder(orders);
        System.out.println("총 결제 금액은 : " + totalAmount(orders));
    }
    static ProductOrder createOrders(String productName, int price, int qty ) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.qty = qty;

        return productOrder;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + " 가격 : " + order.price + " 수량 : " + order.qty);
        }
    }

    static int totalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.qty;

        }
        return totalAmount;
    }
}
