package Teste;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import Codigo.BancoDePalavras;

public class TesteBancoDePalavras {

	@Test
	public void testGetPalavraAleatoriaBanco() throws IOException {
		
		BancoDePalavras bp = new BancoDePalavras();
		String palavraAleatoria = bp.getPalavraAleatoria();
		
	}

}
