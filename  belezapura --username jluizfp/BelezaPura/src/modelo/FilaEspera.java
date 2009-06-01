package modelo;

import java.util.Comparator;
import java.util.PriorityQueue;

class Compara implements Comparator<Cliente> {
	public int compare(Cliente x, Cliente y) {
        if (x.getTempoChegada() < y.getTempoChegada()) {
            return -1;
        }
        if (x.getTempoChegada() > y.getTempoChegada()) {
            return 1;
        }
        return 0;
    }
}

public class FilaEspera {
	
	private PriorityQueue<Cliente> lista;

	
	public FilaEspera() {
		Comparator<Cliente> c = new Compara();
		lista = new PriorityQueue<Cliente>(20,c);
	
	}
	
	public void insereCliente(Cliente e){
		lista.add(e);
		
	}
	
	public Cliente removeEvento(){
		return lista.poll();
	
	}
	
	public boolean vazia(){
		return lista.isEmpty();
	}
	public int size(){
		return lista.size();
	}
	
}
