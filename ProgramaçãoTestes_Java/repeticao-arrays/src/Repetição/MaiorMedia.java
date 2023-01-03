package Repetição;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numero;
        int i = 0;
        int maior = 0;
        double media = 0;

        do{
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            i = i + 1;

            if (numero > maior) maior = numero;

            media = media + numero;
        } while (i < 5);
    
        System.out.println("O maior número entre os digitados é: " + maior);
        System.out.println("A média dos números digitados é: " + (media/i));
    }

}