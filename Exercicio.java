package arrays_e_collections;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAluno = new double[3];
		notasAluno[0] = 7.5;
		notasAluno[1] = 5.5;
		notasAluno[2] = 8.5;
		
		
		
		System.out.println(Arrays.toString(notasAluno));
		
		int quantidade_notas = 0;
		double soma = 0;
		for(int i = 0; i < notasAluno.length;i++) {
			
			System.out.println( notasAluno[i]);
			soma += notasAluno[i];
			quantidade_notas ++;
		}
		double media = soma / (notasAluno.length); 
		System.out.printf("Quantidade: %d; Soma: %f; Média: %f ",quantidade_notas,soma,media);
	}

}
