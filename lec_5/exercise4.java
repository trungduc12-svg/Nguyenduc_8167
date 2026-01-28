package lec_5;

import java.util.Random;
import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Nhap so thuc (1 - 100): ");
        double user = sc.nextDouble();
        double random = 1 + (100 - 1) * rand.nextDouble();
        System.out.println("So ngau nhien: " + random);
        if (user == random) {
            System.out.println("2 so bang nhau");
        } else {
            System.out.println("2 so ko bang nhau");
        }
    }
}

