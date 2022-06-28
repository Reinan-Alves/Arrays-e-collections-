package arrays_e_collections;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a quatidade de notas a receber");
		int quantidade = scan.nextInt();
		scan.nextLine();
		double[] notas = new double[quantidade];
		
		for(int i= 0;i < notas.length; i++) {
			
			System.out.printf("informe a %d° nota \n",i+1);
			notas[i] = scan.nextDouble();
			scan.nextLine();
			
		}


		double soma =0;
		double media = 0;
		
		for(double nota: notas) {
			
			soma += nota;
			
		}
		media = soma/notas.length;
		
		System.out.println("Media :" + media);
		
		scan.close();
	}

}
