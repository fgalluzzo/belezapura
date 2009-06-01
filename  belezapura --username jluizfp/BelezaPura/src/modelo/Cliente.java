package modelo;

import java.util.Vector;

public class Cliente {

	private double tempoChegada;
	private Vector<Servico> servicos;
	
	public void setTempoChegada(double codChegada) {
		this.tempoChegada = codChegada;
	}
	
	public double getTempoChegada() {
		return tempoChegada;
	}

	public void setServicos(Vector<Servico> servicos) {
		this.servicos = servicos;
	}

	public Vector<Servico> getServicos() {
		return servicos;
	}
}
