package Esercizio3;

import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContoCorrente conto = new ContoCorrente(100.00,0);
        ContoOnline  co = new ContoOnline(100.0,0,50);

        while (true) {
            try {
                System.out.println("inserisci importo da prelevare");
                double importo = scanner.nextDouble();

                conto.preleva(importo);
                System.out.println("prelievo effettuato con successo");

            } catch (BancaException e) {
                System.out.println("errore: " + e.getMessage());
                break;
            }
        }

        while (true) {

            try {
                System.out.println("Inserisci l'importo da prelevare dal ContoOnline:");
                double importo2 = scanner.nextDouble();
                co.preleva(importo2);
                System.out.println("Prelievo da ContoOnline riuscito! Saldo: " + co.getSaldo());
            } catch (BancaException e) {
                System.out.println("Errore ContoOnline: " + e.getMessage());
            }


            System.out.println("saldo attuale: " + conto.getSaldo());
            System.out.println("numero di prelievi: " + conto.getContatorePrelievi());

        }





    }
}
