
package lec_6xtoarraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap ten thanh pho: ");
            cities.add(sc.nextLine());
        }

        if (cities.contains("London")) {
            System.out.println("Danh sach chua London");
        } else {
            System.out.println("Danh sach ko chua London");
        }
    }
}
