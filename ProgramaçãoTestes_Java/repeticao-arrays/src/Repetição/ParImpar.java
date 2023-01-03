package Repetição;

import java.util.Scanner;

public class ParImpar {
public static void main(String[] args) {
    int numero;
    int i = 0;
    int qtdNum;
    int pares = 0;
    int impares = 0;

    Scanner scan = new Scanner(System.in);
    System.out.println("Quantos números você deseja inserir?");
    qtdNum = scan.nextInt();
    
    do{
        System.out.println("Digite um número:");
        numero = scan.nextInt();

        if (numero % 2 == 0){
            pares = pares + 1;
        } else {
            impares = impares + 1;
        }
        i = i+1;
    } while (i < qtdNum);

    System.out.println("A quantidade de números pares é: " + pares);
    System.out.println("A quantidade de números ímpares é: " + impares);
}    

}
