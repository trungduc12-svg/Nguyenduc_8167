package lec_7;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap chuoi: ");
        String str = sc.nextLine();

        System.out.print("nhap ky tu: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Ky tu '" + ch + " xuat hien " + count + " lan.");
    }
}
