import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartImpTest {

    @Test
    public void givenAnEmptyShoppingCart_When5ApplesOf$0Point99EachAreAdded_ThenTheCartTotalIs$4Point95() throws ShoppingCartException {
        ShoppingCartImp shoppingCartImp = new ShoppingCartImp();
        Product product1 = new Product(Item.APPLE, 5);
        String totalPrice = shoppingCartImp.addToCart(product1);
        Assert.assertEquals(" actualPrice = 4.95 $ \n" + " saleTax = 0.1 $ \n" + " grandTotal = 5.05 $ ",totalPrice);
    }

    @Test
    public void givenAShoppingCart_When3ApplesOf$0Point99EachAnd3MasksOf$1Point99EachAreAdded_ThenTheCartTotalIs$8Point94$() throws ShoppingCartException {
        ShoppingCartImp shoppingCartImp = new ShoppingCartImp();
        Product product1 = new Product(Item.APPLE, 3);
        Product product2 = new Product(Item.MASK, 3);
        String totalPrice = shoppingCartImp.addToCart(product1, product2);
        Assert.assertEquals(" actualPrice = 8.94 $ \n" + " saleTax = 0.18 $ \n" + " grandTotal = 9.12 $ ", totalPrice);
    }

    @Test
    public void givenAShppingCart_WhenAddedANullProduct_ShouldThrowCustomException() {
        try {
            ShoppingCartImp shoppingCartImp = new ShoppingCartImp();
            Product product = new Product(null, 2);
            String totalPrice = shoppingCartImp.addToCart(product);
        } catch (ShoppingCartException ex) {
            Assert.assertEquals(ShoppingCartException.ExceptionType.NULL_ITEM, ex.type);
        }
    }


    @Test
    public void givenAShoppingCart_When2ApplesOf$0Point99EachAreAddedAndAnotherAppleIsAddedAnd3MasksOf$1Point99EachAreAdded_ThenTheCartTotalIs$9Point12AndTheSalesTaxIs$0Point18() throws ShoppingCartException {
        ShoppingCartImp shoppingCartImp = new ShoppingCartImp();
        Product product1 = new Product(Item.APPLE, 2);
        Product product2 = new Product(Item.APPLE, 1);
        Product product3 = new Product(Item.MASK, 3);
        String totalPrice = shoppingCartImp.addToCart(product1, product2, product3);
        Assert.assertEquals(" actualPrice = 8.94 $ \n" + " saleTax = 0.18 $ \n" + " grandTotal = 9.12 $ ", totalPrice);

    }


}
