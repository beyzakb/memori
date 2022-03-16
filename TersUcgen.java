package Giris;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Değeri Giriniz : ");
        int n = inp.nextInt();
        for (int a = 1; a <= n; a++) {

            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * (n - a) - 1; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
