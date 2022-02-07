
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Set A: ");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Operation: ");
        String operation = scanner.nextLine();
        System.out.print("Set B: ");
        double b =scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Result: "+calculate.calculate(a,b,operation));

    }
}
