package it.unical.mistnim.clarence;

import java.util.HashMap;
import java.util.Map;

class Keypad {
    private static final char[] KEYS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.'};
    private static final Short[][] POSITIONS = new Short[][]{
            {1, 3},
            {0, 0},
            {1, 0},
            {2, 0},
            {0, 1},
            {1, 1},
            {2, 1},
            {0, 2},
            {1, 2},
            {2, 2},
            {0, 3},
    };
    private static final Map<Character, Point> m = new HashMap<>();

    static {
        for (int i = 0; i < KEYS.length; i++)
            m.put(KEYS[i], new Point(POSITIONS[i][0], POSITIONS[i][1]));
    }

    static Point getPosition(char c) {
        return m.get(c);
    }
}

