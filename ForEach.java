package arrays_e_collections;

public class ForEach {

	public static void main(String[] args) {
		
     double[] notas = {9.9, 8.7, 7.2, 9.4};
     int cont =0;
     
     for(double nota: notas) {
    	 
    	 System.out.println("Nota "+ ++cont + " = " + nota);
    	 
     }

	}

}
