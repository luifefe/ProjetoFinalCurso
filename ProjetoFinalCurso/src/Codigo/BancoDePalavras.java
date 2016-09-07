package Codigo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class BancoDePalavras  {

	private ArrayList<String> palavras = new ArrayList();
	
	
	public void leitura() throws IOException{
		
		try{
			palavras.clear();
			FileReader arquivo = new FileReader("bancoDePalavras.txt");
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			String palavra = lerArquivo.readLine();
			
			while(palavra!=null){
				
				palavras.add(palavra);
				palavra= lerArquivo.readLine();
				
		}
			lerArquivo.close();
			
		}catch(FileNotFoundException e){
			System.out.println("Arquivo não encontrado");
		}
		
	}
	
	private ArrayList<String> getPalavras() throws IOException{
		this.leitura();
		return palavras;
	}
	
	public String getPalavraAleatoria() throws IOException{
		
		ArrayList<String> clonePalavras = getPalavras();
		Collections.shuffle(clonePalavras);
		Collections.shuffle(clonePalavras);
		
		String palavraAleatoria = clonePalavras.get(0);
		return palavraAleatoria;
		
	}
			
}
