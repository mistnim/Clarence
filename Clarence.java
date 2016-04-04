// https://www.reddit.com/r/dailyprogrammer/comments/4bc3el/20160321_challenge_259_easy_clarence_the_slow/
package it.unical.mistnim.clarence;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Clarence {
    public static void main(String[] args) {
        String ip = args[0];
        List<Point> points = ip.chars().mapToObj(e -> (char) e)
                .map(Keypad::getPosition)
                .collect(Collectors.toCollection(ArrayList<Point>::new));

        List<Double> o = points.stream().map(e -> e.distanceTo(e)).collect(Collectors.toList());

        double sum = 0.0;
        for (int i = 1; i < points.size(); i++) {
            sum += points.get(i - 1).distanceTo(points.get(i));
        }
        System.out.printf("%.2fcm", sum);
    }
}
