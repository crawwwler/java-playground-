
public class Birds {

    private String name;
    private String latinName;
    private int countObs;

    public Birds(String name, String latin) {
        this.name = name;
        this.latinName = latin;
        this.countObs = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int numberOfObservation() {
        return this.countObs;
    }

    public void addObservation() {
        this.countObs++;
    }

    public boolean equals(Object x) {
        if (this == x) {
            return true;
        }
        if (!(x instanceof Birds)) {
            return false;
        }

        Birds xx = (Birds) x;

        if (this.name == xx.name
                && this.latinName == xx.latinName
                && this.countObs == xx.countObs) {
            return true;
        }
        return false;
    }

    public String toString() {
        String o = " observations";
        if (this.numberOfObservation() == 1) {
            o = " observation";
        }
        return this.name + "(" + this.latinName + "):" + this.numberOfObservation() + o;
    }
}
