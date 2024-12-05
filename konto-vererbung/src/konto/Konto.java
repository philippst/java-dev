package konto;

public abstract class Konto {
    private int kontonummer;
    private double saldo;

    
    public Konto(){
    }

    public Konto(int kontonummer){
        this.kontonummer = kontonummer;
    }

    public Konto(int kontonummer, double saldo){
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void zahleEin(double betrag){
        // Die Zeile darunter macht das selbe, ist aber kürzer.
        // this.saldo = this.saldo + betrag;
        this.saldo += betrag;
    }

    public void zahleAus(double betrag){
        this.saldo -= betrag;
    }

    public void info(){
        System.out.println("Kontonummer: " + kontonummer + " Saldo: " + saldo);
    }

}
