 import java.util.Scanner;

    public class Zadanie4 {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);

            System.out.print("Podaj 1 liczbę: ");
            int a = sc.nextInt();
            System.out.print("Podaj 2 liczbę: ");
            int b = sc.nextInt();
            System.out.print("ADD, SUB, DIV, MUL? ");
            String c = sc.next();
            switch (c) {
                case "MUL" -> System.out.print(a * b);
                case "ADD" -> System.out.print(a + b);
                case "DIV" -> System.out.print(a / b);
                case "SUB" -> System.out.print(a - b);

                default -> System.out.print("Brak takiej operacji");
            }
        }
    }

