import java.util.Scanner; 
 
public class RPG { 
    public static void main(String[] args){ 
        Scanner leitor = new Scanner(System.in); 
 
        int dados = leitor.nextInt(); 
        int vidaDoJogador = leitor.nextInt(); 
        int ataqueDoJogador= leitor.nextInt(); 
        int defesaDoJogador = leitor.nextInt(); 
        int vidaDoInimigo= leitor.nextInt(); 
        int ataqueDoInimigo = leitor.nextInt();

        if (dados > 0 && dados <=8){
        int danoAoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados));
        int danoAoInimigo = vidaDoInimigo - (ataqueDoJogador + dados);
            if (danoAoJogador <= 0) {
                System.out.println("Jogador nao sobreviveu");
            } else {
                if (danoAoInimigo <= 0){
                    System.out.println("Jogador sobreviveu e derrotou o inimigo");
                } else {
                    System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
                }
            }
        } else if (dados > 8 && dados <= 10) {
        int danoAoJogador = vidaDoJogador - (ataqueDoInimigo - (2*(defesaDoJogador + dados)));
        int danoAoInimigo = vidaDoInimigo - (2*(ataqueDoJogador + dados));
        if (danoAoJogador <= 0) {
            System.out.println("Jogador nao sobreviveu");
        } else {
            if (danoAoInimigo <= 0){
                System.out.println("Jogador sobreviveu e derrotou o inimigo");
            } else {
                System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
            }
        }
    } else System.out.println("Número de dado inválido.");
    }
}