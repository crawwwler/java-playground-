
public class Literacy implements Comparable<Literacy> {

    private String country;
    private String gender;
    private int year;
    private double rate;

    public Literacy(String gender, String country, int year, double rate) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.rate = rate;
    }

    public String getCountry() {
        return this.country;
    }

    public String getGender() {
        if (this.gender.contains("female")) {
            return this.gender.substring(0, 6);
        } else if (this.gender.contains("male")) {
            return this.gender.substring(0, 4);
        } else {
            return this.gender;
        }
    }

    public int getYear() {
        return this.year;
    }

    public double getRate() {
        return this.rate;
    }

    @Override
    public int compareTo(Literacy c) {
        if (this.rate == c.getRate()) {
            return 0;
        } else if (this.rate > c.getRate()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.getGender() + ", " + this.rate;
    }
}
