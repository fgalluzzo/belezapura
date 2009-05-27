package modelo;

import java.util.Vector;

public class Cliente {

	private int tempoChegada;
	private Vector<Servico> servicos;
	
	public void setTempoChegada(int codChegada) {
		this.tempoChegada = codChegada;
	}
	
	public int getTempoChegada() {
		return tempoChegada;
	}

	public void setServicos(Vector<Servico> servicos) {
		this.servicos = servicos;
	}

	public Vector<Servico> getServicos() {
		return servicos;
	}
}
