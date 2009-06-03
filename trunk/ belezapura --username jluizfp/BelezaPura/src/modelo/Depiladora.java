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
							" n�o achou ninguem na fila, n�o ha mais ninguem querendo se depilar ...\n");
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
										clienteThread.getNome() + " que deseja fazer depila��o\n" );
					return clienteThread;
				} else {
					System.out.println("[procuraCliente] A Thread Depiladora_" + 
										Thread.currentThread().getId() +
										" n�o vai fazer depila��o no cliente  " +
										clienteThread.getNome() +
										" pois ele n�o deseja fazer isso \n" );
				}
			}
			System.out.println("[procuraCliente] A Thread Depiladora_" + 
								Thread.currentThread().getId() + 
								"N�o encontrou mais ninguem na lista para fazer depila��o\n ");
			return null; 
		}
	
	private void fazerDepilacao(ClienteThread clienteThread){
		
		try{
			System.out.println("[fazerDepilacao] A Thread Depiladora_" + 
								Thread.currentThread().getId()+ 
								" esta fazendo depila��o no cliente " + 
								clienteThread.getNome() +  
								" ...\n");
			sleep(DELAY);
			clienteThread.setDepilado(true);
			System.out.println("[fazerDepilacao] A Thread Depiladora_" + 
								Thread.currentThread().getId()+ 
								" terminou de fazer depila��o no cliente " + 
								clienteThread.getNome()+ 
								"\n");
			
		}catch(InterruptedException e){
			System.out.println("[fazerDepilacao] A Thread Depiladora_" +
								Thread.currentThread().getId()+
								" foi interrompida inesperadamente sem que tivesse sido conclu�da." +
								" (erro: " + e.getMessage() + ")");
		}
	}
}
