package lec_6xtoarraylist;

import java.util.ArrayList;

public class bai8 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");

        ArrayList<String> copyFruits = new ArrayList<>(fruits);

        System.out.println("Danh sach goc: " + fruits);
        System.out.println("Danh sach sao chep: " + copyFruits);
    }
}
