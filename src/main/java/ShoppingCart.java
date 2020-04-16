import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {



    public String addToCart(Product... products) throws ShoppingCartException{
        try {

            List list = new ArrayList();
            Arrays.stream(products).forEach(product -> list.add(product));
            double totalPrice = calcualteTotalPrice(list);
            double saleTaxAmount = saleTaxAmout(totalPrice);
            double grandTotal = saleTaxAmount + totalPrice;
            DecimalFormat df2 = new DecimalFormat("#.##");
            String exactTotal = df2.format(grandTotal);
            return exactTotal;
        }
        catch (RuntimeException ex){
            throw new ShoppingCartException(ex.getMessage(), ShoppingCartException.ExceptionType.NULL_ITEM);
        }
    }


    public double calcualteTotalPrice(List<Product> productList) {
        double sum = productList.stream().mapToDouble(product -> product.item.price * product.quantity).sum();
        return sum;
    }

    public double saleTaxAmout(double totalPrice){
        double saleTaxAmount = (SaleTax.saleTaxRate * totalPrice) / 100;
        return saleTaxAmount;

    }
}
