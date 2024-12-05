package konto;

public class Girokonto extends Konto {
    private double limit;

    public Girokonto(int kontonummer, double saldo, double limit){
        super(kontonummer, saldo);
        this.limit = limit;
    }

    @Override
    public void zahleAus(double betrag){
        double saldo = getSaldo();
        if (betrag <= saldo + limit){
            saldo -= betrag;
            setSaldo(saldo);
        } else {
            System.out.println("Auszahlung von " + betrag + " überschreitet Limit.");
        }
    }


}
