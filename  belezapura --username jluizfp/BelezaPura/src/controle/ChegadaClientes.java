package controle;

import modelo.Cliente;
import util.GeraServico;
import view.simulador;

public class ChegadaClientes extends Thread {
	// lambda é a taxa de clientes que chegam por segundo
	// preferencialmente deve ser entre 0 e 1
	private  double lambda = 0.5;
	
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
			
			synchronized (simulador.fila) {
				//Insiro o cliente na fila de espera
				simulador.fila.insereCliente(c);
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
		//Checagem. Pode apagar depois
		System.out.println("Tamanho da fila: " +simulador.fila.size());
		int n = simulador.fila.size(); 
		for(int i =0;i<n;i++){
			Cliente c = simulador.fila.removeEvento();
			System.out.println("Cliente "+ (i+1));
			for(int j = 0;j<c.getServicos().size();j++){			
				System.out.println(c.getServicos().get(j).getTipoServico());				
			}
		}	
	}
	
}
