//zad. 10
//ćw. 1

import java.util.Random;

public class LogicalOperators {
    public static void main(String[] args) {
        Random rand = new Random();

        int x = rand.nextInt(10);
        int y = rand.nextInt(10);

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("x > y? " + (x > y));
        System.out.println("x*2 > y? " + (x * 2 > y));
        System.out.println("y < x+3 && y > x-2? " + (y < x + 3 && y > x - 2));
        System.out.println("x*y % 2 = 0? " + (x * y % 2 == 0));
    }
}
