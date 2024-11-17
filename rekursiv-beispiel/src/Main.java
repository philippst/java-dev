/**
 * Main Klasse des Programms mit zur rekursiven Berechnungen einer Fakultät.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Beispiel Programm zur Berechnung der Fakultät");

        int number = 5;
        int result = factorial(number);

        System.out.println("Fakultät von " + number + " ist " + result);
    }

    public static int factorial(int n) {
        if (n != 0){
            return n * factorial(n - 1);
        }
        return 1;
    }

}