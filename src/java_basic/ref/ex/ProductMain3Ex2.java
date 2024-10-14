package java_basic.ref.ex;

import java.util.Scanner;

public class ProductMain3Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int num = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[num];

        for (int i=0; i<num; i++) {
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = scanner.nextLine();
            System.out.print("가격 : ");
            int price = scanner.nextInt();
            System.out.print("수량 : ");
            int qty = scanner.nextInt();
            scanner.nextLine();

            productOrders[i] = createOrder(productName,price,qty);
        }
        printOrder(productOrders);
        System.out.println("총 결제 금액은 : " + totalAmount(productOrders));
    }

    static ProductOrder createOrder(String name, int price, int qty) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = name;
        productOrder.price = price;
        productOrder.qty = qty;
        return productOrder;
    }

    static void printOrder(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명 : " + productOrder.productName + " 가격 : " + productOrder.price + " 수량 : " + productOrder.qty);
        }
    }
    static int totalAmount(ProductOrder[] productOrders) {
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.price * productOrder.qty;
        }
        return totalAmount;
    }
}
