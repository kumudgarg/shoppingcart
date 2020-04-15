import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ShoppingCartTest {

    @Test
    public void GivenAnEmptyShoppingCart_When5ApplesOf$0Point99EachAreAdded_ThenTheCartTotalIs$4Point95() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Object apple = new Object();
        double total = shoppingCart.addToCart(apple, 5);
        Assert.assertEquals(4.95,total,0.0);
    }
}
