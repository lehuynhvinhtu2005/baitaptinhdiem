package baitaptinhdiem;
import java.util.Scanner;
import java.util.Random;

public class Baitaptinhdiem {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Random rand = new Random();
       int wa = 0;
       int point = 0;
       while(wa < 3){
        int sum = 0;
        int soluongtoanhang = rand.nextInt(4) + 3;
        String a = " ";
        Boolean chudautien = true;
        for(int i=2; i<=soluongtoanhang; i++){
           int n = rand.nextInt(10) + 1;
           sum = sum + n;
           if(!chudautien){
           a = a + " + " + n;
           }else {
               a = a + n;
               chudautien = false;
           }
        }
        System.out.print(a + " = ");
        int doan = input.nextInt();
        if(doan == sum){
            point++;
        }else {
            System.out.println("Sai roi! dap an la: " + sum);
            wa++;
          }
        }
        System.out.println("Ban kiem duoc tong cong "+point);
    }
    
}
