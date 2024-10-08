package java_basic.ref.ex;

import java.util.Scanner;

public class ProductMain3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int orderCnt = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[orderCnt];

        for (int i=0; i< orders.length; i++) {
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = scanner.nextLine();
            System.out.print("가격 : ");
            int price = scanner.nextInt();
            System.out.print("수량 : ");
            int qty = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName,price,qty);
        }
        printOrders(orders);
        System.out.println("총 결제 금액 : " + totalAmount(orders));






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

        return totalAmount;
    }
}
