package modelo;

import java.util.Vector;

public class FilaCaixa {
	
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

	public FilaCaixa() {
		//Comparator<Cliente> c = new Compara();
		//lista = new PriorityQueue<Cliente>(20,c);
	    lista = new Vector<Cliente>();
	}
	
	public void insereCliente(Cliente e){
		lista.add(e);
		
	}
	
	public static String imprime(FilaCaixa clientes) {
		
		String t = "";
		
		for(int i=0; i<clientes.size(); i++){
			t = "C" + (i+1) +" - " + ((Cliente) clientes.get(i)).getTempoChegada()+ "\n" + t;
		}
		
		return t;
	}

	public Cliente removeCliente(){
		return lista.remove(0);
	}
	public Cliente removeCliente(int i){
		Cliente r = lista.remove(i);
		//Janela.jListaClientes.setText(imprime(lista));
		return r;
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
	
}
