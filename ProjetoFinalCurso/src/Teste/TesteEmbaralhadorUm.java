package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Codigo.EmbaralhadorUm;

public class TesteEmbaralhadorUm {

	@Test
	public void testEmabaralhadorUm() {
		EmbaralhadorUm em1 = new EmbaralhadorUm();
		String var = em1.embaralhaPalavra("orgulho");
		assertNotEquals(var,"orgulho");
	}

}
