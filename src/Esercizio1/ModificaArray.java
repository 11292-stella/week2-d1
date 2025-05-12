package Esercizio1;

import java.util.Scanner;

public class ModificaArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] interi = {1, 2, 3, 4, 5};


        System.out.println("Contenuto iniziale dell'array:");
        for (int i = 0; i < interi.length; i++) {
            System.out.println("Posizione " + i + ": " + interi[i]);
        }


        while (true) {

            System.out.println("Scegli una posizione da 0 a 4 (o 0 per uscire):");
            int posizione = scanner.nextInt();

            if (posizione == 0) {
                break;
            }

            if (posizione < 0 || posizione > 4) {
                System.out.println("Posizione non valida, prova di nuovo.");
                continue;
            }

            System.out.println("Inserisci il numero da inserire:");
            int numero = scanner.nextInt();


            try {
                interi[posizione] = numero;


                System.out.println("Nuovo contenuto dell'array:");
                for (int i = 0; i < interi.length; i++) {
                    System.out.println("Posizione " + i + ": " + interi[i]);
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posizione non valida: inserisci un numero tra 0 e 4.");
            }
        }


    }
}
















