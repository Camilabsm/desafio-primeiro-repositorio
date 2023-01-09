public class Main {
    public static void main(String[] args) {
     

    /* Exercício Calculadora */
    Calculadora.soma(7.9,10);
    Calculadora.subtracao(9, 25);
    Calculadora.multiplicacao(10, 20.6);
    Calculadora.divisao(90, 5.5);

    System.out.println();

    /* Exercício Mensagem Dia */
    MensagemDia.mensagem(9);
    MensagemDia.mensagem(21);
    MensagemDia.mensagem(14);
    MensagemDia.mensagem(55); 
    
    System.out.println();

    /* Aula Sobrecarga */
    Area.area(5d);
    Area.area(5,6);
    Area.area(7,8,9);
    
    System.out.println();
    /* Aula retorno */
    float areaQuad = Area.area(5f);
    System.out.println("A área do quadrado é: " + areaQuad);
    }
}
