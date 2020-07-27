package com.lams1989.thefullcountingsort;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
	
		 List<List<String>> lista = Arrays.asList(
				 	Arrays.asList("0", "ab"),
				 	Arrays.asList("6", "cd"),
				 	Arrays.asList("0", "ef"),
	                Arrays.asList("6", "gh"),
	                Arrays.asList("4", "ij"),
	                Arrays.asList("0", "ab"),
	                Arrays.asList("6", "cd"),
	                Arrays.asList("0", "ef"),
	                Arrays.asList("6", "gh"),
	                Arrays.asList("0", "ij"),
	                Arrays.asList("4", "that"),
	                Arrays.asList("3", "be"),
	                Arrays.asList("0", "to"),
	                Arrays.asList("1", "be"),
	                Arrays.asList("5", "question"),
	                Arrays.asList("1", "or"),
	                Arrays.asList("2", "not"),
	                Arrays.asList("4", "is"),
	                Arrays.asList("2", "to"),
	                Arrays.asList("4", "the"));
		 
		CountSort.countSort(lista);
	}
}
