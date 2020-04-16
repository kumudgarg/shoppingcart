import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartTest {

    @Test
    public void givenAnEmptyShoppingCart_When5ApplesOf$0Point99EachAreAdded_ThenTheCartTotalIs$4Point95() throws ShoppingCartException {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product(Item.APPLE, 5);
        String totalPrice = shoppingCart.addToCart(product1);
        Assert.assertEquals("5.05",totalPrice);
    }

    @Test
    public void givenAShoppingCart_When3ApplesOf$0Point99EachAnd3MasksOf$1Point99EachAreAdded_ThenTheCartTotalIs$8Point94$() throws ShoppingCartException {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product(Item.APPLE, 3);
        Product product2 = new Product(Item.MASK, 3);
        String totalPrice = shoppingCart.addToCart(product1, product2);
        Assert.assertEquals("9.12",totalPrice);
    }

    @Test
    public void givenAShppingCart_WhenAddedANullProduct_ShouldThrowCustomException() {
        try {
            ShoppingCart shoppingCart = new ShoppingCart();
            Product product = new Product(null, 2);
            String totalPrice = shoppingCart.addToCart(product);
        } catch (ShoppingCartException ex) {
            Assert.assertEquals(ShoppingCartException.ExceptionType.NULL_ITEM, ex.type);
        }
    }


    @Test
    public void givenAShoppingCart_When2ApplesOf$0Point99EachAreAddedAndAnotherAppleIsAddedAnd3MasksOf$1Point99EachAreAdded_ThenTheCartTotalIs$9Point12AndTheSalesTaxIs$0Point18() throws ShoppingCartException {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product(Item.APPLE, 2);
        Product product2 = new Product(Item.APPLE, 1);
        Product product3 = new Product(Item.MASK, 3);
        String totalPrice = shoppingCart.addToCart(product1, product2, product3);
        Assert.assertEquals("9.12", totalPrice);

    }


}
