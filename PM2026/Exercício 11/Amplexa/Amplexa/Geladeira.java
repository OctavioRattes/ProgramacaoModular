package Amplexa;

import java.util.*;
import java.io.*;

public class Geladeira extends Dispositivo implements PotenciaAjustavel {

	private int potencia;

	public Geladeira(String nome) {
		super(nome);
		this.potencia = 0;
	}

	public void aumentarPotencia(int potencia) {
		if (this.potencia < 10) {
			this.potencia++;
		}
	}

	public void diminuirPotencia(int potencia) {
		if (this.potencia > 1) {
			this.potencia--;
		}
	}

}
