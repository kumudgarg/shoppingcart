import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {



    public double addToCart(Product... products) throws ShoppingCartException{
        try {

            List list = new ArrayList();
            Arrays.stream(products).forEach(product -> list.add(product));
            double totalPrice = calcualteTotalPrice(list);
            return totalPrice;
        }
        catch (RuntimeException ex){
            throw new ShoppingCartException(ex.getMessage(), ShoppingCartException.ExceptionType.NULL_ITEM);
        }
    }


    public double calcualteTotalPrice(List<Product> productList) {
        double sum = productList.stream().mapToDouble(product -> product.item.price * product.quantity).sum();
        return sum;
    }
}
