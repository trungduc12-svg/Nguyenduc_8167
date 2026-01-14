package lec_5;

import java.util.Random;

public class exercise2 {
    public static void main(String[] args) {
        Random rand = new Random();
        double n = 1.8 + (8.0 - 1.8 + 1) * rand.nextDouble();
        System.out.println("So thuc ngau nhien: " + n);
    }
}

