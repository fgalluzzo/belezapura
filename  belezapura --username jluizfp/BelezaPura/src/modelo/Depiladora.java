package modelo;

import java.util.List;

public class Depiladora extends Thread {
	
	private List<ClienteThread> listaClientes;
	private static final int DELAY = 20000; // Verificar valor da constante
	public Depiladora(List<ClienteThread> listaClientes){
		this.listaClientes = listaClientes;
	}
	
	public void run (){
		while(!listaClientes.isEmpty() && !isInterrupted()){
			ClienteThread clienteThread = procuraCliente(listaClientes);
			 if (clienteThread != null){
				 fazerDepilacao(clienteThread);			 
			 }	
		}
		
		System.out.println("a Thread Depiladora_" + 
							Thread.currentThread().getId() +
							" não achou ninguem na fila, não ha mais ninguem querendo se depilar ...\n");
	}
	
	private synchronized ClienteThread procuraCliente(List<ClienteThread> listaClientes){
		
		   // Isto com certeza sera mudaddo visto que a fila pode um tempo fazia e depois chegar um cliente 
			while(  listaClientes.size()>0 ){
				
				System.out.println("[procuraCliente] A Thread Depiladora_" + 
									Thread.currentThread().getId() +
									" esta procurando um cliente ... \n" );
				
				ClienteThread clienteThread = (ClienteThread) listaClientes.get(0);
				
				listaClientes.remove(clienteThread);
				
				if(clienteThread.getPedidos().contains("FAZER_DEPILACAO")) {
					System.out.println("[procuraCliente] A Thread Depiladora_" + 
										Thread.currentThread().getId() +
										" achou o cliente  " + 
										clienteThread.getNome() + " que deseja fazer depilação\n" );
					return clienteThread;
				} else {
					System.out.println("[procuraCliente] A Thread Depiladora_" + 
										Thread.currentThread().getId() +
										" não vai fazer depilação no cliente  " +
										clienteThread.getNome() +
										" pois ele não deseja fazer isso \n" );
				}
			}
			System.out.println("[procuraCliente] A Thread Depiladora_" + 
								Thread.currentThread().getId() + 
								"Não encontrou mais ninguem na lista para fazer depilação\n ");
			return null; 
		}
	
	private void fazerDepilacao(ClienteThread clienteThread){
		
		try{
			System.out.println("[fazerDepilacao] A Thread Depiladora_" + 
								Thread.currentThread().getId()+ 
								" esta fazendo depilação no cliente " + 
								clienteThread.getNome() +  
								" ...\n");
			sleep(DELAY);
			clienteThread.setDepilado(true);
			System.out.println("[fazerDepilacao] A Thread Depiladora_" + 
								Thread.currentThread().getId()+ 
								" terminou de fazer depilação no cliente " + 
								clienteThread.getNome()+ 
								"\n");
			
		}catch(InterruptedException e){
			System.out.println("[fazerDepilacao] A Thread Depiladora_" +
								Thread.currentThread().getId()+
								" foi interrompida inesperadamente sem que tivesse sido concluída." +
								" (erro: " + e.getMessage() + ")");
		}
	}
}
