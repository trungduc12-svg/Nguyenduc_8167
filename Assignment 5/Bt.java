package lec_6.bis1;

import java.util.Scanner;
import java.util.Arrays;
public class Bt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nMang sau khi bi dao nguoc");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");
        }

        System.out.print("\nCac so chan: ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0 && a[i] % 5 == 0) {
                sum += a[i];
            }
            System.out.println("\nTong cac phan tu chia het cho 3 va 5 la: " + sum);
        }
        System.out.println("\nMang sap xep tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nMang sap xep giam dan:");
        for (int i = n - 1; i >= 0; i--) {
             System.out.print(a[i] + " ");
        }
    }    
  }
