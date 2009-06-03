package modelo;

import java.util.List;

public class Pedicure extends Thread {
	
	private List<ClienteThread> listaClientes;
	private static final int DELAY = 20000; // Verificar valor da constante
	public Pedicure(List<ClienteThread> listaClientes){
		this.listaClientes = listaClientes;
	}
	
	public void run (){
		while(!listaClientes.isEmpty() && !isInterrupted()){
			ClienteThread clienteThread = procuraCliente(listaClientes);
			 if (clienteThread != null){
				 fazerPes(clienteThread);			 
			 }	
		}
		
		System.out.println("a Thread Pedicure_" + 
							Thread.currentThread().getId() +
							" n�o achou ninguem na fila, n�o ha mais ninguem querendo fazer os p�s ...\n");
	}
	
	// So uma Thread pode acessar a ListaClientes de cada vez pois pode ocorrer de duas Threads pegarem 
	// o mesmo cliente
	private synchronized ClienteThread procuraCliente(List<ClienteThread> listaClientes){
	
	   // Isto com certeza sera mudaddo visto que a fila pode um tempo fazia e depois chegar um cliente 
		while(  listaClientes.size()>0 ){
			
			System.out.println("[procuraCliente] A Thread Pedicure_" + 
								Thread.currentThread().getId() +
								" esta procurando um cliente ... \n" );
			
			ClienteThread clienteThread = (ClienteThread) listaClientes.get(0);
			
			listaClientes.remove(clienteThread);
			
			if(clienteThread.getPedidos().contains("FAZER_PES")) {
				System.out.println("[procuraCliente] A Thread Pedicure_" + 
									Thread.currentThread().getId() +
									" achou o cliente  " + 
									clienteThread.getNome() + " que deseja fazer os p�s\n" );
				return clienteThread;
			} else {
				System.out.println("[procuraCliente] A Thread Pedicure_" + 
									Thread.currentThread().getId() +
									" n�o vai fazer os p�s do cliente  " +
									clienteThread.getNome() +
									" pois ele n�o deseja fazer isso \n" );
			}
		}
		System.out.println("[procuraCliente] A Thread Pedicure_" + 
							Thread.currentThread().getId() + 
							"N�o encontrou mais ninguem na lista para fazer os p�s\n ");
		return null; 
	}
	
	private void fazerPes(ClienteThread clienteThread){
		
		try{
			System.out.println("[fazerPes] A Thread Pedicure_" + 
								Thread.currentThread().getId()+ 
								" esta fazendo os p�s do cliente " + 
								clienteThread.getNome() +  
								" ...\n");
			sleep(DELAY);
			clienteThread.setPesFeitos(true);
			System.out.println("[fazerPes] A Thread Pedicure_" + 
								Thread.currentThread().getId()+ 
								" terminou de fazer os p�s do cliente " + 
								clienteThread.getNome()+ 
								"\n");
			
		}catch(InterruptedException e){
			System.out.println("[fazerPes] A Thread Pedicure_" +
								Thread.currentThread().getId()+
								" foi interrompida inesperadamente sem que tivesse sido conclu�da." +
								" (erro: " + e.getMessage() + ")");
		}
	}
}
