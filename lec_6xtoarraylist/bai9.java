package lec_6xtoarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class bai9 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(18);
        numbers.add(36);
        numbers.add(67);
        numbers.add(91);
        numbers.add(01);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Danh sach: " + numbers);
        System.out.println("So lon nhat: " + max);
        System.out.println("So nho nhat: " + min);
    }
}
