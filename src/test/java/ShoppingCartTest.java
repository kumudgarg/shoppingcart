import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartTest {


    @Test
    public void GivenAnEmptyShoppingCart_When5ApplesOf$0Point99EachAreAdded_ThenTheCartTotalIs$4Point95() {
        List<Product> products = new ArrayList<>();
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product(Item.APPLE, 5);
       // products.add(product);
        double total = shoppingCart.addToCart(product1);
        Assert.assertEquals(4.95,total,0.0);
    }
}
