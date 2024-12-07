public class Main {
    public static void main(String[] args) {

        Kunde kunde1 = new Kunde();
        kunde1.setName("Muster Kunde");
        kunde1.setAddress("Musterstr 12");

        Konto konto1 = new Konto();
        konto1.setKunde(kunde1);
        konto1.setId(123);
        konto1.setSaldo(100.00);

        Konto konto2 = new Konto();
        konto2.setKunde(kunde1);
        konto2.setId(123);
        konto2.setSaldo(100.00);

        // Über die Methode .getClass().getName() wird der Name der Klasse ausgegeben
        System.out.println("Es handelt sich um die Klasse: " + konto2.getClass().getName());

        // Die überschriebene Methode .equals() wird genutzt um zu prüfen ob Konten identisch sind
        System.out.println("Sind die Konten identisch? " + konto1.equals(konto2));

        // Die System-Klasse wird genutzt um die Systemzeit auszugeben
        System.out.println("Systemzeit: " + System.currentTimeMillis());

        // Die System-Klasse wird genutzt um auf System Properties zuzugreifen, z.B. Betriebssystem Version
        String osName = System.getProperty("os.name");
        String osArch = System.getProperty("os.arch");
        String osVersion = System.getProperty("os.version");
        System.out.println("Betriebssystem: " + osName + " " + osArch + " " + osVersion);
    }
}