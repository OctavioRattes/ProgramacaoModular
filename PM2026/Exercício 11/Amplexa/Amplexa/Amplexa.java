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

	public void addDispositivos(Dispositivo novo) {
		dispositivos.add(novo);
	}

}
