package java_qap2;

public class TestCreditCard {
    public static void main (String [] args) {
        final Money LIMIT = new Money(10000);
        final Money FIRST_AMOUNT = new Money(1000);
        final Money SECOND_AMOUNT = new Money(95);
        final Money THIRD_AMOUNT = new Money(10.64);
        final Money FOURTH_AMOUNT = new Money(351.91);
        Person owner = new Person("Declan", "Derible", new Address("123A Java Lane", "St. John's", "NL", "A1G 8D3"));
        CreditCard visa = new CreditCard(owner, LIMIT);
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit : " + visa.getCreditLimit());
        System.out.println(); System.out.println("Attempt to charge " + FIRST_AMOUNT);

        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());
        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());
        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        visa.payment(THIRD_AMOUNT); //had to change charge to payment
        System.out.println("Balance : " + visa.getBalance());
        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());

    }
}
