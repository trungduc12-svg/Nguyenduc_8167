package lec_7;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap 1 chuoi ky tu: ");
        String doc = sc.nextLine();
        int count = doc.length();
        System.out.println("so ky tu trong chuoi: "+ count );
    }

}