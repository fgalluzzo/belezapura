package controle;

import javax.swing.JFrame;

import modelo.Cliente;
import util.GeraServico;
import view.Simulador;

public class ChegadaClientes extends Thread {
	// lambda é a taxa de clientes que chegam por segundo
	// preferencialmente deve ser entre 0 e 1
	
	private GeraServico gs =  new GeraServico() ;
	private JFrame view;
	
	public void run(){
		double tempoEntreChegadas =  (- Math.log(Math.random())/Simulador.lambda)*1000;//primeira chegada
		synchronized (this) {
			try {
				//Primeira Chegada
				wait((long)tempoEntreChegadas);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while((System.currentTimeMillis()- Simulador.tempoInicial)/1000 < Simulador.horarioComercial){
			
			//chegadas exponencial, mas podemos usar tb o que foi especificado
			//de chegadas entre 1 e 5 unidades de tempo
			 tempoEntreChegadas =  (- Math.log(Math.random())/Simulador.lambda)*1000;
			
		    //Instancio um novo cliente
			Cliente c = new Cliente();
			
			//Atribuo serviços aleatórios ao cliente
			c.setServicos(gs.gerador());
			//Atribuo o tempo de chegada dele
			c.setTempoChegada((double)(System.currentTimeMillis() - Simulador.tempoInicial)/1000);
			System.out.println("Cliente"+c.getTempoChegada()+ " - ");
			System.out.println(c.imprimeServicos(c.getServicos()));	
			//semaforo de exclusão mútua para a fila de espera
			try {
				Simulador.mutualEx.acquire();
				//Insiro o cliente na fila de espera
					Simulador.fila.insereCliente(c);
				Simulador.mutualEx.release();
				//Semáforo de sincronização para avisar que uma pessoa foi inserida na fila
				Simulador.sinc.release();
					
				
			
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
			
			synchronized (this) {
				try {
					//a thread de chegadas para até o tempo da próxima chegada
					
					wait((long)tempoEntreChegadas);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//Checagem. Pode apagar depois
			
			
				

			
		}
		Simulador.salaoFechado = true;
		System.out.println("Salão Fechado");
		
	}
	
	
}
