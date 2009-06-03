package modelo;


import java.util.List;


public class Cabelereiro extends Thread{

	private List<ClienteThread> listaClientes;
	private static final int DELAY = 20000; 
	public Cabelereiro(List<ClienteThread> listaClientes){
		this.listaClientes = listaClientes;
	}
	
	
	public void run (){
		while(!listaClientes.isEmpty() && !isInterrupted()){
			ClienteThread clienteThread = procuraCliente(listaClientes);
			 if (clienteThread != null){
				 cortarCabelo(clienteThread);			 
			 }	
		}
		
		System.out.println("a Thread Cabeleleira_" + Thread.currentThread().getId() +" não achou ninguem na fila, não ha mais ninguem querendo cortar o cabelo ...\n");
	}
	
	// So uma Thread pode acessar a ListaClientes de cada vez pois pode ocorrer de duas Threads pegarem 
	// o mesmo cliente
	private synchronized ClienteThread procuraCliente(List<ClienteThread> listaClientes){
	
	   // Isto com certeza sera mudaddo visto que a fila pode um tempo fazia e depois chegar um cliente 
		while(  listaClientes.size()>0 ){
			
			System.out.println("[procuraCliente] A Thread Cabeleleira_" + Thread.currentThread().getId() +" esta procurando um cliente ... \n" );
			
			ClienteThread clienteThread = (ClienteThread) listaClientes.get(0);
			
			listaClientes.remove(clienteThread);
			
			if(clienteThread.getPedidos().contains("CORTAR_CABELO")){
				if(clienteThread.getCabeloLavado()){		
					System.out.println("[procuraCliente] A Thread Cabeleleira_" + Thread.currentThread().getId() +" achou o cliente  "+ clienteThread.getNome() + " que deseja cortar o cabelo\n" );
					return clienteThread;
				}else{
					System.out.println("[procuraCliente] A Thread Cabeleleira_" + Thread.currentThread().getId() +" não quis cortar o cabelo do cliente  "+ clienteThread.getNome() + " pois ele ainda não lavou o cabelo \n" );
				
				}
			}else {
				System.out.println("[procuraCliente] A Thread Cabeleleira_" + Thread.currentThread().getId() +" não vai cortar o cabelo do cliente  "+ clienteThread.getNome() + " pois ele não deseja fazer isso \n" );
			}
		}
		System.out.println("[procuraCliente] A Thread Cabeleleira_" + Thread.currentThread().getId() + "Não encontrou mais ninguem na lista para cortar o cabelo\n ");
		return null; 
	}
	
	private void cortarCabelo(ClienteThread clienteThread){
		
		try{
			System.out.println("[cortarCabelo] A Thread Cabeleleira_" + Thread.currentThread().getId()+ " esta cortando o cabelo do cliente " + clienteThread.getNome() +  " ...\n");
			sleep(DELAY);
			clienteThread.setCabeloCortado(true);
			System.out.println("[cortarCabelo] A Thread Cabeleleira_" + Thread.currentThread().getId()+ " terminou o corte de cabelo do cliente " + clienteThread.getNome()+ "\n");
			
			
		}catch(InterruptedException e){
			
		}
		
		
	}
}
