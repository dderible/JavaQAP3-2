package java_qap2;

import java.math.BigDecimal;

public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        BigDecimal bigDecimal = BigDecimal.valueOf(amount);
        this.dollars = bigDecimal.longValue();
        this.cents = bigDecimal.subtract(new BigDecimal(dollars)).movePointRight(2).longValue();
    }

    public Money(Money anotherObject) {
        this.dollars = anotherObject.dollars;
        this.cents = anotherObject.cents;
    }

    public void add(Money anotherObject) {
        this.dollars += anotherObject.dollars;
        this.cents += anotherObject.cents;

        if (this.cents >= 100) {
            this.dollars += this.cents / 100;
            this.cents %= 100;
        }
    }

    public void subtract(Money anotherObject) {
        this.dollars -= anotherObject.dollars;
        this.cents -= anotherObject.cents;

        if (this.cents < 0) {
            this.dollars -= 1;
            this.cents += 100;
        }
    }

    public int compareTo(Money anotherObject) {
        if (this.dollars > anotherObject.dollars) {
            return 1;
        } else if (this.dollars < anotherObject.dollars) {
            return -1;
        } else {
            return Long.compare(this.cents, anotherObject.cents);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Money other)) return false;
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    public String toString() {
        return "$" + this.dollars + "." + String.format("%02d", this.cents);
    }
}
