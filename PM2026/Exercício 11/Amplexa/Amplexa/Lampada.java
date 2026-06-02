package Amplexa;

import java.util.*;
import java.io.*;

public class Lampada extends Dispositivo implements Ligavel {

	private boolean ligada;

	public Lampada(String nome) {
		super(nome);
		this.ligada = false;
	}

	public void ligar() {
		this.ligada = true;
	}

	public void desligar() {
		this.ligada = false;
	}

}
