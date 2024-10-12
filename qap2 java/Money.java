// Money.java
public class Money {
    private long dollars;
    private long cents;

    // Constructor using a double amount
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Add method
    public Money add(Money otherAmount) {
        long totalCents = (this.cents + otherAmount.cents) % 100;
        long totalDollars = this.dollars + otherAmount.dollars + (this.cents + otherAmount.cents) / 100;
        return new Money(totalDollars + totalCents / 100.0);
    }

    // Subtract method
    public Money subtract(Money otherAmount) {
        long totalCents = this.cents - otherAmount.cents;
        long totalDollars = this.dollars - otherAmount.dollars;
        if (totalCents < 0) {
            totalDollars--;
            totalCents += 100;
        }
        return new Money(totalDollars + totalCents / 100.0);
    }

    // CompareTo method
    public int compareTo(Money other) {
        if (this.dollars > other.dollars || (this.dollars == other.dollars && this.cents > other.cents)) {
            return 1;
        } else if (this.dollars < other.dollars || (this.dollars == other.dollars && this.cents < other.cents)) {
            return -1;
        } else {
            return 0;
        }
    }

    // equals method
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject instanceof Money) {
            Money other = (Money) otherObject;
            return this.dollars == other.dollars && this.cents == other.cents;
        }
        return false;
    }

    // toString method
    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }
}
