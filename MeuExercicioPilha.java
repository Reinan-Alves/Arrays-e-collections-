package arrays_e_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class MeuExercicioPilha {

	public static void main(String[] args) {

			
			Deque<String> empilhamento =new ArrayDeque<>();
			int i = 0;
			
			for(i=1;i <= 10;i++) {
				
				empilhamento.push("Numero: "+ i);
			}
			System.out.println("Lista vazia? " + empilhamento.isEmpty());
			
			
			for(String empilhado : empilhamento) {
				System.out.println(empilhado);
				
			}
			
			
			for(String empilhado : empilhamento) {
				System.out.println("apagando " + empilhado);
				empilhamento.pop();
				
			}
			
			System.out.println("Lista vazia? " + empilhamento.isEmpty());
		

	}

}
