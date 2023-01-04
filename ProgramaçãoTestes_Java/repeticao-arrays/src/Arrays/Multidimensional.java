package Arrays;
import java.util.Random;
public class Multidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] M = new int[4][4];

        for (int index = 0; index < M.length; index++) {
            for (int i = 0; i < M[index].length; i++) {
                M[index][i] = random.nextInt(9);
            }
        }
    
        System.out.println("Matriz: ");
        for (int index = 0; index < M.length; index++) {
            for (int i = 0; i < M[index].length; i++) {
                System.out.print(M[index][i] + " ");
           }
           System.out.println();
        }
        /* for ( int[] linha : M  ){
            for ( int elementoDaColuna : linha){
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();
        } */

    }
}
