
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory ch;

    public ProductWarehouseWithHistory(String productName, double balance, double initialBalance) {
        super(productName, balance);
        super.addToWarehouse(initialBalance);
        this.ch = new ChangeHistory();
        this.ch.add(initialBalance);
    }

    public String history() {
        return this.ch.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.ch.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double helper = super.takeFromWarehouse(amount);
        this.ch.add(super.getBalance());
        return helper;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.ch.toString());
        System.out.println("Largest amount of product: " + this.ch.maxValue());
        System.out.println("Smallest amount of product: " + this.ch.minValue());
        System.out.println("Average: " + this.ch.average());
    }

}
