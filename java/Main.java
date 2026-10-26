import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("wybierz dzialanie: 1 - suma, 2 - roznica, 3 - iloczyn, 4 - iloraz");
            int wybor = scanner.nextInt();

            System.out.print("podaj pierwsza liczbe: ");
            double a = scanner.nextDouble();
            System.out.print("podaj druga liczbe: ");
            double b = scanner.nextDouble();

            switch (wybor) {
                case 1:
                    System.out.println("suma: " + (a + b));
                    break;
                case 2:
                    System.out.println("roznica: " + (a - b));
                    break;
                case 3:
                    System.out.println("iloczyn: " + (a * b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("nie dziel przez zero");
                    } else {
                        System.out.println("iloraz: " + (a / b));
                    }
                    break;
                default:
                    System.out.println("nieprawidlowy wybor");
            }
        }
    }
}