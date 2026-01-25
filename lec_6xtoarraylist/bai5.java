package lec_6xtoarraylist;

import java.util.ArrayList;
import java.util.Random;

public class bai5 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100) + 1);
        }

        System.out.println("Danh sach ban dau:");
        System.out.println(numbers);

        numbers.remove(3);

        System.out.println("Danh sach sau khi xoa index 3: ");
        System.out.println(numbers);
    }
}
