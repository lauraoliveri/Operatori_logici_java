import java.util.Scanner;

public class Esercizio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int numero = scan.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0){
            System.out.println("Il numero è divisibile sia per 3 che per 5");
        }else {
            System.out.println("Il numero NON è divisibile sia per 3 che per 5");
        }
    }
}