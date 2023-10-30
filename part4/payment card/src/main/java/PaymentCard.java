
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if (this.balance - 2.60 < 0) {
            this.balance = this.balance;
        } else {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance - 4.60 < 0) {
            this.balance = this.balance;
        } else {
            this.balance = this.balance - 4.60;
        }
    }

    public void addMoney(double money) {
        if (money < 0) {
            this.balance = this.balance;
        } else if (this.balance + money > 150.0) {
            this.balance = 150.0;
        } else {
            this.balance = this.balance + money;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

}
