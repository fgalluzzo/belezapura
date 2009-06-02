package modelo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Vector;

public class FilaEspera {
	
	//private PriorityQueue<Cliente> lista;
    private Vector<Cliente> lista;
    
    /*class Compara implements Comparator<Cliente> {
    	public int compare(Cliente x, Cliente y) {
            if (x.getTempoChegada() < y.getTempoChegada()) {
                return -1;
            }
            if (x.getTempoChegada() > y.getTempoChegada()) {
                return 1;
            }
            return 0;
        }
    }*/

	public FilaEspera() {
		//Comparator<Cliente> c = new Compara();
		//lista = new PriorityQueue<Cliente>(20,c);
	    lista = new Vector<Cliente>();
	}
	
	public void insereCliente(Cliente e){
		lista.add(e);
		if(lista.size()>1)
			ordenaLista(0,lista.size()-1);
	}
	
	public Cliente removeCliente(){
		return lista.firstElement();
	
	}
	public Cliente removeCliente(int i){
		return lista.remove(i);
	}
	public Cliente get(int i){
		return lista.elementAt(i);
	}
	public boolean vazia(){
		return lista.isEmpty();
	}
	
	public int size(){
		return lista.size();
	}
private  void ordenaLista(int lo, int hi){
		
		Cliente clienteA = new Cliente();
		Cliente clienteB = new Cliente();
		Cliente clienteC = new Cliente();
		
		 int i=lo, j=hi;
		 clienteB = lista.get((lo+hi)/2);
		// lista.set(((lo+1)+hi)/2, eventoB);
		 
		 do{
			 while (lista.get(i).getTempoChegada() <clienteB.getTempoChegada()) i++;
			 while (lista.get(j).getTempoChegada()>clienteB.getTempoChegada()) j--;
			 
			 if( i<=j ){
				 clienteA = lista.get(i);
				 clienteC = lista.get(j);
				 lista.set(i,clienteC);
				 lista.set(j, clienteA);
				 i++;
				 j--;
			 }
		 }while(i<=j);
		

		 if (lo<j) ordenaLista( lo, j);
		 if (i<hi) ordenaLista( i, hi);
				
		
	}
}
