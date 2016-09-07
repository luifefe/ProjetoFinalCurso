package Codigo;

import java.io.IOException;

public class MecanicaDificil implements MecanicaDeJogo {
	
	public MecanicaDificil() throws IOException {
		
	}
	
	BancoDePalavras bancoPalavras = new BancoDePalavras();
	FabricaDeEmbaralhador fabricaEmbaralhador = new FabricaDeEmbaralhador();
	private String palavraAleatoria = bancoPalavras.getPalavraAleatoria();
	private String palavraEmbaralhada = fabricaEmbaralhador.getEmbaralhadorAleatorio().embaralhaPalavra(palavraAleatoria);
	private boolean acertou;
	

	@Override
	public boolean comparaPalavra(String palavraEscolhida) throws IOException {
		if(palavraAleatoria.equals(palavraEscolhida)){
			acertou = true;
			return acertou;
		}
		acertou = false;
		return acertou;
	}

	@Override
	public boolean jogoAcabou(int numTentativa) {
		if(numTentativa == 3 || acertou){
			return true;
		}
		return false;
	}

	@Override
	public String getPalavraAleatoria() throws IOException {
		
		return palavraAleatoria;
	}

	@Override
	public String getPalavraEmbaralhada() throws IOException {
		
		return palavraEmbaralhada;
	}

}
