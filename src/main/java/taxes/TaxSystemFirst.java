package taxes;

import java.util.Objects;

public class TaxSystemFirst extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return ((int) (Double.valueOf(debit) * 0.06) >= 0) ? (int) (Double.valueOf(debit) * 0.06) : 0;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final TaxSystemFirst that = (TaxSystemFirst) o;
        return Objects.equals(((TaxSystemFirst) o).calcTaxFor(1000, 1000), new TaxSystemFirst().calcTaxFor(1000, 1000));
    }

    @Override
    public int hashCode() {
        return Objects.hash(new TaxSystemFirst().calcTaxFor(1000, 1000));
    }
}
