import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un primo numero");

        int numerouno = scan.nextInt();

        System.out.println("Inserisci un secondo numero");

        int numerodue = scan.nextInt();

       if (numerouno == numerodue) {
           System.out.println("I numeri sono uguali");
       }else if ((numerouno * -1 == numerodue) || (numerodue * -1 == numerouno)) {
           System.out.println("I numeri sono opposti");
       }else {
           System.out.println("I numeri non sono ne uguali ne opposti");
       }
    }
}