import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Czy pada? Wpisz true lub false:");
        boolean czyPada= scanner.nextBoolean();

        System.out.println("Czy swieci slonce? Wpisz true lub false:");
        boolean czySwieciSlonce= scanner.nextBoolean();

        if (czyPada){

            if (czySwieciSlonce)
                System.out.println("Tecza");

            else {System.out.println("Plucha");}

        }
        if (!czyPada){

            if (czySwieciSlonce)
                System.out.println("Slonecznie");

            else{System.out.println("Pochmurno");}
        }
    }
}
