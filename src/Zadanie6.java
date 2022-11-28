
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
            double losowaLiczba1 = rand.nextDouble(a, b);
            double losowaLiczba2 = rand.nextDouble(a, b);
            double losowaLiczba3 = rand.nextDouble(a, b);
            System.out.print("Wartości generowane losowo: " + losowaLiczba1 + ", " + losowaLiczba2 + ", " + losowaLiczba3);



       }
    }
}