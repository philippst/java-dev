/**
 * In dieser Datei wird die Klasse 'Auto' mit ihren Attributen und Methoden beschrieben.
 * Die Klasse dient als allgemeiner 'Bauplan' für alle Autos und wird im Programm Main verwendet.
 */
public class Auto {

    /* Ab hier werden Attribute dieser Klasse definiert */

    public String farbe;
    public String marke;
    public String kennzeichen;
    public int kmStand;
    public int erstzulassungJahr;

    /* Ab hier werden Methoden dieser Klasse definiert */

    public void fahren(){
        System.out.println("Das Auto fährt ...");
    }

    public void hupen(){
        System.out.println("Das AUto hupt ...");
    }

    public void beschreiben(){
        System.out.println("Auto mit Kennezeichen '"+kennzeichen+"' ist "+farbe + " und von Marke " + marke + ".");
    }
}
