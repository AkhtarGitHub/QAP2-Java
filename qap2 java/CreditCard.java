// CreditCard.java
public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0);
    }

    // Get balance
    public Money getBalance() {
        return new Money(balance); // return a copy
    }

    // Get credit limit
    public Money getCreditLimit() {
        return new Money(creditLimit); // return a copy
    }

    // Get owner information
    public String getPersonals() {
        return owner.toString();
    }

    // Charge the card
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
        } else {
            System.out.println("Credit limit exceeded. Charge not processed.");
        }
    }

    // Make a payment
    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
}
