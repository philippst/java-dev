package de.rhkoeln.app;

import de.rhkoeln.app.fahrzeuge.Auto;  //Klasse Auto wurde Packet fahrzeuge verschoben. Deshalb ist nun  Import notwendig.

/**
 * Main Klasse zur Ausführung des Programms mit Beispielen zur Erstellung von Auto Objekten.
 */
public class Main {

    /**
     * Die main Methode ermöglicht die Ausführung des Programmes. Sie stellt den Einstiegspunkt in die Ausführung der
     * Java-Anwendung dar und muss die Signatur `public static void main(String[] args)` besitzen.
     */
    public static void main(String[] args) {

        Auto.autoVorschlaege();

        Auto autoMercedes = new Auto("rot","Mercedes", "K-HH 123");
        autoMercedes.beschreiben();

        Auto autoTesla = new Auto("blau", "Tesla", "K-RH 456");
        autoTesla.beschreiben();

        Auto autoBmw = new Auto("weiß", "BMW", "K-RH 789");
        autoBmw.beschreiben();

        Auto.autoVorschlaege();

    }
}
