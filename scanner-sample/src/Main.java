import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hallo, wie heißt du?");

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        System.out.println("Ok, du heißt: "+line);

        int alter = askForInt("Wie alt bist du?");
        System.out.println("Alter: " +alter);

    }

    public static int askForInt(String prompt){
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            return sc.nextInt();
        } else {
            System.out.println("Das war keine Zahl. Bitte erneut...");
            return askForInt(prompt);
        }
    }
}