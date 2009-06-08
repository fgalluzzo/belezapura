package controle;

import modelo.FilaEspera;
import view.Janela;
import view.Simulador;

public class Controle extends Thread {
	public void run(){
		while(true){
			try {
				Simulador.mutualEx.acquire();
					if(Simulador.fila.size() >0){
						Janela.jListaClientes.setText(FilaEspera.imprime(Simulador.fila));
					}
					else
						Janela.jListaClientes.setText("Vazia");
				Simulador.mutualEx.release();
				
				Simulador.mutualExCaixa.acquire();
					if(Simulador.filaCaixa.size() >0){
						Janela.jTextPane2.setText(FilaEspera.imprime(Simulador.filaCaixa));
					}else
						Janela.jTextPane2.setText("Vazia");
				Simulador.mutualExCaixa.release();
				
				synchronized (this) {
					try {
						wait(500);
					}
					 catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
			
		}
			
	}
}
