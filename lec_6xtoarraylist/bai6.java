package lec_6xtoarraylist;

import java.util.ArrayList;
import java.util.Random;

public class bai6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        int odd = 0, even = 0;

        for (int i = 0; i < 15; i++) {
            int n = rand.nextInt(50) + 1;
            numbers.add(n);

            if (n % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Danh sach: " + numbers);
        System.out.println("So chan: " + even);
        System.out.println("So le: " + odd);
    }
}
