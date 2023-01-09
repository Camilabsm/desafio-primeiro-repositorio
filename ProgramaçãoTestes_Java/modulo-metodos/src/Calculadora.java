public class Calculadora {
    public static void soma(double numero1, double numero2) {

        double soma = numero1 + numero2;
        System.out.println("A soma dos números " + numero1 + " e " + numero2 + " é: " + soma);
     }
    
    public static void subtracao(double numero1, double numero2) {

        double subtracao = numero1 - numero2;
        System.out.println("A subtração do número " + numero1 + " pelo número " + numero2 + " é: " + subtracao);
     }
    
    public static void multiplicacao(double numero1, double numero2) {

        double multi = numero1 * numero2;
        System.out.println("A multiplicação dos números " + numero1 + " e " + numero2 + " é: " + multi);
     }
    
    public static void divisao(double numero1, double numero2) {

        double divisao = numero1 / numero2;
        System.out.println("A divisão do número " + numero1 + " pelo número " + numero2 + " é: " + divisao);
     }
    }
