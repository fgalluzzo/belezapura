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
		
		/*Cliente c = new Cliente();
		
	    GeraServico geraServ = new GeraServico();
		for(int i =0;i<5;i++){
			c.setServicos(geraServ.gerador());
			System.out.println("Cliente "+(i+1));
			for(int j = 0;j<c.getServicos().size();j++){
				
				System.out.println(c.getServicos().get(j).getTipoServico());
				
			}
			
		}*/
		
	}

}
