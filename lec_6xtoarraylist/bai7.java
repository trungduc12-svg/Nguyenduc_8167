package lec_6xtoarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class bai7 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(18);
        list.add(27);
        list.add(36);
        list.add(48);
        list.add(67);

        Collections.reverse(list);

        System.out.println("Danh sach sau khi dao nguoc:");
        System.out.println(list);
    }
}
