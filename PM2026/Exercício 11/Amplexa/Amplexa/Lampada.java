package Amplexa;

import java.util.*;
import java.io.*;

public class Lampada extends Dispositivo implements Ligavel {

	private boolean ligada;

	public Lampada(String nome) {
		super(nome);
		this.ligada = false;
	}

	public boolean ligar() {
		this.ligada = true;
		return true;
	}

	public boolean desligar() {
		this.ligada = false;
		return false;
	}

}
