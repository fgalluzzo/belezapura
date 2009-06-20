package controle;

import javax.swing.JOptionPane;

import modelo.Cliente;
import util.GeraServico;
import view.Simulador;

public class ChegadaClientes extends Thread {
	// lambda ï¿½ a taxa de clientes que chegam por segundo
	// preferencialmente deve ser entre 0 e 1
	
	private GeraServico gs =  new GeraServico() ;
	public void run(){
		double tempoEntreChegadas =  (- Math.log(Math.random())/Simulador.lambda)*1000;//primeira chegada
		if(tempoEntreChegadas<1)
			tempoEntreChegadas+=1;
		
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
			 
			 if(tempoEntreChegadas<1)
					tempoEntreChegadas+=1;
			 
		    //Instancio um novo cliente
			Cliente c = new Cliente();
			Simulador.N++;
			//Atribuo serviï¿½os aleatï¿½rios ao cliente
			c.setServicos(gs.gerador());
			//Atribuo o tempo de chegada dele
			c.setTempoChegada((double)(System.currentTimeMillis() - Simulador.tempoInicial)/1000);
			
			/*System.out.println("Cliente"+c.getTempoChegada()+ " - ");
			System.out.println(c.imprimeServicos(c.getServicos()));*/	
			
			//semaforo de exclusï¿½o mï¿½tua para a fila de espera
			try {
				Simulador.mutualEx.acquire();
				//Insiro o cliente na fila de espera
					Simulador.fila.insereCliente(c);
				Simulador.mutualEx.release();
				//Semï¿½foro de sincronizaï¿½ï¿½o para avisar que uma pessoa foi inserida na fila
				Simulador.sinc.release();
					
				
			
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			
			
			synchronized (this) {
				try {
					//a thread de chegadas para atï¿½ o tempo da prï¿½xima chegada
					
					wait((long)tempoEntreChegadas);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			
		}

		Simulador.salaoFechado = true;
		//System.out.println("Salao Fechado");
		JOptionPane.showMessageDialog(null, "Salão fechado para chegada de clientes!\n Aguarde o atendimento dos clientes finais.","Aviso de Encerramento do Expediente" , JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
}
