package Repetição;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int fatorial = 1;
        
        System.out.println("De qual número você deseja saber o fatorial?");
        numero = scan.nextInt();

        for (int i = numero; i >= 1; i--){
            fatorial = fatorial*i;
        }

        System.out.println("O fatorial do número " + numero + " é: " + fatorial);
    }
}
