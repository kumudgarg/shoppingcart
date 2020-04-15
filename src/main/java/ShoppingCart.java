import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {



    public double addToCart(Product... products) {
        List list = new ArrayList();
        Arrays.stream(products).forEach(product -> list.add(product));
        double totalPrice = calcualteTotalPrice(list);
        return totalPrice;
    }


    public double calcualteTotalPrice(List<Product> productList) {
        double sum = productList.stream().mapToDouble(product -> product.item.price * product.quantity).sum();
        return sum;
    }
}
