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
							" não achou ninguem na fila, não ha mais ninguem querendo fazer os pés ...\n");
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
									clienteThread.getNome() + " que deseja fazer os pés\n" );
				return clienteThread;
			} else {
				System.out.println("[procuraCliente] A Thread Pedicure_" + 
									Thread.currentThread().getId() +
									" não vai fazer os pés do cliente  " +
									clienteThread.getNome() +
									" pois ele não deseja fazer isso \n" );
			}
		}
		System.out.println("[procuraCliente] A Thread Pedicure_" + 
							Thread.currentThread().getId() + 
							"Não encontrou mais ninguem na lista para fazer os pés\n ");
		return null; 
	}
	
	private void fazerPes(ClienteThread clienteThread){
		
		try{
			System.out.println("[fazerPes] A Thread Pedicure_" + 
								Thread.currentThread().getId()+ 
								" esta fazendo os pés do cliente " + 
								clienteThread.getNome() +  
								" ...\n");
			sleep(DELAY);
			clienteThread.setPesFeitos(true);
			System.out.println("[fazerPes] A Thread Pedicure_" + 
								Thread.currentThread().getId()+ 
								" terminou de fazer os pés do cliente " + 
								clienteThread.getNome()+ 
								"\n");
			
		}catch(InterruptedException e){
			System.out.println("[fazerPes] A Thread Pedicure_" +
								Thread.currentThread().getId()+
								" foi interrompida inesperadamente sem que tivesse sido concluída." +
								" (erro: " + e.getMessage() + ")");
		}
	}
}
