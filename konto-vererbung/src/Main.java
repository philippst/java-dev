import konto.Girokonto;
import konto.Konto;

public class Main {
    public static void main(String[] args) {

        // Konto konto1 = new Konto(43574579, 500);
        // konto1.info();

        // konto1.zahleEin(50.00);
        // konto1.info();

        // konto1.zahleAus(1000.00);
        // konto1.info();

        Girokonto konto2 = new Girokonto(1234, 500.00, 2000.00);
        konto2.info();

        konto2.zahleAus(3000.00);
        konto2.info();

        konto2.zahleAus(500.00);
        konto2.info();


    }
}