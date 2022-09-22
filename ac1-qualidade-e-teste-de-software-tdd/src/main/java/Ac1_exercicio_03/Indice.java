package Ac1_exercicio_03;

import java.util.ArrayList;
import java.util.List;

public class Indice {
	
	List<Integer> list01 = new ArrayList<Integer>();
	List<Integer> list02 = new ArrayList<Integer>();
	
	public int ComparaIndice(int n1,int n2,int n3,int n4,int n5,int n6,int n7,int n8,int n9,int n10) {
		
		list01.clear();
		list02.clear();
		int indices;
		String a = "";
		
		list01.add(n1);
		list01.add(n2);
		list01.add(n3);
		list01.add(n4);
		list01.add(n5);
		list01.add(n6);
		list01.add(n7);
		list01.add(n8);
		list01.add(n9);
		list01.add(n10);
		
		for (int i = 9; i >= 0; i--) {
			list02.add(list01.get(i));
		}
		
		for (int i = 0; i <= list01.size(); i++) {
			if (list01.get(i) == list02.get(i)) {
				a = a.concat(String.valueOf(i));
			}
		}
		indices = Integer.parseInt(a);
		return indices;
	}

}
