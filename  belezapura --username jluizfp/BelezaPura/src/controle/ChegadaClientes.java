package controle;

import modelo.Cliente;
import sun.misc.Signal;
import util.GeraServico;
import view.Simulador;

public class ChegadaClientes extends Thread {
	// lambda é a taxa de clientes que chegam por segundo
	// preferencialmente deve ser entre 0 e 1
	private  double lambda = 0.4;
	private GeraServico gs =  new GeraServico() ;
	
	public void run(){
		while((System.currentTimeMillis()- Simulador.tempoInicial)/1000 < 60){
			
			//chegadas exponencial, mas podemos usar tb o que foi especificado
			//de chegadas entre 1 e 5 unidades de tempo
			double tempoEntreChegadas =  (- Math.log(Math.random())/lambda)*1000;
			
		    //Instancio um novo cliente
			Cliente c = new Cliente();
			
			//Atribuo serviços aleatórios ao cliente
			c.setServicos(gs.gerador());
			//Atribuo o tempo de chegada dele
			c.setTempoChegada((double)(System.currentTimeMillis() - Simulador.tempoInicial)/1000);
			
			//semaforo de exclusão mútua para a fila de espera
			/*try {
				Simulador.mutualEx.acquire();*/
				//Insiro o cliente na fila de espera
				Simulador.fila.insereCliente(c);
				Simulador.n++;
				//Simulador.mutualEx.release();
				if(Simulador.n == 1){
					Simulador.sinc.release(3);
				}
			
			/*} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
				
				
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
		System.out.println("Salão Fechado");
	}
	
	
}
