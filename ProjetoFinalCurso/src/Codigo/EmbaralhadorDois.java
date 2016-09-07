package Codigo;

public class EmbaralhadorDois implements Embaralhador{

	@Override
	public String embaralhaPalavra(String palavraAleatoria) {
		String palavraEmbaralhada ="";
		for(int i = palavraAleatoria.length(); i> 0;i--){
			palavraEmbaralhada +=palavraAleatoria.substring(i-1,i);
		}
			
		return palavraEmbaralhada;
	}

}
