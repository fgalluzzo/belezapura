package controle;

import javax.swing.ImageIcon;

import modelo.Cliente;
import modelo.TipoServico;
import view.Janela;
import view.Simulador;

public class Massagista extends Thread {
	
	private int m;
	private double tempo_servico;
	
	public void run(){
		
		try {
			Simulador.sinc.acquire();
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
			
		while(true){						
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
							c.getServicos().remove(j);
							tempo_servico = Math.random()*Simulador.pesoMassagem;
							Simulador.n--;
							m =Simulador.n;
							break;
						}
					}
					if(c != null ){
						break;
					}
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
						Simulador.n++;
						Simulador.mutualEx.release();
						if(Simulador.n == 1){
							Simulador.sinc.release(14);
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					try {
						Simulador.mutualExCaixa.acquire();
							Simulador.filaCaixa.insereCliente(c);
							Simulador.nc++;
						Simulador.mutualExCaixa.release();
						if(Simulador.nc == 1){
							Simulador.sincCaixa.release();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
						
				}
				
				if(m == 0){
					try {
						Simulador.sinc.acquire();
					} catch (InterruptedException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				}
				//Checagem. Pode apagar depois
				
				System.out.println("Mass"+currentThread().getId()+" Tamanho da fila: " +Simulador.fila.size());
				
			}
		}
	}
}
