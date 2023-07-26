package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {
	public static void main(String[] args) {
		
		int[]idades=new int[5];
		
		
		for(int i = 0; i<idades.length; i++) {
			idades[i]=i*i;
		}
		for(int i = 0; i<idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		
		
		
		
//		idades[0]= 29;
//		idades[1]= 59;
//		idades[2]= 39;
//		idades[3]= 19;
//		idades[4]= 69;
//		
//		int idade4 = idades[4];
//		
//		System.out.println(idade4);
//		
//		System.out.println(idades.length);
		
		
	}

}
