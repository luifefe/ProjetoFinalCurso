package Codigo;

import java.io.IOException;

public class MecanicaFacil implements MecanicaDeJogo  {
	
	private boolean acertou = false;
	private FabricaDeEmbaralhador fabEmbaralhador = new FabricaDeEmbaralhador();
	BancoDePalavras bancoPalavras = new BancoDePalavras();
	private String palavraEscolhidaAleatoria = bancoPalavras.getPalavraAleatoria();
	private String palavraEmbaralhada = fabEmbaralhador.getEmbaralhadorAleatorio().embaralhaPalavra(palavraEscolhidaAleatoria);

	public MecanicaFacil() throws IOException {
		
	} 
	@Override
	public boolean comparaPalavra(String palavraEscolhidaUsuario) throws IOException {
		if(palavraEscolhidaUsuario.equals(getPalavraAleatoria())){
			acertou = true;
			return acertou;
		}
		acertou = false;
		return acertou;
	}

	@Override
	public boolean jogoAcabou(int numTentativa) {
		if(numTentativa == 5 || acertou ){
			return true;
		}
		return false;
	}

	@Override
	public String getPalavraAleatoria() throws IOException {
		
		return palavraEscolhidaAleatoria;
	}

	@Override
	public String getPalavraEmbaralhada() throws IOException {
		
		return palavraEmbaralhada;
	}

	
}
