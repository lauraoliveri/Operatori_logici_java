import java.util.Scanner;

public class Esercizio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un primo numero");

        int numerouno = scan.nextInt();

        System.out.println("Inserisci un secondo numero");

        int numerodue = scan.nextInt();

        if ((numerouno %2==0) || (numerodue %2==0)){
            System.out.println("Uno dei due numeri è pari");
        }else {
            System.out.println("Nessuno dei due numeri è pari");
        }
    }
}