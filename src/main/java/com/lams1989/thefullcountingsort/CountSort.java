package com.lams1989.thefullcountingsort;

import java.util.ArrayList;
import java.util.List;

public class CountSort {

	static void countSort(List<List<String>> arr) {
    	
		replaceElement(arr);
    	int[] maxmin=identMinMax(arr);
    	List<List<String>> aux = orderList(arr, maxmin);
    	StringBuilder tome = new StringBuilder(" ");
    	for (int i = 0; i < aux.size(); i++) {
    		tome.append((aux.get(i).get(1) ));
    		tome.append(" ");
    		
    	}
    	System.out.println(tome.toString().trim());
    	
    }

	public static List<List<String>> orderList(List<List<String>> lista, int[] maxmin) {
		List<List<String>> aux = new ArrayList<List<String>>();
		for (int j = maxmin[0]; j <= maxmin[1]; j++) {
			for (int i = 0; i < lista.size(); i++) {

				if (j == Integer.parseInt(lista.get(i).get(0))) {
					aux.add(lista.get(i));
				}

			}
		}
		return aux;
	}

	public static int[] identMinMax(List<List<String>> lista) {
		int[] maxmin = { 0, 0 };
		int[] higherLess = new int[lista.size()];
		String higherList = "";
		for (int i = 0; i < lista.size(); i++) {
			higherList = lista.get(i).get(0);
			int a = Integer.parseInt(higherList);
			higherLess[i] = a;

			if (higherLess[i] > maxmin[1]) {
				maxmin[1] = higherLess[i];
			}
			if (higherLess[i] < maxmin[0]) {
				maxmin[0] = higherLess[i];
			}
		}
		return maxmin;
	}

	public static void replaceElement(List<List<String>> lista) {
		List<String> aux = new ArrayList<String>();

		for (int i = 0; i < lista.size() / 2; i++) {
			aux = lista.get(i);
			aux.set(1, "-");

		}

	}

}
