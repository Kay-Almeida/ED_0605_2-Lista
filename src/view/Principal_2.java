package view;

import model.Lista;

public class Principal_2 {
	public static void main(String[] args) throws Exception {
		
		Lista<Integer> l1 = new Lista<Integer>(); 
		Lista<Integer> l2 = new Lista<Integer>();
		Lista<Integer> l3 = new Lista<Integer>();

		
		int vetor1 [] = {1,7}; 
		int tamanho1 = vetor1.length; 
		int vetor2 [] = {3, 4, 8}; 
		int tamanho2 = vetor2.length; 
		
		for(int i=0; i<tamanho1; i++) {
			if(i==0) {
				l1.addFirst(vetor1[i]);
			}else {
				l1.addLast(vetor1[i]);
			}
		}
		
		for(int i=0; i<tamanho2; i++) {
			if(i==0) {
				l2.addFirst(vetor2[i]);
			}else {
				l2.addLast(vetor2[i]);
			}
		}
		int cont1=0; 
		int cont2=0; 
		
		for(int i=0; i<4; i++) {
			if(l3.isEmpty()) {
				if(l1.get(cont1)>l2.get(cont2)) {
					l3.addFirst(l2.get(cont2));
					cont2++; 
				}else {
					l3.addFirst(l1.get(cont1));
					cont1++; 
				}
			}else {
				if(l1.get(cont1)>l2.get(cont2)) {
					l3.add(l2.get(cont2), i);
					cont2++; 
				}else {
					l3.add(l1.get(cont1), i);
					cont1++; 
				}
			}
		}
		l3.addLast(l2.get(cont2));
		
		while(!l3.isEmpty()) {
			System.out.print(l3.get(0)+ " ");
			l3.removeFirst();
		}
		
		
	}

}
