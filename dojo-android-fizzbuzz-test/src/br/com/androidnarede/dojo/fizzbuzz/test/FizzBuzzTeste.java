package br.com.androidnarede.dojo.fizzbuzz.test;

import junit.framework.TestCase;

/**
 * Desafio: FizzBuzz <br/>
 * 
 * Descrição: 
 * Código elaborado durante o Coding Dojo de Android, 
 * do Tá Safo em Ação na FACI - Coding Dojos.
 * 
 * @since 26/12/2013
 * @author ramonrabello
 */
public class FizzBuzzTeste extends TestCase {

	public void testFizzBuzz() {
		Integer numero = 5;
		boolean multiplo3 = numero % 3 == 0;
		boolean multiplo5 = numero % 5 == 0;
		boolean multiplo15 = multiplo3 && multiplo5;

		String resultado = null;

		if (multiplo15) {
			resultado = "FizzBuzz";
		} else if (multiplo3) {
			resultado = "Fizz";
		} else if (multiplo5) {
			resultado = "Buzz";
		} else {
			resultado = numero.toString();
		}
		assertEquals("Buzz", resultado);
	}
}
