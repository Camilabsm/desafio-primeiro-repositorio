public class Area {
     
    public static void area(double lado){
        System.out.println("A área do quadrado é: " + lado*lado);
    }
    public static void area (double lado1, double lado2){
        System.out.println("A área do retângulo é: " + lado1*lado2);
    }
    public static void area (double baseMaior, double baseMenor, double altura){
        System.out.println("A área do trapézio é: " + ((baseMaior+baseMenor)*altura)/2);
    }

    /* Com return! */
    public static float area(float ladoQuad){
        return ladoQuad * ladoQuad;
    }
}
