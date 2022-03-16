package Giris;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int sayi;
    int max=0,min=0;

    System.out.print("Kaç adet sayı gireceksiniz?: ");
    sayi= input.nextInt();
    for(int i =1; i<=sayi; i++){
        System.out.print(i + ". sayıyı giriniz: " );
        int x = input.nextInt();

        if(x>max){
            if(min==0){
                min=x;
            }
            max = x;

        }
        if (x<min){
            if(max==0){
                max=x;
            }
            min=x;
        }




    } System.out.println("En büyük sayı: " +max);
    System.out.println("En küçük sayı: " +min);





    }
}
