package lec_6xtoarraylist;

import java.util.ArrayList;

public class bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Cac phan tu trong ArrayList: ");
        System.out.println(list);
    }
}
