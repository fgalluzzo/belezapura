package controle;

import javax.swing.ImageIcon;

import modelo.Cliente;
import modelo.TipoServico;
import view.Janela;
import view.Simulador;

public class Pedicure extends Thread {
	
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
						//Se for para fazer os pés -> retira o serviço de pedicure 
						if((Simulador.fila.get(i).getServicos().get(j).getTipoServico().equals(TipoServico.PEDICURE))){
							c = Simulador.fila.removeCliente(i);
							c.setGastou(c.getServicos().get(j).getTipoServico().getValor());
							//computo o quanto essa pedicure ganha nesse serviço - 40% do serviço
							Simulador.fatPed[(int) (currentThread().getId() % 3)] +=  c.getServicos().get(j).getTipoServico().getValor()*0.4;
							c.getServicos().remove(j);
							
							tempo_servico = Math.random()*Simulador.pesoPedicure;
							if(tempo_servico < 1)
								tempo_servico+=1;
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
				//a thread da pedicure para pelo tempo de fazer os pés do cliente
				
				synchronized (this) {
					try {
						int i = (int)currentThread().getId()%3;
						switch(i){
							case 0:
								Janela.jLabelPeStatus1.setIcon(new ImageIcon("imgs/ocup.gif"));
								break;
							case 1:
								Janela.jLabelPeStatus2.setIcon(new ImageIcon("imgs/ocup.gif"));
								break;
							case 2:
								Janela.jLabelPeStatus3.setIcon(new ImageIcon("imgs/ocup.gif"));
								break;
						}
							
						wait((long)tempo_servico);
						
						switch(i){
							case 0:
								Janela.jLabelPeStatus1.setIcon(new ImageIcon("imgs/free.gif"));
								break;
							case 1:
								Janela.jLabelPeStatus2.setIcon(new ImageIcon("imgs/free.gif"));
								break;
							case 2:
								Janela.jLabelPeStatus3.setIcon(new ImageIcon("imgs/free.gif"));
								break;
						}
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
			if(Simulador.salaoFechado && Simulador.fila.size()==0){
				//computar faturameto da thread
				//break;
			}
		}
	}
}
