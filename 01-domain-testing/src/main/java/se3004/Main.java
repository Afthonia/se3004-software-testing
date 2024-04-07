package se3004;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int num = rand.nextInt((int)(Double.POSITIVE_INFINITY) - 1) + 1;

        System.out.println(num);
    }
}
