import java.util.Scanner;

public class Esercizio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un primo numero");

        int numerouno = scan.nextInt();

        System.out.println("Inserisci un secondo numero");

        int numerodue = scan.nextInt();

        System.out.println("Inserisci un terzo nnumero");

        int numerotre = scan.nextInt();

        if (!(numerouno % 2 == 0) && !(numerodue % 2 == 0) && !(numerotre % 2 == 0) ){
            System.out.println("I numeri sono tutti dispari");
        }else {
            System.out.println("I numeri NON sono tutti dispari");
        }
    }
}