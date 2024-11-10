/**
 * Main Klasse zur Ausführung des Programms mit Beispielen zur Erstellung von Auto Objekten.
 */
public class Main {

    /**
     * Die main Methode ermöglicht die Ausführung des Programmes. Sie stellt den Einstiegspunkt in die Ausführung der
     * Java-Anwendung dar und muss die Signatur `public static void main(String[] args)` besitzen.
     */
    public static void main(String[] args) {

        // Wie in Version 1 des Programms erstellen wir ein Objekt des Autos und befüllen dann die Attribute mit Werten
        Auto autoMercedes = new Auto();             // Anlage einer Instanz von Klasse Auto mit dem Schlüsselwort new
        autoMercedes.farbe = "rot";                 // Attribut Farbe wird mit dem Wert 'rot' befüllt
        autoMercedes.marke = "Mercedes";            // Attribut Marke wird mit dem Wert 'Mercedes' befüllt
        autoMercedes.kennzeichen = "K-RH 123";      // Attribut Kennzeichen wird mit Kennzeichen befüllt
        autoMercedes.beschreiben();                 // Methode wird aufgerufen, damit das Auto einen Text ausgibt

        // Wir nutzen die neue Konstruktor Methode, um bei Anlage des Objektes gewisse Attribute mit Werten zu befüllen
        Auto autoTesla = new Auto("blau", "Tesla", "K-RH 456");
        autoTesla.beschreiben();

        // Wir nutzen die neue Konstruktor Methode, um bei Anlage des Objektes gewisse Attribute mit Werten zu befüllen
        Auto autoBmw = new Auto("weiß", "BMW", "K-RH 789");
        autoBmw.beschreiben();

    }
}
