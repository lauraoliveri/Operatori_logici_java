import java.util.Scanner;

public class Esercizio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int numero = scan.nextInt();

        if (numero < -100 || numero > 100){
            System.out.println("Il numero è minore di -100 o maggiore di 100");
        }else {
            System.out.println("Il numero NON è minore di -100 o maggiore di 100");
        }
    }
}