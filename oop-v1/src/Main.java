public class Main {

    /**
     * Die main Methode ermöglicht die Ausführung des Programmes.
     * Sie ist der Einstieg für die Java Runtime um das Programm zustarten.
     */
    public static void main(String[] args) {

        // Basierend auf der Klasse Auto (siehe Auto.java) wird ein erstes konkretes Auto angelegt
        // in diesem Beispiel ein roter Mercedes mit Kennzeichen 'K-RH 123'
        Auto autoMercedes = new Auto();             // Anlage einer Instanz von Klasse Auto mit dem Schlüsselwort new
        autoMercedes.farbe = "rot";                 // Attribut Farbe wird mit dem Wert 'rot' befüllt
        autoMercedes.marke = "Mercedes";            // Attribut Marke wird mit dem Wert 'Mercedes' befüllt
        autoMercedes.kennzeichen = "K-RH 123";      // Attribut Kennzeichen wird mit Kennzeichen befüllt
        autoMercedes.beschreiben();                 // Methode wird aufgerufen, damit das Auto einen Text ausgibt

        // Basierend auf der Klasse Auto wird ein weiteres Auto angelegt,
        // wie verwenden aber andere Werte für die Attribute, da es dieses mal ein blauer Tesla sein soll
        Auto autoTesla = new Auto();
        autoTesla.farbe = "blau";
        autoTesla.marke = "Tesla";
        autoTesla.kennzeichen = "K-RH 456";
        autoTesla.beschreiben();

        // Erneut wird basierend auf der Klasse Auto ein konkretes Auto Objekt erstellt
        // diesen Vorgang nennt man auch 'Instanzieren einer Klasse', also eine Instanz anlegen
        Auto autoBmw = new Auto();
        autoBmw.farbe = "weiß";
        autoBmw.marke = "BMW";
        autoBmw.kennzeichen = "K-RH 789";
        autoBmw.beschreiben();

    }
}
