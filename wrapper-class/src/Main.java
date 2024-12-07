public class Main {
    public static void main(String[] args) {

        // Zeichenkette in Zahl umwandeln
        String a = "10500";
        int x = Integer.parseInt(a);
        System.out.println("Zahl: " + x);

        // Zahl in Zeichenkette umwandeln
        double y = 123.76;
        String b = String.valueOf(y);
        System.out.println("String: " + b);

        // Zahl als Dual-, Hexadezimal- bzw. Oktalzahl darstellen
        System.out.println("Dualzahl: " + Integer.toBinaryString(61695));
        System.out.println("Hexadezimalzahl: " + Integer.toHexString(61695));
        System.out.println("Oktalzahl: " + Integer.toOctalString(61695));

        // Zeichen testen
        char c = '8';
        System.out.println("Ziffer? " + Character.isDigit(c));

        // Numerische Konstanten
        System.out.println("byte Min: " + Byte.MIN_VALUE);
        System.out.println("byte Max: " + Byte.MAX_VALUE);
        System.out.println("short Min: " + Short.MIN_VALUE);
        System.out.println("short Max: " + Short.MAX_VALUE);
        System.out.println("int Min: " + Integer.MIN_VALUE);
        System.out.println("int Max: " + Integer.MAX_VALUE);
        System.out.println("long Min: " + Long.MIN_VALUE);
        System.out.println("long Max: " + Long.MAX_VALUE);
        System.out.println("float Min: " + Float.MIN_VALUE);
        System.out.println("float Max: " + Float.MAX_VALUE);
        System.out.println("double Min: " + Double.MIN_VALUE);
        System.out.println("double Max: " + Double.MAX_VALUE);

    }
}