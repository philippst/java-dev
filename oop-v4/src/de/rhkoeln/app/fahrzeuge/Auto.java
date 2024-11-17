package de.rhkoeln.app.fahrzeuge;

/**
 * In dieser Datei wird die Klasse 'Auto' mit ihren Attributen und Methoden beschrieben.
 * Die Klasse dient als allgemeiner 'Bauplan' für alle Autos und wird im Programm Main verwendet.
 */
public class Auto {

    // Achtung dies ist ein static Klassenvariable
    public static int autoZaehler;

    /* Ab hier werden Attribute dieser Klasse definiert */

    // Instanzvariablen
    public String farbe;
    public String marke;
    public String kennzeichen;
    public int kmStand;
    public int erstzulassungJahr;


    /* Ab hier werden Methoden dieser Klasse definiert */

    /**
     * Konstruktur Methode ohne Parameter. Somit ist sichergestellt, dass auch zukünftig die Anlage eines Objektes von
     * Klasse Auto ohne Parametern möglich ist, also ganze einfach: new Auto()
     */
    public Auto() {
        autoZaehler++;
    }

    /**
     * Konstruktur Methode mit Parametern, die bei Erstellung eines Objektes Attributwerte setzt. Die Anlage eines
     * Objektes von der Klasse Auto ist damit so möglich: new Auto("rot", "Mercedes", "K-KK 123")
     *
     * @param farbe Farbe des Autos, z.B. rot
     * @param marke Marke des Autos, z.B. Mercedes
     * @param kennzeichen Kennzeichen des Autos, z.B. 'K-KK 123'
     */
    public Auto(String farbe, String marke, String kennzeichen) {
        autoZaehler++;

        this.farbe = farbe;
        this.marke = marke;
        this.kennzeichen = kennzeichen;
    }

    public void fahren(){
        System.out.println("Das Auto fährt ...");
    }

    public void hupen(){
        System.out.println("Das AUto hupt ...");
    }

    public void beschreiben(){
        System.out.println("Auto mit Kennezeichen '"+kennzeichen+"' ist "+farbe + " und von Marke " + marke + ".");
    }

    public static void autoVorschlaege(){
        System.out.println("Weitere Marken: Ford, Audi, Toyota, Volvo, ...");
        System.out.println("Erzeugte Autos bisher: " + autoZaehler);
    }
}
