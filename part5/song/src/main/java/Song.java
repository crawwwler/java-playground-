
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object x) {
        if (this == x) {
            return true;
        }
        if (!(x instanceof Song)) {
            return false;
        }
        Song s = (Song) x;

        if (this.artist == s.artist
                && this.name == s.name
                && this.durationInSeconds == s.durationInSeconds) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
