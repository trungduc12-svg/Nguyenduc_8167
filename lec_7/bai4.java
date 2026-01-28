package lec_7;

import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap 1 chuoi ky tu: ");
        String doc = sc.nextLine();
        doc = doc.trim().replaceAll("\\doc+"," ");
        System.out.print("chuoi sau khi xoa khoang trang:" + doc);
    }

}