package Ac1_exercicio_03;

import static org.junit.Assert.*;
import org.junit.Test;

public class IndiceTest {

	Indice idc = new Indice();
	
	@Test
	public void exercicioIndiceTest() {
		
		assertEquals(idc.ComparaIndice(1, 1, 2, 3, 3, 3, 3, 1, 2, 2),3456);
		assertEquals(idc.ComparaIndice(-1, 1, 2, 3, 8, 5, 3, 1, 2, 2),36);
		assertEquals(idc.ComparaIndice(1, 0, 0, 0, 0, 3, 3, 1, 0, 2),18);
		assertEquals(idc.ComparaIndice(2, 8, 8, 7, 1, 5, 6, 8, 6, 2),27);
	}

}
