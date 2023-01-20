import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);


		int jogadaJogador = leitor.nextInt();
		int jogadaInimigo = leitor.nextInt();
		// 1 - pedra - flexa
		// 2 - papel - escudo
		// 3 - tesoura - espada


		if (jogadaJogador == jogadaInimigo) {
			System.out.println("Empatou");
		}

		else if (jogadaJogador == 1 && jogadaInimigo == 3 || jogadaJogador == 2 && jogadaInimigo == 1
				|| jogadaJogador == 3 && jogadaInimigo == 2) {
			System.out.println("Ganhou");
		}

		else {
			System.out.println("Perdeu");
		}
	}
}