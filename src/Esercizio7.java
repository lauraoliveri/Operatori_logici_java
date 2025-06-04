import java.util.Scanner;

public class Esercizio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un primo numero");

        int numerouno = scan.nextInt();

        System.out.println("Inserisci un secondo numero");

        int numerodue = scan.nextInt();

        if (numerouno > 0 && numerodue > 0){
            System.out.println("Entrambi i numeri sono positivi");
        }else if ((numerouno < 0 || numerodue < 0) && (numerouno > 0 || numerodue > 0)){
            System.out.println("Un numero è positivo e l’altro negativo");
        }else{
            System.out.println("Entrambi i numeri sono negativi");
        }
    }
}