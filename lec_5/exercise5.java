package lec_5;
import java.util.Random;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secret = rand.nextInt(10) + 1;  
        int guess;
        int count = 0;

        do {
            System.out.print("Nhap so ban doan (1-10): ");
            guess = sc.nextInt();
            count++;
            if (guess > secret) {
                System.out.println("So ban lon hon");
            } else if (guess < secret) {
                System.out.println("So ban nho hon");
            }

        } while (guess != secret);
        System.out.println("Chuc mung Ban da doan dung.");
        System.out.println("So lan doan: " + count);
    }
}
