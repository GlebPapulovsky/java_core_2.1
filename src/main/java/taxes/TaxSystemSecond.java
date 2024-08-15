package taxes;

public class TaxSystemSecond extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return ((int) (Double.valueOf(debit - credit) * 0.15) >= 0) ? (int) (Double.valueOf(debit - credit) * 0.15) : 0;
    }

}
