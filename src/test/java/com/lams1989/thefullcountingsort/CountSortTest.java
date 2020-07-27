package com.lams1989.thefullcountingsort;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class CountSortTest extends TestCase {

	public void testReplaceElement() {
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
	                
		 List<List<String>> expected = Arrays.asList(
				 	Arrays.asList("0", "-"),
				 	Arrays.asList("6", "-"),
				 	Arrays.asList("0", "-"),
	                Arrays.asList("6", "-"),
	                Arrays.asList("4", "-"),
	                Arrays.asList("0", "-"),
	                Arrays.asList("6", "-"),
	                Arrays.asList("0", "-"),
	                Arrays.asList("6", "-"),
	                Arrays.asList("0", "-"),
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
	
			CountSort.replaceElement(lista);

			for (int i = 0; i < lista.size(); i++) {
				assertEquals(expected.get(i).get(1), lista.get(i).get(1));
			}

		}
	public void testIdentHigher() {
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
		
		int[] expected = {0, 6};
		int[] actual = CountSort.identMinMax(lista);

		for (int i = 0; i < expected.length; i++) {

		assertEquals(expected[i], actual[i] );
		}
	}
	
	public void testOrderList() {
		List<List<String>> lista = Arrays.asList(
			 	Arrays.asList("0", "-"),
			 	Arrays.asList("6", "-"),
			 	Arrays.asList("0", "-"),
                Arrays.asList("6", "-"),
                Arrays.asList("4", "-"),
                Arrays.asList("0", "-"),
                Arrays.asList("6", "-"),
                Arrays.asList("0", "-"),
                Arrays.asList("6", "-"),
                Arrays.asList("0", "-"),
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
		
		List<List<String>> expected = Arrays.asList(
			 	Arrays.asList("0", "-"),
			 	Arrays.asList("0", "-"),
                Arrays.asList("0", "-"),
                Arrays.asList("0", "-"),
                Arrays.asList("0", "-"),
                Arrays.asList("0", "to"),
                Arrays.asList("1", "be"),
                Arrays.asList("1", "or"),
                Arrays.asList("2", "not"),
                Arrays.asList("2", "to"),
                Arrays.asList("3", "be"),
                Arrays.asList("4", "-"),
                Arrays.asList("4", "that"),
                Arrays.asList("4", "is"),
                Arrays.asList("4", "the"),  
				Arrays.asList("5", "question"),
			 	Arrays.asList("6", "-"),
                Arrays.asList("6", "-"),
                Arrays.asList("6", "-"),
                Arrays.asList("6", "-"));  
		
		int [] maxmin = CountSort.identMinMax(lista);
		List<List<String>> actual = CountSort.orderList(lista, maxmin);
		
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i).get(0), actual.get(i).get(0));
		}
		
		
	}

	}
