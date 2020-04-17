import java.text.DecimalFormat;

public class OutputDto {

    public String totalBill(double actualPrice, double saleTax){
        DecimalFormat df2 = new DecimalFormat("#.##");
        return " actualPrice = " + df2.format(actualPrice) +  " $ "  + "\n"
                + " saleTax = " + df2.format(saleTax) + " $ "+ "\n" + " grandTotal = " + df2.format(actualPrice + saleTax) + " $ ";
    }
}
