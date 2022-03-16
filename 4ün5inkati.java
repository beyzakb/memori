package Giris;
import java.util.Scanner;
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
public class ikininkati {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num, k_4 = 4, k_5 = 5;
        int i_4 = 1, i_5 = 1;

        System.out.print("Sayı Giriniz: ");
        num = scan.nextInt();

        do {
            System.out.print(i_4 + " ");
            i_4 *= k_4;
        } while (i_4 < num);

        System.out.print("\n");

        do {
            System.out.print(i_5 + " ");
            i_5 *= k_5;
        } while (i_5 < num);
    }
}
