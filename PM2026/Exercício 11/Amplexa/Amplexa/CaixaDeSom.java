package Amplexa;

import java.util.*;
import java.io.*;

public class CaixaDeSom extends Dispositivo implements VolumeAjustavel, Ligavel {

	private boolean ligada;
	private int volume;

	public CaixaDeSom(String nome) {
		super(nome);
		this.ligada = false;
		this.volume = 0;
	}

	public void ligar() {
		this.ligada = true;
	}

	public void desligar() {
		this.ligada = false;
	}

	public void aumentarVolume(int volume) {
		if (ligada && this.volume < 100) {
			this.volume++;
		}
	}

	public void diminuirVolume(int volume) {
		if (ligada && this.volume > 0) {
			this.volume--;
		}
	}

}
