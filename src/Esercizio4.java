import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un primo numero");

        int numerouno = scan.nextInt();

        System.out.println("Inserisci un secondo numero");

        int numerodue = scan.nextInt();

        System.out.println("Inserisci un terzo numero");

        int numerotre = scan.nextInt();

        if (numerouno < numerodue && numerodue < numerotre ){
            System.out.println("I numeri sono in ordine crescente");
        } else if (numerouno > numerodue && numerodue > numerotre) {
            System.out.println("I numeri sono in ordine decrescente");
        }else {
            System.out.println("I numeri non hanno un ordine specifico");
        }
    }
}