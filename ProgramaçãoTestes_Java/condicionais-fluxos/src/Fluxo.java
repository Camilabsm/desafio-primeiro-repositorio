public class Fluxo {
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 5;
        int n3 = 10;

        String diaDaSemana = "Quarta";
        
        /* IF NORMAL

        if (n1 < n2) {
            System.out.println("Expressão verdadeira");
        } else {
            System.out.println("Expressão falsa");
        } */

        /* IF ELSE
        
        if (n1 >= 7){
            System.out.println("Aluno aprovado!");
        } else if (3 < n1 && n1 < 7) {
            System.out.println("Aluno em avaliação final.");
        } else {
            System.out.println("Aluno reprovado.");
        } */

       /* SWITCH COM DIA DA SEMANA
        switch (diaDaSemana){
            case "Segunda": System.out.println("1");
            break;
            case "Terça": System.out.println("2");
            break;
            case "Quarta": System.out.println("3");
            break;
            case "Quinta": System.out.println("4");
            break;
            case "Sexta": System.out.println("5");
            break;
            case "Sábado": System.out.println("6");
            break;
            case "Domingo": System.out.println("7");
            break;
        } */

        switch (n1) {
            case 1:
            case 2:
            case 3:
             System.out.println("Certo");
            break;
            case 4: System.out.println("Errado");
            break;
            case 5: System.out.println("Talvez");
            break;
            default: System.out.println("Valor indefinido");
            break;
        }
    }
}
