package taxes;

import java.util.Objects;

public class TaxSystemSecond extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return ((int) (Double.valueOf(debit - credit) * 0.15) >= 0) ? (int) (Double.valueOf(debit - credit) * 0.15) : 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final TaxSystemSecond that = (TaxSystemSecond) o;
        return Objects.equals(((TaxSystemSecond) o).calcTaxFor(1000, 1000), new TaxSystemSecond().calcTaxFor(1000, 1000));
    }
}
