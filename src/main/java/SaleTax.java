public class SaleTax {

    private final static double saleTaxRate = 2.0;

    public double saleTaxAmout(double totalPrice){
        double saleTaxAmount = (SaleTax.saleTaxRate * totalPrice) / 100;
        return saleTaxAmount;

    }
}
