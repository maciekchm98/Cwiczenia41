import java.util.Scanner;

import static java.lang.Math.abs;

public class Zadanie5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Podaj 1 liczbę: ");
        int a = sc.nextInt();
        System.out.print("Podaj 2 liczbę: ");
        int b = sc.nextInt();
        System.out.print("ADD, SUB, DIV, MUL? ");
        String c = sc.next();
        switch (c) {
            case "MUL" -> System.out.print(abs(a * b));
            case "ADD" -> System.out.print(abs(a + b));
            case "DIV" -> System.out.print(abs(a / b));
            case "SUB" -> System.out.print(abs(a - b));

            default -> System.out.print("Brak takiej operacji");
        }
    }
}