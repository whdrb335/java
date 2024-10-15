package java_basic.pack.com.helloshop.order;

import java_basic.pack.com.helloshop.product.Product;
import java_basic.pack.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    // public 이 붙어야 다른 곳에서 이것을 호출할 수 있다.
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;

    }
}
