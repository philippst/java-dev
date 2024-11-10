/**
 * Main Klasse des Programms mit Beispielen zur Definition und Erstellung von Arrays.
 */
public class Main {

    /**
     * Die main Methode ermöglicht die Ausführung des Programmes. Sie stellt den Einstiegspunkt in die Ausführung der
     * Java-Anwendung dar und muss die Signatur `public static void main(String[] args)` besitzen.
     */
    public static void main(String[] args) {

        /*
        Variante 1: Sehr ausführliche Schritt für Schritt Lösung
         */

        String[] studentenNamen;            // Schritt 1: Variable definieren, die Array von Strings enthalten kann
        studentenNamen = new String[10];    // Schritt 2: Variable wird mit einem Array aus 10 Elementen initialisiert
        studentenNamen[0] = "John";         // Schritt 3: Elemente des Arrays werden mit Inhalten befüllt
        studentenNamen[1] = "Mary";
        studentenNamen[2] = "Jane";
        studentenNamen[7] = "Bob";

        System.out.println("### Variante 1: Studierenden Namen ###");
        for(String student : studentenNamen) {  // Schritt 4: For-Schleife gibt Namen der Studierenden in Console aus
            System.out.println("Studierende Name: " + student);
        }


        /*
        Variante 2: Deutlich kürzere Variante mit weniger Programmcode
         */

        String[] studentenNamen2 = {"John", "Mary", "Jane", "Bob"};
        System.out.println("\n### Variante 2: Studierenden Namen ###");
        for(String student : studentenNamen2) {
            System.out.println("Studierende Name: " + student);
        }

    }
}