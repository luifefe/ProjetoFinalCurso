package Codigo;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	
	 public static Scanner input = new Scanner(System.in);
	 public static int pontuacao = 0;

	public static void main(String[] args) throws IOException {
		
	boolean varLoop = true;
	boolean teste = false;
	int pontos = 0;
	int contTentativa;
	FabricaMecanicaDeJogo fabMecanica = new FabricaMecanicaDeJogo();
	
		while(varLoop){
		System.out.println("\n                 MENU");
		System.out.println("Escolha um dos modos do jogo");
		System.out.println("1. Modo Facil");
		System.out.println("2. Modo Dificil");
		System.out.println("3. Pontuação:");
		System.out.println("4. Sair");
		String menu = input.nextLine();
		
		switch (menu)
		{
		case "1":
		
			MecanicaFacil mecFacil = fabMecanica.getMecanicaFacil();
			String palavraAleatoria = mecFacil.getPalavraAleatoria();
			String palavraEmbaralhada = mecFacil.getPalavraEmbaralhada();
			
			contTentativa =1;
			System.out.println("Digite o significado da palavra embaralhada: "+palavraEmbaralhada);
			teste = mecFacil.comparaPalavra(input.nextLine());
			
			while(!mecFacil.jogoAcabou(contTentativa)){
				System.out.println("Você errou!");
				System.out.println("Voce ainda tem "+(5-contTentativa)+" tentativa.");
				System.out.println("\nPalavra Embaralhada: "+palavraEmbaralhada);
				System.out.println("\nTente Novamente");
				teste = mecFacil.comparaPalavra(input.nextLine());
				contTentativa++;
				if(contTentativa == 5){
					System.out.println("Fim de Jogo! A palavra certa é: "+palavraAleatoria);
				}
							
			}
			
			if(teste){
				System.out.println("Parabens você acertou a palavra na "+contTentativa+" tentativa!" );
				pontos += 10;
				System.out.println("\nVocê recebeu mais [ 10 ] pontos!");
				
				break;
			}
			
			

		case "2":
			MecanicaFacil mecDificil = fabMecanica.getMecanicaFacil();
			String palavraAleatoriaD = mecDificil.getPalavraAleatoria();
			String palavraEmbaralhadaD = mecDificil.getPalavraEmbaralhada();
			
			contTentativa =1;
			System.out.println("Digite o significado da palavra embaralhada: "+palavraEmbaralhadaD);
			teste = mecDificil.comparaPalavra(input.nextLine());
			
			while(!mecDificil.jogoAcabou(contTentativa)){
				System.out.println("Você errou!");
				System.out.println("Voce ainda tem "+(3-contTentativa)+" tentativa.");
				System.out.println("\nPalavra Embaralhada: "+palavraEmbaralhadaD);
				System.out.println("\nTente Novamente");
				teste = mecDificil.comparaPalavra(input.nextLine());
				contTentativa++;
				if(contTentativa == 3){
					System.out.println("Fim de Jogo! A palavra certa é: "+palavraAleatoriaD);
					
				}
				
			}
			
			if(teste){
				System.out.println("Parabens você acertou a palavra na "+contTentativa+" tentativa!" );
				pontos += 15;
				System.out.println("\nVocê recebeu mais [ 15 ] pontos!");
				
			}
			break;

		case "3":
			System.out.println("Sua Pontuação: [ "+pontos+" ]");
			break;
			
		case "4":
			varLoop = false;
			
		}

	}

System.out.println("\nFim.");

	
	}

}
