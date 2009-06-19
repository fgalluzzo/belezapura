package controle;

import javax.swing.ImageIcon;

import view.Janela;
import view.Simulador;
import modelo.Cliente;
import modelo.Servico;
import modelo.TipoServico;

public class Lavadeira extends Thread {
		
	
	
	private double tempo_servico;
	
	public void run() {
		
		while(true){
			//Sem�foro de sincroniza��o  para o acesso a fila de espera de pessoas para lavar 
			try {
				Simulador.sincLav.acquire();
			} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			Cliente c = new Cliente();
			//Sem�foro de exclus�o m�tua  para o acesso a fila de espera de pessoas para lavar 
			try {
				Simulador.mutualExLav.acquire();
					c = Simulador.filaLavagem.removeCliente();
					//computo o quanto essa lavadeira ganha nesse servi�o - 40% do servi�o
					Simulador.fatLav[(int) (currentThread().getId() % 3)] += TipoServico.LAVAGEM.getValor()*0.4;
				Simulador.mutualExLav.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(c != null){
				synchronized (this) {
					
					try {
						Simulador.fatLav[(int) (currentThread().getId() % 3)] += c.getGastou()*0.4;
						tempo_servico = Math.random()*Simulador.pesoLavagem;
						int i = (int)currentThread().getId()%3;
						switch(i){
							case 0:
								Janela.jLabelLavadaStatus1.setIcon(new ImageIcon("imgs/ocup.gif"));
								break;
							case 1:
								Janela.jLabelLavadaStatus2.setIcon(new ImageIcon("imgs/ocup.gif"));
								break;
							case 2:
								Janela.jLabelLavadaStatus3.setIcon(new ImageIcon("imgs/ocup.gif"));
								break;
						}
						wait((long)tempo_servico);
						switch(i){
						case 0:
							Janela.jLabelLavadaStatus1.setIcon(new ImageIcon("imgs/free.gif"));
							break;
						case 1:
							Janela.jLabelLavadaStatus2.setIcon(new ImageIcon("imgs/free.gif"));
							break;
						case 2:
							Janela.jLabelLavadaStatus3.setIcon(new ImageIcon("imgs/free.gif"));
							break;
					}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			
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
					
					
			
				
			}
			if(Simulador.salaoFechado && Simulador.fila.size()==0){
				//computar faturameto da thread
				//break;
			}
			
		}
		 
		 
		 
	}
}
