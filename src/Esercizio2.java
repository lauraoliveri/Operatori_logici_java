import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero tra 10 e 50");

        int numero = scan.nextInt();

        if (numero >= 10 && numero <= 50) {
            System.out.println("Ben fatto!");
        }else {
            System.out.println("Il numero inserito non è compreso tra 10 e 50");
        }
    }
}