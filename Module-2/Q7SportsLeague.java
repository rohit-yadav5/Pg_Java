class Team {
    protected String name;
    protected int matchesPlayed;
    protected int wins;
    protected int draws;

    Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    public int calculatePoints() {
        return 0;
    }
}

class CricketTeam extends Team {

    CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return (wins * 2) + draws;
    }

    @Override
    public String toString() {
        return "Team: " + name +
                " (Cricket) Points: " +
                calculatePoints();
    }
}

class FootballTeam extends Team {

    FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return (wins * 3) + draws;
    }

    @Override
    public String toString() {
        return "Team: " + name +
                " (Football) Points: " +
                calculatePoints();
    }
}

public class Q7SportsLeague {
    public static void main(String[] args) {

        Team cricket =
                new CricketTeam("India", 10, 6, 2);

        Team football =
                new FootballTeam("Barcelona", 8, 6, 1);

        System.out.println(cricket);
        System.out.println(football);
    }
}