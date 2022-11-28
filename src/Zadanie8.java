import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value1, value2;
        String currency;

        System.out.print("PLN albo JPY: ");
        currency = input.next();
        System.out.print("Wprowadź kwotę: ");
        value1 = input.nextDouble();

        if(currency.equals("PLN")){
            value2 = value1 * 30.84;
            System.out.println(value1 + " PLN = " + value2 + " JPY");
        } else if (currency.equals("JPY")) {
            value2 = value1 * 0.032;
            System.out.println(value1 + " JPY = " + value2 + " PLN");
        }
        input.close();

    }
}