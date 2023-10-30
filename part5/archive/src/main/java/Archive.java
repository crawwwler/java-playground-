
public class Archive {

    private String id;
    private String name;

    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object x) {
        if (this == x) {
            return true;
        }

        if (!(x instanceof Archive)) {
            return false;
        }

        Archive xx = (Archive) x;
        if (this.id.equals(xx.id)) {
            return true;
        } else {
            return false;
        }
    }
}
