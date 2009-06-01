package controle;

import modelo.Cliente;
import sun.misc.Signal;
import util.GeraServico;
import view.simulador;

public class ChegadaClientes extends Thread {
	// lambda é a taxa de clientes que chegam por segundo
	// preferencialmente deve ser entre 0 e 1
	private  double lambda = 0.9;
	
	public void run(){
		while((System.currentTimeMillis()- simulador.tempoInicial) < 10000){
			
			//chegadas exponencial, mas podemos usar tb o que foi especificado
			//de chegadas entre 1 e 5 unidades de tempo
			double tempoEntreChegadas =  (- Math.log(Math.random())/lambda)*1000;
			
		    //Instancio um novo cliente
			Cliente c = new Cliente();
			
			//Atribuo serviços aleatórios ao cliente
			c.setServicos(GeraServico.gerador());
			//Atribuo o tempo de chegada dele
			c.setTempoChegada(System.currentTimeMillis() - simulador.tempoInicial);
			
			//semaforo de exclusão mútua para a fila de espera
			try {
				simulador.mutualEx.acquire();
				//Insiro o cliente na fila de espera
				simulador.fila.insereCliente(c);
				simulador.n++;
				simulador.mutualEx.release();
				if(simulador.n == 1){
					simulador.sinc.release(3);
				}
			
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
			//Checagem. Pode apagar depois
		    System.out.println(c.getTempoChegada());
			synchronized (this) {
				try {
					//a thread de chegadas para até o tempo da próxima chegada
					wait((long)tempoEntreChegadas);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
			
			
		}
		
	}
	
	
}
