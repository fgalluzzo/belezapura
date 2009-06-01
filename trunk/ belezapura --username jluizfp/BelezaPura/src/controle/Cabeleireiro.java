package controle;

import modelo.Cliente;
import modelo.Servico;
import modelo.TipoServico;
import view.simulador;

public class Cabeleireiro extends Thread {
	private Cliente c;

	private Servico servico_cliente;
	private double tempo_servico;
	public void run(){
		//Espero chegar algum cliente na fila
		if(simulador.n == 0){
			try {
				simulador.sinc.acquire();
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
			
		while(!simulador.fila.vazia()){						
				//semáforo de exclusão mútua para acesso a fila de espera
				try {
					simulador.mutualEx.acquire();
				
				for(int i = 0;i<simulador.fila.size();i++){
					for(int j = 0;j<simulador.fila.get(i).getServicos().size();j++){
						if(simulador.fila.get(i).getServicos().get(j).getTipoServico().equals(TipoServico.CORTE)){
							c = simulador.fila.removeCliente(i);
							c.getServicos().remove(j);
							simulador.n--;
							break;
						}
					}
					if(c != null){
						break;
					}
				}
				simulador.mutualEx.release();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//a thread de cabelereireiro para pelo tempo do corte do cliente
				tempo_servico = Math.random()*simulador.pesoCorte;
				synchronized (this) {
					try {
						
						wait((long)tempo_servico);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				//Insiro ele de volta na fila de espera
				try {
					simulador.mutualEx.acquire();
					simulador.fila.insereCliente(c);
					simulador.mutualEx.release();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
			//Checagem. Pode apagar depois
		
			System.out.println("Tamanho da fila: " +simulador.fila.size());
			System.out.println(currentThread().getId());
			
		
	}
}
