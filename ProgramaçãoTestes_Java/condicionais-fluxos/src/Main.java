import java.util.*;
 
public class Main{

public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
		
    int M = input.nextInt();
    int D = input.nextInt();  
    
    //TODO:  Retorne o percentual de desconto que foi aplicado no produto
      
    int desconto = (((M-D)*100)/M);

    System.out.println("O desconto foi de " + desconto + "%");
  
}
}