package Amplexa;

import java.util.*;
import java.io.*;

public class Amplexa {

	private String nome;
	private List<Dispositivo> dispositivos;

	public Amplexa(String nome) {
		this.nome = nome;
		this.dispositivos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void addDispositivos(Dispositivo novo) {
		dispositivos.add(novo);
	}

	public boolean ligar(String nome) {
		for (Dispositivo dispositivo : dispositivos) {
			if (((Amplexa) dispositivos).getNome().equals(nome) && dispositivo instanceof Ligavel){
				((Ligavel) dispositivo).ligar();
				return true;
			}
		}
		return false;
	}
	
	public boolean desligar(String nome) {
		for (Dispositivo dispositivo : dispositivos) {
			if (((Amplexa) dispositivos).getNome().equals(nome) && dispositivo instanceof Ligavel){
				((Ligavel) dispositivo).desligar();
				return true;
			}
		}
		return false;
	}

	public int aumentarPotencia(String nome) {
		for (Dispositivo dispositivo : dispositivos) {
			if (dispositivo.nome.equals(nome) && dispositivo instanceof PotenciaAjustavel) {
				return ((PotenciaAjustavel) dispositivo).aumentarPotencia(0);
			}
		}
		return -1;
	}
}
