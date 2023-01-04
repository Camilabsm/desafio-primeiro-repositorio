package Arrays;
import java.util.Scanner;
import java.util.Random;
public class NumAleatorios {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Random random = new Random();

      int[] vetor = new int[20];

      for (int i = 0; i < vetor.length; i++) {
        vetor[i] = random.nextInt(100);

      }
    
      System.out.println("Vetor + Sucessores");
      for (int x = 0; x < vetor.length; x++) {
        System.out.print(vetor[x] + " " + (vetor[x] + 1) + " ");
      }
    }
}
