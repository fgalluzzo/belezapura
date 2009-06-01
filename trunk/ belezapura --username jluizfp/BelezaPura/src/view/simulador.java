package view;

import com.sun.media.sound.MidiUtils.TempoCache;

import controle.ChegadaClientes;

import util.GeraServico;
import modelo.Cliente;
import modelo.FilaEspera;

public class simulador {

	public static double tempoInicial;
	//public static double tempoSimulacao;
	public static FilaEspera fila;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tempoInicial = System.currentTimeMillis();
		
		fila = new FilaEspera();
		
		ChegadaClientes cc = new ChegadaClientes();
		cc.start();
		
		
		
		
		
		
	}

}
