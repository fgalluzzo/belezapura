package view;

import java.util.concurrent.Semaphore;

import controle.Cabeleireiro;
import controle.ChegadaClientes;

import modelo.FilaEspera;

public class Simulador {
    public static final int pesoCorte = 2000 ;
	public static double tempoInicial;
	//public static double tempoSimulacao;
	public static FilaEspera fila;
	
	public static FilaEspera filaLavagem;
	
	//variável para sincronização
	public static int n =0;
	
	public static Semaphore mutualEx;
	public static Semaphore sinc;
	public static Semaphore mutualExLav;
	
	public static void main(String[] args) {
		mutualEx = new Semaphore(1);
		mutualExLav = new Semaphore(1);
		sinc = new Semaphore(0);
		
	   
        new Janela().setVisible(true);
           
    
		tempoInicial = System.currentTimeMillis();
		
		fila = new FilaEspera();
		filaLavagem = new FilaEspera();
		
		
		Cabeleireiro cab1 = new Cabeleireiro();
		cab1.start();
		Cabeleireiro cab2 = new Cabeleireiro();
		cab2.start();
		Cabeleireiro cab3 = new Cabeleireiro();
		cab3.start();
		Cabeleireiro cab4 = new Cabeleireiro();
		cab4.start();
		Cabeleireiro cab5 = new Cabeleireiro();
		cab5.start();
		
		ChegadaClientes cc = new ChegadaClientes();
		cc.start();
		
		
		
		
		
		
		
		
	}

}
