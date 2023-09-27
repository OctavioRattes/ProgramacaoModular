package Clube;

import java.io.*;
import java.util.*;

import javax.xml.crypto.Data;

public class Visita {

	private Frequentador frequentador;
	private Data data;
	private Hora horaEntrada;
	private Hora horaSaida;

	public Visita(Frequentador frequentador, Data data, Hora horaEntrada){
		this.frequentador = frequentador;
		this.data = data;
		this.horaEntrada = horaEntrada;
	}

	public void registrarVisita(Data dia) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}
