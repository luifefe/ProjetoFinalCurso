package Codigo;

import java.io.IOException;

public class FabricaMecanicaDeJogo {


public MecanicaFacil getMecanicaFacil() throws IOException{
		return new MecanicaFacil();
	}

public MecanicaDificil getMecanicaDificil() throws IOException{
		return new MecanicaDificil();
	}

}
