import taxes.TaxSystem;
import taxes.TaxSystemFirst;
import taxes.TaxSystemSecond;

public class Main {

    public static void main(String[] args) {
        TaxSystem taxSystem = new TaxSystemFirst();
        Company company = new Company("Вин", taxSystem);
        company.shiftMoney(100000);
        company.payTaxes();

        taxSystem = new TaxSystemSecond();
        company.setTaxSystem(taxSystem);
        company.shiftMoney(100000);
        company.payTaxes();
    }
}

