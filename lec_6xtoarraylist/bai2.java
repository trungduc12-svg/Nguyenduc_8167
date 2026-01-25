package lec_6xtoarraylist;

import java.util.ArrayList;

public class bai2 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");

        colors.set(1, "Yellow");

        System.out.println("Danh sach mau sau khi cap nhat:");
        System.out.println(colors);
    }
}
