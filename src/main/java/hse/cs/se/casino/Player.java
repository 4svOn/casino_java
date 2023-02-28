package hse.cs.se.casino;

import java.util.Random;

public class Player extends Thread{

    static private Random random = new Random();
    static private final String[] names = {
         "aboba1", "aboba2"
    };

    private final String name;

    private final Object table;

    Player(Object table) {
        name = names[0];
        this.table = table;
    }

    int throw_dices() {
        int cnt = 0;
        synchronized (table){
            for (int i = 0; i < 6; ++i){
                cnt += random.nextInt(6) + 1;
            }
        }
        return cnt;
    }
}
