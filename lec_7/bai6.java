package lec_7;

import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        System.out.print("tu can thay: ");
        String oldWord = sc.nextLine();

        System.out.print("tu thay the: ");
        String newWord = sc.nextLine();

        String result = str.replace(oldWord, newWord);

        System.out.println("chuoi sau khi thay the: " + result);
    }
}
