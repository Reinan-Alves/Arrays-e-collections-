package arrays_e_collections;

import java.util.HashSet;
import java.util.Set;

public class Conjunto_unico_tipo {
	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<>();
		lista.add("Ana");
		lista.add("Pedro");
		lista.add("Luca");
		lista.add("Carlos");
		//lista.add(50);
		
		System.out.println(lista);
	}

}
