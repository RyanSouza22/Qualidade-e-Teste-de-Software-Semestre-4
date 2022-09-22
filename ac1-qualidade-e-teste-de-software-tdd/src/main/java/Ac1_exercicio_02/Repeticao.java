package Ac1_exercicio_02;

import java.util.ArrayList;
import java.util.List;

public class Repeticao {
	
	List<Integer> numbers = new ArrayList<Integer>();
	
	public int PopulandoList(int n1,int n2,int n3,int n4,int n5,int n6,int n7,int n8,int n9,int n10, int proc){
		
		int qtde=0;
		numbers.clear();
		
		numbers.add(n1);
		numbers.add(n2);
		numbers.add(n3);
		numbers.add(n4);
		numbers.add(n5);
		numbers.add(n6);
		numbers.add(n7);
		numbers.add(n8);
		numbers.add(n9);
		numbers.add(n10);
		
		for (int procurado : numbers) {
			if (proc == procurado) {
				qtde++;
			}
		}
		
		return qtde;
	}
}
