package controle;

import javax.swing.ImageIcon;

import modelo.Cliente;
import modelo.TipoServico;
import view.Janela;
import view.Simulador;

public class Depiladora extends Thread {
	
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
						//Se for depilação -> retira o serviço de depilação 
						if((Simulador.fila.get(i).getServicos().get(j).getTipoServico().equals(TipoServico.DEPILACAO))){
							c = Simulador.fila.removeCliente(i);
							c.getServicos().remove(j);
							tempo_servico = Math.random()*Simulador.pesoDepilacao;
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
				//a thread da depiladora para pelo tempo da depilação do cliente
				
				synchronized (this) {
					try {
						int i = (int)currentThread().getId()%2;
						switch(i){
							case 0:
								Janela.jLabelDepilacaoStatus1.setIcon(new ImageIcon("imgs/ocup.gif"));
								break;
							case 1:
								Janela.jLabelDepilacaoStatus2.setIcon(new ImageIcon("imgs/ocup.gif"));
								break;
						}
							
						wait((long)tempo_servico);
						
						switch(i){
							case 0:
								Janela.jLabelDepilacaoStatus1.setIcon(new ImageIcon("imgs/free.gif"));
								break;
							case 1:
								Janela.jLabelDepilacaoStatus2.setIcon(new ImageIcon("imgs/free.gif"));
								break;
						}
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
				if(m == 0){
					try {
						Simulador.sinc.acquire();
					} catch (InterruptedException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				}
				//Checagem. Pode apagar depois
				
				System.out.println("Tamanho da fila: " +Simulador.fila.size());
				System.out.println(currentThread().getId());
			}
		}
	}
}
