public class Konto {
    private int id;
    private double saldo;
    private Kunde kunde;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    // Standard Methode hashCode wird mit eigener Geschäftslogik überschrieben.
    // als HashCode soll die eindeutige ID des Kontos verwendet werden
    @Override
    public int hashCode() {
        return id;
    }

    // Standard Methode equals wird mit eigener Geschäftslogik überschrieben.
    // Zum Abgleich von Konten Instancen soll die eindeutige ID des Kontos genutzt werden
    @Override
    public boolean equals(Object object) {
        Konto konto = (Konto) object;
        return id == konto.id;
    }

}
