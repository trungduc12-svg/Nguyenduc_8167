package lec_6xtoarraylist;

import java.util.ArrayList;

public class bai_10 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> uniqueNames = new ArrayList<>();

        names.add("do mixi");
        names.add("cuong gia");
        names.add("lao ton");
        names.add("lao hac");
        names.add("cau vang");

        for (String name : names) {
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }
        }

        System.out.println("Danh sach sau khi loai bo trung:");
        System.out.println(uniqueNames);
    }
}
