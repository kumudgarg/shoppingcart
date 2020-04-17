import java.util.List;

public interface ShoppingCart {

    public String addToCart(Product... products) throws ShoppingCartException;

    public double calcualteTotalPrice(List<Product> productList);
}
