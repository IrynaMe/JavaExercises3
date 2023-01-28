import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("============= Uso dei metodi ============");
        Utilita utilita = new Utilita();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("1 -> Sommare cifre nella stringa");
            System.out.println("2 -> Stampa caratteri compresi tra die caratteri");
            System.out.println("3 -> Stampa 1 o 2 caratteri centrali");
            System.out.println("4 -> Sostituire un carattere");
            System.out.println("5 -> Spostare Zero");
            System.out.println("0 -> Exit");
            System.out.println("Inserisci la scelta: \n");
            String scelta = scanner.nextLine();
            switch (scelta) {
                case "1":
                    utilita.sommaCifre();
                    break;
                case "2":
                    utilita.stampaCaratteri();
                    break;
                case "3":
                    utilita.carattereCentrale();
                    break;
                case "4":
                    utilita.sostituireCarattere();
                    break;
                case "5":
                    utilita.spostareZero();
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Scelta errata, inserisci il numero da 1 a 5");
            }
        } while (true);

    }//
}//