
package lec_6xtoarraylist;
import java.util.ArrayList;

public class bai3 {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();

        prices.add(10.5);
        prices.add(20.0);
        prices.add(35.75);
        prices.add(40.25);
        prices.add(50.5);

        System.out.println("Gia cua cac sp :");
        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));
        }
    }
}
