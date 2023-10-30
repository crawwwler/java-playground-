
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals = 0; // number of sold affordable meals
    private int heartyMeals = 0;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000.0;

    }

    public double eatAffordably(double payment) {
        if (payment >= 0 && payment >= 2.50) {
            this.money = this.money + 2.50;
            this.affordableMeals++;
            return payment - 2.50;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(2.50)) {
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= 0 && payment >= 4.30) {
            this.money += 4.30;
            this.heartyMeals++;
            return payment - 4.30;
        } else {
            return payment;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(4.30)) {
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double amount) {
        if (amount >= 0) {
            this.money = this.money + amount;
            card.addMoney(amount);
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
