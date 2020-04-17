import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCartImp {

    public String addToCart(Product... products) throws ShoppingCartException{
        try {
            List list = new ArrayList();
            Arrays.stream(products).forEach(product -> list.add(product));
            double actualPrice = calcualteTotalPrice(list);
            SaleTax saleTax = new SaleTax();
            double saleTaxAmount = saleTax.saleTaxAmout(actualPrice);
            OutputDto outputDto = new OutputDto();
            String totalBill = outputDto.totalBill(actualPrice, saleTaxAmount);
            return totalBill;
        }
        catch (RuntimeException ex){
            throw new ShoppingCartException(ex.getMessage(), ShoppingCartException.ExceptionType.NULL_ITEM);
        }
    }

    private double calcualteTotalPrice(List<Product> productList) {
        double sum = productList.stream().mapToDouble(product -> product.item.price * product.quantity).sum();
        return sum;
    }


}
