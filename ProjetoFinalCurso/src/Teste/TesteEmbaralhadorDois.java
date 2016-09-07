package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import Codigo.EmbaralhadorDois;

public class TesteEmbaralhadorDois {

	@Test
	public void testEmbaralhadorDois() {
		EmbaralhadorDois em2 = new EmbaralhadorDois();
		String teste = em2.embaralhaPalavra("terra");
		assertEquals("arre",teste);
	}

}
