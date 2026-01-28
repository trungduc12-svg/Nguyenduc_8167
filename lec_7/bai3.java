package lec_7;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap 1 chuoi ky tu: ");
        String doc = sc.nextLine();
        for (int i = doc.length()-1; i>=0; i--){
        System.out.print(doc.charAt(i));
        }
    }

}