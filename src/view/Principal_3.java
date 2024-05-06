package view;

import model.Lista;

public class Principal_3 {
	public static void main(String[] args) throws Exception {
		
		Lista<Integer> l = new Lista<Integer>(); 
		
		int vetor [] = {3, 5, 8, 12, 9, 7, 6, 2, 3, 7, 16}; 
		int tamanho = vetor.length; 
		
		for(int i=0; i<tamanho; i++) {
			if(i==0) {
				l.addFirst(vetor[i]);
			}else {
				l.addLast(vetor[i]);
			}
		}
		
		int ltamanho = l.size(); 
		
	for(int i=0; i<ltamanho; i++){
		for(int j=0; j<ltamanho-1; j++){
			if(l.get(j)>l.get(j+1)){
				int maior = l.get(j);
				int menor = l.get(j+1);  
				l.remove(j); 
				l.remove(j); 
				l.add(maior, j); 
				l.add(menor, j); 
			}
		}
	}	
	System.out.println(l.get(ltamanho-1));
	l.removeLast();
	System.out.println(l.get(ltamanho-2));
	l.removeLast();		
}
}
