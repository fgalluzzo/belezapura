package view;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import modelo.Cabelereiro;
import modelo.ClienteThread;


public class SimuladorThread {
	
	/**
	 * Classe utilizada com teste para uma simulação de Thread realizando uma busca em uma lista de Clientes
	 */
	public static void main(String[] args) {
		
		 
		List<ClienteThread> listaDeClientes = new ArrayList<ClienteThread>();
		// Apenas um teste para simulação e Threads 
		listaDeClientes.add(new ClienteThread("1. Lucas",Arrays.asList("CORTAR_UNHA","LAVAR_CABECA", "FAZER_PES", "CORTAR_CABELO")));
		listaDeClientes.add(new ClienteThread("2. Antonia",Arrays.asList("BLA", "FAZER_PES", "CORTAR_CABELO")));   
		listaDeClientes.add(new ClienteThread("3. Roberto",Arrays.asList("HJGHJGGF", "FAZER_PES")));
		listaDeClientes.add(new ClienteThread("4. Flavio",Arrays.asList("CORTAR_UNHA","LAVAR_CABECA", "FAZER_PES", "CORTAR_CABELO")));
		listaDeClientes.add(new ClienteThread("5. Carlos",Arrays.asList("CORTAR_UNHA", "FAZER_PES","CORTAR_CABELO")));
		listaDeClientes.add(new ClienteThread("6. Lauio",Arrays.asList("CORTAR_UNHA", "FAZER_PES", "CORTAR_CABELO")));
		listaDeClientes.add(new ClienteThread("7. Marcos",Arrays.asList("HJGHJGGF", "FAZER_PES")));
		listaDeClientes.add(new ClienteThread("8. Vitor",Arrays.asList("CORTAR_UNHA", "FAZER_PES", "CORTAR_CABELO")));
		listaDeClientes.add(new ClienteThread("9. Daniela Nascimento ",Arrays.asList("CORTAR_UNHA", "CORTAR_CABELO","FAZER_PES")));
		listaDeClientes.add(new ClienteThread("10. Leila",Arrays.asList("CORTAR_UNHA","CORTAR_CABELO", "FAZER_PES" )));
		
		
		
		Cabelereiro primeiroCabeleleiroThread = new Cabelereiro(listaDeClientes);
		Cabelereiro segundoCabeleleiroThread = new Cabelereiro(listaDeClientes);
		Cabelereiro terceiroCabeleleiroThread = new Cabelereiro(listaDeClientes);
		
		primeiroCabeleleiroThread.start();
		segundoCabeleleiroThread.start();
		terceiroCabeleleiroThread.start();
	} 

}
