package Esercizio2;

import java.util.Scanner;

public class ConInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kmPercorsi;
        int litriConsumati;

        System.out.println("inserisci il numero di km percorsi; ");
        kmPercorsi = scanner.nextInt();

        System.out.println("inserisci i litri consumati: ");
        litriConsumati = scanner.nextInt();

        try {

            int kmPerlitro = kmPercorsi/litriConsumati;
            System.out.println("il consumo è: " + kmPerlitro + "km/litro");
        } catch (ArithmeticException e){
            System.out.println("errore non è possibile dividere per 0");
        }


    }
}
