package Codigo;

import java.io.IOException;

public interface MecanicaDeJogo {
	
	public boolean comparaPalavra(String palavraEscolhida) throws IOException;
	public boolean jogoAcabou(int numTentativa);
	public String getPalavraAleatoria() throws IOException;
	public String getPalavraEmbaralhada() throws IOException;
	

}
