package arrays_e_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		// não pode haver duplicação dentro do metodo Map
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//para adicionar ou alterar utilizamos o .put() 
		
	    usuarios.put(1, "Roberto");
	    usuarios.put(2, "Ricardo");
	    usuarios.put(3, "Marta");
	    usuarios.put(4, "Raul");
	    
	    
	    usuarios.remove(3); // remover por chave
	    usuarios.remove(4, "Raul"); // remover por chave e valor
	    System.out.println(usuarios.remove(4, "Raul"));// retorna booleano sobre o remove
	    System.out.println(usuarios.keySet()); //pegar chaves
	    System.out.println(usuarios.values()); // pegar valores
	    System.out.println(usuarios.entrySet()); // pegar valores e chave
	    System.out.println(usuarios.containsKey(3)); // verifica se contem a chave
	    System.out.println(usuarios.containsValue("Roberto")); // verifica se contem a valores
	    System.out.println(usuarios.get(1)); // retorna o conteudo da chave
	    
	    // pecorrendo Chaves do Map
	    for(int chave: usuarios.keySet()) {
	    	System.out.println(chave);
	    }
	    
	    //pecorrendo valores do Map
	    for(String valor: usuarios.values()) {
	    	System.out.println(valor);
	    }
	    
	    //pecorrendo chaves e  valores
	    for(Entry<Integer, String> usuario: usuarios.entrySet()) {
	    	
	    	//O codigo comentado abaixo retorna chave e valor
	    	//System.out.println(usuario);
	    	
	    	
	    	//outra forma de retorno chave e valor
	    	System.out.println("Chave: " + usuario.getKey());
	    	System.out.println("Valor: " + usuario.getValue());
	    	
	    	
	    }
	    
		
		
	}

	

}
