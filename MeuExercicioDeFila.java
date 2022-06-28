package arrays_e_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MeuExercicioDeFila {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<String> pessoas = new LinkedList<String>();
		
		
		for(int i = pessoas.size();i <= 5;i++) {
			
			System.out.println("nome da pessoa que esta entrando na fila: ");
			pessoas.add(scan.nextLine());
			
		}
		
		for(String pessoa: pessoas) {
			System.out.println(pessoa);
		}
		
		scan.close();
		
	}

}
