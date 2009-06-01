package view;

import java.util.concurrent.Semaphore;

import com.sun.media.sound.MidiUtils.TempoCache;

import controle.Cabeleireiro;
import controle.ChegadaClientes;

import util.GeraServico;
import modelo.Cliente;
import modelo.FilaEspera;

public class simulador {
    public static final int pesoCorte = 1400 ;
	public static double tempoInicial;
	//public static double tempoSimulacao;
	public static FilaEspera fila;
	
	//variável para sincronização
	public static int n =0;
	
	public static Semaphore mutualEx;
	public static Semaphore sinc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mutualEx = new Semaphore(1);
		sinc = new Semaphore(0);
		
		
		tempoInicial = System.currentTimeMillis();
		
		fila = new FilaEspera();
		
		Cabeleireiro cab1 = new Cabeleireiro();
		cab1.start();
		Cabeleireiro cab2 = new Cabeleireiro();
		cab2.start();
		Cabeleireiro cab3 = new Cabeleireiro();
		cab3.start();
		
		ChegadaClientes cc = new ChegadaClientes();
		cc.start();
		
		
		
		
		
		
	}

}
