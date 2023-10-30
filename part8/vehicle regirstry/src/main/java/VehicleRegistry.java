
import java.util.*;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> hash;

    public VehicleRegistry() {
        this.hash = new HashMap<>();
    }

    public boolean add(LicensePlate licenseplate, String owner) {
        if (!this.hash.containsKey(licenseplate)) {
            this.hash.put(licenseplate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate licenseplate) {
        if (!this.hash.containsKey(licenseplate)) {
            return null;
        } else {
            return this.hash.get(licenseplate);
        }
    }

    public boolean remove(LicensePlate licenseplate) {
        if (this.hash.containsKey(licenseplate)) {
            this.hash.remove(licenseplate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate x : this.hash.keySet()) {
            System.out.println(x);
        }
    }

    public void printOwners() {
        ArrayList<String> helper = new ArrayList<>();
        for (String x : this.hash.values()) {
            if (!helper.contains(x)) {
                System.out.println(x);
                helper.add(x);
            }
        }
    }
}
