package taxes;

public class TaxSystemFirst extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return ((int) (Double.valueOf(debit) * 0.06) >= 0) ? (int) (Double.valueOf(debit) * 0.06) : 0;
    }
}
