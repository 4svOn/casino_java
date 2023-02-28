package hse.cs.se.casino;

public class Team {

    static private final String[] teamNames = {
            "qwe", "ewq"
    };

    private final Object table = new Object();

    private final Player[] players;

    Team() {
        players = new Player[]{
                new Player(table), new Player(table), new Player(table)
        };
    }
}
