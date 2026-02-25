package trabalho;

import java.util.Scanner;

public class PrimeiroTrabalho {

	public static void main(String[] args) {
		int intTotalAulas;
		int intFaltas;
		double doubleLimiteFaltas;
		char chrResposta;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Coloque as aulas ministradas: ");
		intTotalAulas = ler.nextInt();
		
		System.out.println("Coloque quantas aulas o aluno faltou: ");
		intFaltas = ler.nextInt();
		
		doubleLimiteFaltas = intTotalAulas * 0.25;
		
		if (intFaltas > doubleLimiteFaltas) {
			System.out.println("O aluno reprovou por falta");
		}else {
			System.out.println("O aluno está aprovado");
		}
		
		System.out.println("Deseja realizar a matrícula? (S/N)");
		
		chrResposta = ler.next().charAt(0);
		
		if (chrResposta == 'S'|| chrResposta == 's') {
			System.out.println("A matricula devera ser realizada até o dia 10");
		}else if (chrResposta == 'N' || chrResposta == 'n') {
			System.out.println("Sua matricula sera trancada");
		}else {
			System.out.println("Opção invalida");
		}
		
	}

}
