import java.util.Scanner;

public class Esercizio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Questo è un programma che prende tre numeri e verifica se il primo è compreso tra il secondo e il terzo, ma non è uguale a nessuno dei due.");
        System.out.println("Inserisci un primo numero");

        int numerouno = scan.nextInt();

        System.out.println("Inserisci un secondo numero");

        int numerodue = scan.nextInt();

        System.out.println("Inserisci un terzo numero");

        int numerotre = scan.nextInt();

        if (numerouno != numerodue && numerouno != numerotre){
            if (numerouno > numerodue && numerouno < numerotre){
                System.out.println("Il " + numerouno + " è compreso tra " + numerodue + " e " + numerotre);
            }else {
                System.out.println("Il " + numerouno + " NON è compreso tra " + numerodue + " e " + numerotre);
            }
        }else {
            System.out.println("Il " + numerouno + " è uguale al numero due o al numero tre");
        }
    }
}