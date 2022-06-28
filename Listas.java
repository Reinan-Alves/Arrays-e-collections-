package arrays_e_collections;

import java.util.ArrayList;

public class Listas {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario("Ana");
		lista.add((u1));
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		for(Usuario usuario: lista) {
			
			System.out.println(usuario.nome);
			
		}
		
		//imprimindo pelo indice:
		
		System.out.println("indice 3: " + lista.get(3).nome);
		// é possivel a exibição do /objeto devido ao metodo toString usado na classe
		System.out.println(lista.get(1));
		
		
            //removendo pelo index:

			lista.remove(1);

			//removendo pelo objeto:
			lista.remove(new Usuario("Manu"));

			for(Usuario usuario: lista) {
				
				System.out.println(usuario.nome);
				
			}
			
			
			//Verificar se o elemento contem na Lista
            
			String usuario = "Lia";
			System.out.println("O usuario de nome " + usuario + " contem na lista? " +  lista.contains(new Usuario(usuario)));
			
			
		
		

	}

}
