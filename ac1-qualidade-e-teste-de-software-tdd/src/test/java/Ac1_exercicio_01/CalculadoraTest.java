package Ac1_exercicio_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	Calculadora calc = new Calculadora();
	
	@Test
	public void SomaTest() {
		assertEquals(calc.Soma(1,1), 2);
		assertEquals(calc.Soma(1,2), 3);
		assertEquals(calc.Soma(4,3), 7);
		assertEquals(calc.Soma(0,1), 1);
		assertEquals(calc.Soma(-1,2), 1);
		assertEquals(calc.Soma(-1,-1), -2);
	}
	
	@Test
	public void SubtracaoTest() {
		assertEquals(calc.Subtracao(1,1), 0);
		assertEquals(calc.Subtracao(-1,-1), 0);
		assertEquals(calc.Subtracao(-2,4), -6);
		assertEquals(calc.Subtracao(5,-1), 6);
		assertEquals(calc.Subtracao(0,1), -1);
		assertEquals(calc.Subtracao(10,1), 9);
		assertEquals(calc.Subtracao(5,10), -5);
	}
	
	@Test
	public void MultiplicacaoTest() {
		assertEquals(calc.Multiplicacao(2, 5), 10);
		assertEquals(calc.Multiplicacao(5, 3), 15);
		assertEquals(calc.Multiplicacao(0, 5), 0);
		assertEquals(calc.Multiplicacao(9, 1), 9);
		assertEquals(calc.Multiplicacao(-2, 4), -8);
		assertEquals(calc.Multiplicacao(-1, -6), 6);
	}
	
	@Test
	public void DivisaoTest() {
		assertEquals(calc.Divisao(2, 5), 0.4, 0.1);
		assertEquals(calc.Divisao(5, 2), 2.5, 0.1);
		assertEquals(calc.Divisao(-10, 5), -2, 0.1);
		assertEquals(calc.Divisao(5, -10), -0.5, 0.1);
		assertEquals(calc.Divisao(10, 3), 3.3, 0.1);
		assertEquals(calc.Divisao(-3, 10), -0.3, 0.1);
		assertEquals(calc.Divisao(-9, -10), 0.9, 0.1);
	}

	@Test
	public void FatorialTeste() {
		assertEquals(calc.Fatorial(0), 1);
		assertEquals(calc.Fatorial(1), 1);
		assertEquals(calc.Fatorial(2), 2);
		assertEquals(calc.Fatorial(5), 120);
		assertEquals(calc.Fatorial(8), 40320);
	}
	
	@Test
	public void MediaTeste() {
		assertEquals(calc.Media(7, 10, 5, -2, 3), 4.6, 0.1);
		assertEquals(calc.Media(6, 0, 0, 10, 5), 4.2, 0.1);
		assertEquals(calc.Media(20, 20, 20, 20, 20), 20, 0.1);
		assertEquals(calc.Media(-5, -9, -1, -3, -2), -4, 0.1);
		assertEquals(calc.Media(0, 0, 0, 0, 0), 0, 0.1);
	}

}
