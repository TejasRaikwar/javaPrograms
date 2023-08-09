package javatpoint;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("Random values : ");
     //   Random r = new Random();
        int x = ThreadLocalRandom.current().nextInt();
        System.out.println(x);
    }
}
