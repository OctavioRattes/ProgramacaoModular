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

	public boolean ligar() {
		this.ligada = true;
		return true;
	}

	public boolean desligar() {
		this.ligada = false;
		return false;
	}

	public int aumentarVolume(int volume) {
		if (ligada && this.volume < 100) {
			this.volume++;
		}
		return this.volume;
	}

	public int diminuirVolume(int volume) {
		if (ligada && this.volume > 0) {
			this.volume--;
		}
		return this.volume;
		}
}