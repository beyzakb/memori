package Giris;
import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args){
        for(int i= 2; i<100;i++){
            boolean flag = true;
            for(int k = 2; k<i;k++){
                if(i%k==0){
                    flag= false;
                    break;
                }
            }
            if(flag) {
                System.out.print(i + " ");
            }        
        }
    }
}
