
public class Stats {

    private String home;
    private String away;
    private int homeScore;
    private int awayScore;

    public Stats(String home, String away, int hs, int as) {
        this.home = home;
        this.away = away;
        this.homeScore = hs;
        this.awayScore = as;
    }

    public boolean games(String team) {

        if (this.home.equals(team) || this.away.equals(team)) {
            return true;
        }
        return false;
    }

    public int win(String team) {
        int win = 0;
        if (this.home.equals(team)) {
            if (this.homeScore > this.awayScore) {
                win++;
            }
        }
        if (this.away.equals(team)) {
            if (this.homeScore < this.awayScore) {
                win++;
            }
        }
        return win;
    }
}
