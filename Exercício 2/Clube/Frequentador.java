package Clube;

import java.io.*;
import java.util.*;

public class Frequentador {

	private String id;
	private String nome;
	private Visita visitas;

	public String getId(){
		return this.id;
	}


	public void registrarVisita(Clube clube) {
		clube.registrarVisita(this.id);
	}

	public void registrarSaida() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public boolean visitouClubeEm(Data data) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String relatorioVisitas() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}
