import java.util.Arrays;
import java.util.Scanner;

public class Utilita {
    Utilita utilita;
    Scanner scanner = new Scanner(System.in);

    public void sommaCifre() {
        int somma = 0;

        System.out.println("Inserisci una stringa  \n");
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                //System.out.println("cifra "+string.charAt(i));
                somma += Character.getNumericValue(string.charAt(i));
                //System.out.println("somma "+somma);
            }
        }
        if (somma > 0) {
            System.out.println("---------------------------------------");
            System.out.println("Somma delle cifre nella stringa: " + somma);
            System.out.println("---------------------------------------");
        } else {
            System.out.println("---------------------------------------");
            System.out.println("Impossibile stampare somma: non ci sono le cifre nella stringa");
            System.out.println("---------------------------------------");
        }

    }

    public void stampaCaratteri() {

        System.out.println("Inserisci una stringa  \n");
        String string = scanner.nextLine();
        System.out.println("Inserisci il primo carattere  \n");
        String char1 = scanner.next();
        System.out.println("Inserisci il secondo carattere  \n");
        String char2 = scanner.next();

        if (string.contains(char1) && string.contains(char2)) {
            String[] pezzo1 = string.split(char1);
            String[] pezzo2 = pezzo1[1].split(char2);

            System.out.println("---------------------------------------");
            System.out.printf("Le carattere tra %s e %s sono: %s\n", char1, char2, pezzo2[0]);
            System.out.println("---------------------------------------");
        } else {
            System.out.println("---------------------------------------");
            System.out.println("Inserimento di caratteri errato. Inserisci caratteri che la stringa contiene");
            System.out.println("---------------------------------------");
        }


        //string.getChars();
        //string.split();

    }

    public void carattereCentrale() {
        System.out.println("Inserisci una stringa di almeno 3 caratteri \n");
        String string = scanner.nextLine();
        int start = 0;

        if ((string.length()>3)&& (string.length() % 2 == 0)) {
            start = string.length() / 2 - 1;
            System.out.println("---------------------------------------");
            System.out.println("I caratteri centrali : " + string.charAt(start) + string.charAt(start + 1));
            System.out.println("---------------------------------------");

        } else if((string.length()>=3)&& (string.length() % 2 != 0)) {
            start = (int) string.length() / 2;
            System.out.println("---------------------------------------");
            System.out.println("Il carattere centrale: " + string.charAt(start));
            System.out.println("---------------------------------------");
        }else {
            System.out.println("---------------------------------------");
            System.out.println("Inserimento errato, la stringa deve avere al meno 3 caratteri");
            System.out.println("---------------------------------------");
        }
    }

    public void sostituireCarattere() {
        System.out.println("Inserisci una stringa  \n");
        String string = scanner.nextLine();
        System.out.println("Inserisci un carattere da sostituire \n");
        String char1 = scanner.next();
        System.out.println("Inserisci un nuovo carattere \n");
        String char2 = scanner.next();
        String result = string.replace(char1, char2);
        System.out.println("---------------------------------------");
        System.out.println("Nuova stringa: " + result);
        System.out.println("---------------------------------------");

    }

    public void spostareZero() {

        System.out.println("Inserisci i numeri interi, divisi con ',' es. 1,2,0,3,4,0,5,6  \n");
        String string = scanner.nextLine();
        //String inputDati = scanner.next();
        //split #

        System.out.println("Stringa co spostato '0': ");


        String arr[] = string.split(",");

        int posizione = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("0")) {
                arr[posizione] = arr[i];
                // System.out.print(arr[posizione] );
                posizione++;
            }

        }

        for (int i = posizione; i < arr.length; i++) {
            arr[i] = "0";
        }
        System.out.println("---------------------------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------------------");
    }

}//end utilita
