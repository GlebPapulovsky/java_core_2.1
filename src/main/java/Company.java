import taxes.TaxSystem;


public class Company {
    protected String title;
    protected int debit = 0;
    protected int credit = 0;
    protected TaxSystem taxSystem;


    Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;

    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }

    }

    public void payTaxes() {
        System.out.println("Компания " + title + " уплатила налог в размере: " + taxSystem.calcTaxFor(this.debit, this.credit) + " руб. ");
        this.debit = 0;
        this.credit = 0;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;

    }
    public TaxSystem getTaxSystem(){return this.taxSystem;}

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }



}
