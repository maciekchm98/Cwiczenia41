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
        if (a >= b){
            double c = a;
            a = b;
            b = c;
        }
        System.out.println("a = " + a + ","+" b = " + b);

        {
            Random rand = new Random();
            double n1 = rand.nextDouble(a, b);
            double n2 = rand.nextDouble(a, b);
            double n3 = rand.nextDouble(a, b);
            System.out.print("Wartości generowane losowo: " + n1 + ", " + n2 + ", " + n3 +" ");

           if (n1 < n2 && n2 < n3)
           {System.out.println(n1 + " < " + n2 + " < " + n3);}
           else if (n1 < n3 && n3 < n2)
           {System.out.println(n1 + " < " + n3 + " < " + n2);}
           else if (n2 < n1 && n1 < n3)
           {System.out.println(n2 + " < " + n1 + " < " + n3);}
           else if (n2 < n3 && n3 < n1)
           {System.out.println(n2 + " < " + n3 + " < " + n1);}
           else if (n3 < n1 && n1 < n2)
           {System.out.println(n3 + " < " + n1 + " < " + n2);}
           else if (n3<n2 && n2<n1)
           {System.out.println(n3 + " < " + n2 + " < " + n1);}
       }
    }
}
