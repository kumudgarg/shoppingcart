import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {

    public double addToCart(Object apple, int noOfItem) {
        List<Object> list = Collections.nCopies(noOfItem, apple);
        double totalPrice = calcualteTotalForAddedApples(noOfItem);
        return totalPrice;
    }

    public double calcualteTotalForAddedApples(int noofItem) {
        double totalPrice = noofItem * 0.99;
        return totalPrice;
    }

}
