package controle;

import javax.swing.ImageIcon;

import modelo.Cliente;
import modelo.TipoServico;
import view.Janela;
import view.Simulador;

public class Cabeleireiro extends Thread {
	

	private double tempo_servico;
	public void run(){
		
		
		while(true){
			 try {
					Simulador.sinc.acquire();
				} catch (InterruptedException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
				//Espero chegar algum cliente na fila
			 boolean flLav = false;
			 Cliente c = new Cliente();
			 c= null;
				//semáforo de exclusão mútua para acesso a fila de espera
				try {
					Simulador.mutualEx.acquire();
				
					for(int i = 0;i<Simulador.fila.size();i++){
						for(int j = 0;j<Simulador.fila.get(i).getServicos().size();j++){
							//Se houver uma lavagem -> mandar cliente para a fila de lavagem
							
							if((Simulador.fila.get(i).getServicos().get(j).getTipoServico().equals(TipoServico.LAVAGEM))){
								c = Simulador.fila.removeCliente(i);
								c.setGastou(c.getServicos().get(j).getTipoServico().getValor());
								c.getServicos().remove(j);
								//System.out.println("Cliente removido: " + i + " - " + c.imprimeServicos(c.getServicos()));
								//exclusão mútua para a fila de lavagem
								Simulador.mutualExLav.acquire();
									Simulador.filaLavagem.insereCliente(c);
								Simulador.mutualExLav.release();
								Simulador.sincLav.release();
								flLav = true;
								break;
							}
							//Se for só corte -> retira o serviço de corte 
							if((Simulador.fila.get(i).getServicos().get(j).getTipoServico().equals(TipoServico.CORTE))){
								c = Simulador.fila.removeCliente(i);
								c.setGastou(c.getServicos().get(j).getTipoServico().getValor());
								c.getServicos().remove(j);
								tempo_servico = Math.random()*Simulador.pesoCorte;
								break;
							}
							//Se for  corte e penteado -> retira o serviço de corte e penteado e insere um de penteado 
							
							if(Simulador.fila.get(i).getServicos().get(j).getTipoServico().equals(TipoServico.CORTE_E_PENTEADO)){
								c = Simulador.fila.removeCliente(i);
								c.setGastou(c.getServicos().get(j).getTipoServico().getValor());
								c.getServicos().remove(j);					
								tempo_servico = Math.random()*Simulador.pesoCortePenteado;
								break;
							}
							if(Simulador.fila.get(i).getServicos().get(j).getTipoServico().equals(TipoServico.PENTEADO)){
								c = Simulador.fila.removeCliente(i);
								c.setGastou(c.getServicos().get(j).getTipoServico().getValor());
								c.getServicos().remove(j);					
								tempo_servico = Math.random()*Simulador.pesoPenteado;
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
						e1.printStackTrace();
					}
					
				if(c != null && !flLav){
					//a thread de cabelereireiro para pelo tempo do corte do cliente
					
					synchronized (this) {
						try {
							int i = (int)currentThread().getId()%5;
							switch(i){
								case 0:
									Janela.jLabelCabeloStatus1.setIcon(new ImageIcon("imgs/ocup.gif"));
									break;
								case 1:
									Janela.jLabelCabeloStatus2.setIcon(new ImageIcon("imgs/ocup.gif"));
									break;
								case 2:
									Janela.jLabelCabeloStatus3.setIcon(new ImageIcon("imgs/ocup.gif"));
									break;
								case 3:
									Janela.jLabelCabeloStatus4.setIcon(new ImageIcon("imgs/ocup.gif"));
									break;
								case 4:
									Janela.jLabelCabeloStatus5.setIcon(new ImageIcon("imgs/ocup.gif"));
									break;
									
							}
								
							wait((long)tempo_servico);
							switch(i){
							case 0:
								Janela.jLabelCabeloStatus1.setIcon(new ImageIcon("imgs/free.gif"));
								break;
							case 1:
								Janela.jLabelCabeloStatus2.setIcon(new ImageIcon("imgs/free.gif"));
								break;
							case 2:
								Janela.jLabelCabeloStatus3.setIcon(new ImageIcon("imgs/free.gif"));
								break;
							case 3:
								Janela.jLabelCabeloStatus4.setIcon(new ImageIcon("imgs/free.gif"));
								break;
							case 4:
								Janela.jLabelCabeloStatus5.setIcon(new ImageIcon("imgs/free.gif"));
								break;
								
						}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if(c.getServicos().size()>0){
						//Insiro ele de volta na fila de espera
						try {
							Simulador.mutualEx.acquire();
							Simulador.fila.insereCliente(c);
							Simulador.mutualEx.release();
							Simulador.sinc.release();
							
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else{
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
					break;
				}
			}
			
			
			
			
			
		
	}
}
