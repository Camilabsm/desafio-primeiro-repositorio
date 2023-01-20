import java.util.*;

public class NumeroFeliz
{
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
             int n = scan.nextInt();
             int[] ints = new int[4];


            do {
            int i = 0;
             
            do{
                ints[i] = n % 10;
                n = n/10;
                i = i + 1;    
            } while (n > 0);
        
            int soma = 0;

            for (int x = 0; x < ints.length; x++){
            soma = soma + (ints[x]*ints[x]);
            }
            n = soma;
            Arrays.fill(ints, 0);
        } while (n >= 10);  

        if (n == 1){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}