package Arrays;

public class OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {-5, -6, 15, 50, 8, 4};
        int i = 0;
        
        System.out.print("Vetor: ");
        while (i < vetor.length) {
            System.out.print(vetor[i] + " ");
            i++;
        }

        System.out.print("\nVetor: ");
        for(int x = (vetor.length - 1); x >= 0; x --){
            System.out.print(vetor[x] + " ");
        }

    }
}
