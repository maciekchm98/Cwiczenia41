import java.util.Scanner;
import java.util.Random;


public class Zadanie6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;

        System.out.print("Podaj 1 liczbę: ");
        a = sc.nextDouble();
        System.out.print("Podaj 2 liczbę: ");
        b = sc.nextDouble();
        if (a > b) {
            System.out.print("Wybrany przedział:[" + a + ", " + b + "] ");
        }
        else if (a < b) {
            System.out.print("Wybrany przedział:[" + b + ", " + a + "] ");
        }
       {
            Random rand = new Random();
            double r1 = rand.nextDouble(a, b);
            double r2 = rand.nextDouble(a, b);
            double r3 = rand.nextDouble(a, b);
            System.out.print(" Wartości generowane losowo: " + r1 + ", " + r2 + ", " + r3);

           if (r1<r2 && r2<r3){
               System.out.println(r1+" < "+r2+" < "+r3);
           }else if (r1<r3 && r3<r2){
               System.out.println(r1+" < "+r3+" < "+r2);
           }else if (r2<r1 && r1<r3){
               System.out.println(r2+" < "+r1+" < "+r3);
           }else if (r2<r3 && r3<r1){
               System.out.println(r2+" < "+r3+" < "+r1);
           }else if (r3<r1 && r1<r2){
               System.out.println(r3+" < "+r1+" < "+r2);
           }else if (r3<r2 && r2<r1){
               System.out.println(r3+" < "+r2+" < "+r1);
           }
       }
    }
}
