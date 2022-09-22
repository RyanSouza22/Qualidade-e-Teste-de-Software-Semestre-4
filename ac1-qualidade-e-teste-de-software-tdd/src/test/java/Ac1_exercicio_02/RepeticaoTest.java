package Ac1_exercicio_02;

import static org.junit.Assert.*;

import org.junit.Test;

public class RepeticaoTest {
	
	Repeticao entrada = new Repeticao();

	@Test
	public void exercicioTest() {
		assertEquals(entrada.PopulandoList(1, 1, 2, 3, 3, 3, 3, 1, 2, 2, 3), 4);
		assertEquals(entrada.PopulandoList(-1, 1, 2, 3, 8, 5, 3, 1, 2, 2, -1), 1);
		assertEquals(entrada.PopulandoList(1, 0, 0, 0, 0, 3, 3, 1, 0, 2, 0), 5);
		assertEquals(entrada.PopulandoList(10, 1, 2, 3, 3, 3, 3, 1, 2, 2, 10), 1);
		assertEquals("Numero nao Encontrado", entrada.PopulandoList(10, 1, 2, 3, 3, 3, 3, 1, 2, 2, 15), 0);
	}

}
