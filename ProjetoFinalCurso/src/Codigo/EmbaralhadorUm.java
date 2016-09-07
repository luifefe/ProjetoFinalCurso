package Codigo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmbaralhadorUm implements Embaralhador {

	@Override
	public String embaralhaPalavra(String palavraAleatoria) {
		
		ArrayList<Character> lista = new ArrayList<>();
		lista.clear();
		for(int i = 0;i<palavraAleatoria.length();i++){	
			lista.add(palavraAleatoria.charAt(i));
			
		}
		
		Collections.shuffle(lista);
		String palavraEmbaralhada = "";	
		for(int i = 0; i<lista.size(); i++){
			palavraEmbaralhada += lista.get(i);
		}	
		
		return palavraEmbaralhada;
	}


}
