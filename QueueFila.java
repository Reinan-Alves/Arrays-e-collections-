package arrays_e_collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//Diferença entre .add e offer
		//add gera um erro caso  e offer retorna false
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.add("Gui");
		
		// ambos pegam um elemento da fila sem alterar a mesma, 
		//diferença é que no element se a fila estiver vazia retorna um erro
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		//fila.clear() limpa
		//fila.isEmpty() verifica se esta vazio
		//fila.size() retorna o tamanho
		System.out.println(fila.size());
		System.out.println(fila.isEmpty());
		
		
		
		//fila.poll() retorna o elemento da fila e apaga  retrna nulo om fila vazia
		//fila.remove(); retorna o elemento da fila e apaga. retorna erro com lista vazia
		
		
		
	}

}
