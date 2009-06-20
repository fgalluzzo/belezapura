package controle;

import javax.swing.ImageIcon;

import modelo.Cliente;
import modelo.TipoServico;
import view.Janela;
import view.Simulador;

public class Massagista extends Thread {
	
	private double tempo_servico;
	
	public void run(){
		
		
			
		while(true){		
			try {
				Simulador.sinc.acquire();
			} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			Cliente c = new Cliente();
			c= null;
			//semáforo de exclusão mútua para acesso a fila de espera
			try {
				Simulador.mutualEx.acquire();
			
				for(int i = 0;i<Simulador.fila.size();i++){
					for(int j = 0;j<Simulador.fila.get(i).getServicos().size();j++){
						//Se for massagem -> retira o serviço de massagem 
						if((Simulador.fila.get(i).getServicos().get(j).getTipoServico().equals(TipoServico.MASSAGEM))){
							c = Simulador.fila.removeCliente(i);
							c.setGastou(c.getServicos().get(j).getTipoServico().getValor());
							//computo o quanto esse massagista ganha nesse serviço - 40% do serviço
							Simulador.fatMas += c.getServicos().get(j).getTipoServico().getValor()*0.4;
							c.getServicos().remove(j);
							tempo_servico = Math.random()*Simulador.pesoMassagem;
							break;
						}
					}
					if(c != null ){
						break;
					}else
						Simulador.sinc.release();
				}
				//Libero a fila de espera
				Simulador.mutualEx.release();
				
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			if(c != null){
				//a thread da massagista para pelo tempo da massagem do cliente
				
				synchronized (this) {
					try {
						
						Janela.jLabelMassagemStatus1.setIcon(new ImageIcon("imgs/ocup.gif"));
													
						wait((long)tempo_servico);
						
						Janela.jLabelMassagemStatus1.setIcon(new ImageIcon("imgs/free.gif"));
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(c.getServicos().size() > 0){
					//Insiro ele de volta na fila de espera
					try {
						Simulador.mutualEx.acquire();
						Simulador.fila.insereCliente(c);
						Simulador.mutualEx.release();
						Simulador.sinc.release();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					try {
						Simulador.mutualExCaixa.acquire();
							Simulador.filaCaixa.insereCliente(c);
						Simulador.mutualExCaixa.release();
						Simulador.sincCaixa.release();
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
						
				}
				
				
				
				
				
			}
			//Checagem. Pode apagar depois
			if(Simulador.salaoFechado && Simulador.fila.size()==0){
				//computar faturameto da thread
				//break;
			}
		}
	}
}
