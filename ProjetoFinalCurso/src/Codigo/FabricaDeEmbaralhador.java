package Codigo;

public class FabricaDeEmbaralhador {
	
	public Embaralhador getEmbaralhadorAleatorio(){
		
		//tira um numero randomico entre 0 e 1
		int numRandomico = (int)(Math.random()*2);
		
		if(numRandomico == 0){
			return new EmbaralhadorUm();
		
		}else{
		
			return new EmbaralhadorDois();
		}
	}
	
}