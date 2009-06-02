package controle;

import modelo.Cliente;
import modelo.Servico;
import modelo.TipoServico;
import view.Simulador;;

public class Cabeleireiro extends Thread {
	private Cliente c;

	private Servico servico_cliente;
	private double tempo_servico;
	public void run(){
		//Espero chegar algum cliente na fila
		if(Simulador.n == 0){
			try {
				Simulador.sinc.acquire();
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
			
		while(!Simulador.fila.vazia()){						
				//sem�foro de exclus�o m�tua para acesso a fila de espera
				try {
					Simulador.mutualEx.acquire();
				
				for(int i = 0;i<Simulador.fila.size();i++){
					for(int j = 0;j<Simulador.fila.get(i).getServicos().size();j++){
						if(Simulador.fila.get(i).getServicos().get(j).getTipoServico().equals(TipoServico.CORTE)){
							c = Simulador.fila.removeCliente(i);
							c.getServicos().remove(j);
							Simulador.n--;
							break;
						}
					}
					if(c != null){
						break;
					}
				}
				Simulador.mutualEx.release();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//a thread de cabelereireiro para pelo tempo do corte do cliente
				tempo_servico = Math.random()*Simulador.pesoCorte;
				synchronized (this) {
					try {
						
						wait((long)tempo_servico);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				//Insiro ele de volta na fila de espera
				try {
					Simulador.mutualEx.acquire();
					Simulador.fila.insereCliente(c);
					Simulador.mutualEx.release();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
			//Checagem. Pode apagar depois
		
			System.out.println("Tamanho da fila: " +Simulador.fila.size());
			System.out.println(currentThread().getId());
			
		
	}
}