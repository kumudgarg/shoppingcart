import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartTest {

    @Test
    public void GivenAnEmptyShoppingCart_When5ApplesOf$0Point99EachAreAdded_ThenTheCartTotalIs$4Point95() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product(Item.APPLE, 5);
        double total = shoppingCart.addToCart(product1);
        Assert.assertEquals(4.95,total,0.0);
    }

    @Test
    public void GivenAShoppingCart_When3ApplesOf$0Point99EachAnd3MasksOf$1Point99EachAreAdded_ThenTheCartTotalIs$8Point94$() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product(Item.APPLE, 3);
        Product product2 = new Product(Item.MASK, 3);
        double total = shoppingCart.addToCart(product1, product2);
        Assert.assertEquals(8.94,total,0.0);
    }

}
