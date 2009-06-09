package controle;

import javax.swing.ImageIcon;

import modelo.Cliente;
import modelo.TipoServico;
import view.Janela;
import view.Simulador;

public class Caixa extends Thread {
	private double tempo_servico;
	private int totalArrecadado;
	public void run(){
		while(true){
			try {
				Simulador.sincCaixa.acquire();
			} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			Cliente c = new Cliente();
			try {
				//Exclusão mútua para fila do caixa
				Simulador.mutualExCaixa.acquire();
					c = Simulador.filaCaixa.removeCliente();
					totalArrecadado += c.getGastou();
					tempo_servico = Math.random()*Simulador.pesoCaixa;
				//Libero a fila de espera do caixa
				Simulador.mutualExCaixa.release();
				
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			synchronized (this) {
				try {
					int i = (int)currentThread().getId()%2;
					switch(i){
						case 0:
							Janela.jLabelCaixaStatus1.setIcon(new ImageIcon("imgs/ocup.gif"));
							break;
						case 1:
							Janela.jLabelCaixaStatus2.setIcon(new ImageIcon("imgs/ocup.gif"));
							break;
					}
					wait((long)tempo_servico);
					switch(i){
					case 0:
						Janela.jLabelCaixaStatus1.setIcon(new ImageIcon("imgs/free.gif"));
						break;
					case 1:
						Janela.jLabelCaixaStatus2.setIcon(new ImageIcon("imgs/free.gif"));
						break;
				}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Caixa"+currentThread().getId()%2+" recebeu = "+totalArrecadado);
			
		}
	}
}
