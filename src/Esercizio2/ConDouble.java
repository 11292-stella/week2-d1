package Esercizio2;

import java.util.Scanner;

public class ConDouble {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double kmPercorsi;
        double litriConsumati;

        System.out.println("inserisci il numero di km percorsi; ");
        kmPercorsi = scanner.nextDouble();

        System.out.println("inserisci i litri consumati: ");
        litriConsumati = scanner.nextDouble();

        try {

            double kmPerlitro = kmPercorsi/litriConsumati;
            System.out.println("il consumo è: " + kmPerlitro + "km/litro");
        } catch (ArithmeticException e){
            System.out.println("errore non è possibile dividere per 0");
        }


    }
}
