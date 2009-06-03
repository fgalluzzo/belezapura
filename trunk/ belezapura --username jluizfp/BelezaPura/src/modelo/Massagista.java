package modelo;

import java.util.List;

public class Massagista extends Thread {
	
	private List<ClienteThread> listaClientes;
	private static final int DELAY = 20000; // Verificar valor da constante
	public Massagista(List<ClienteThread> listaClientes){
		this.listaClientes = listaClientes;
	}
	
	public void run (){
		while(!listaClientes.isEmpty() && !isInterrupted()){
			ClienteThread clienteThread = procuraCliente(listaClientes);
			 if (clienteThread != null){
				 fazerMassagem(clienteThread);			 
			 }	
		}
		
		System.out.println("a Thread Massagista_" + 
							Thread.currentThread().getId() +
							" não achou ninguem na fila, não ha mais ninguem querendo fazer massagem ...\n");
	}
	
	// So uma Thread pode acessar a ListaClientes de cada vez pois pode ocorrer de duas Threads pegarem 
	// o mesmo cliente
	private synchronized ClienteThread procuraCliente(List<ClienteThread> listaClientes){
	
	   // Isto com certeza sera mudaddo visto que a fila pode um tempo fazia e depois chegar um cliente 
		while(  listaClientes.size()>0 ){
			
			System.out.println("[procuraCliente] A Thread Massagista_" + 
								Thread.currentThread().getId() +
								" esta procurando um cliente ... \n" );
			
			ClienteThread clienteThread = (ClienteThread) listaClientes.get(0);
			
			listaClientes.remove(clienteThread);
			
			if(clienteThread.getPedidos().contains("APLICAR_MASSAGEM")) {
				System.out.println("[procuraCliente] A Thread Massagista_" + 
									Thread.currentThread().getId() +
									" achou o cliente  " + 
									clienteThread.getNome() + " que deseja fazer massagem\n" );
				return clienteThread;
			} else {
				System.out.println("[procuraCliente] A Thread Massagista_" + 
									Thread.currentThread().getId() +
									" não vai fazer massagem no cliente  " +
									clienteThread.getNome() +
									" pois ele não deseja fazer isso \n" );
			}
		}
		System.out.println("[procuraCliente] A Thread Massagista_" + 
							Thread.currentThread().getId() + 
							"Não encontrou mais ninguem na lista para fazer massagem\n ");
		return null; 
	}
	
	private void fazerMassagem(ClienteThread clienteThread){
		
		try{
			System.out.println("[fazerMassagem] A Thread Massagista_" + 
								Thread.currentThread().getId()+ 
								" esta fazendo massagem no cliente " + 
								clienteThread.getNome() +  
								" ...\n");
			sleep(DELAY);
			clienteThread.setMassagemRecebida(true);
			System.out.println("[fazerMassagem] A Thread Massagista_" + 
								Thread.currentThread().getId()+ 
								" terminou de fazer massagem no cliente " + 
								clienteThread.getNome()+ 
								"\n");
			
		}catch(InterruptedException e){
			System.out.println("[fazerMassagem] A Thread Massagista_" +
								Thread.currentThread().getId()+
								" foi interrompida inesperadamente sem que tivesse sido concluída." +
								" (erro: " + e.getMessage() + ")");
		}
	}
}
