package java_qap2;

public class CreditCard {
    private Money balance = new Money(0);
    private Money creditLimit;
    private Person person;

    public CreditCard(Person newCardHolder, Money creditLimit) {
        this.creditLimit = creditLimit;
        this.person = newCardHolder;
    }

    public Money getBalance() {
        return this.balance;
    }

    public Money getCreditLimit() {
        return this.creditLimit;
    }

    public String getPersonals() {
        return this.person.toString();
    }

    //The charge function was modified to produce the "Exceeds credit limit" string.
    public void charge(Money amount) {
        Money credit = new Money(this.getBalance());
        credit.add(amount);
        if (credit.compareTo(this.getCreditLimit()) == 1) {
            System.out.println("Exceeds credit limit");
        } else {
            this.balance.add(amount);
        }
    }

    public void payment(Money amount) {
        this.balance.subtract(amount);
    }
}
