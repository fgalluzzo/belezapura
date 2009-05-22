package modelo;

import java.util.Vector;

public class Cliente {

	private int codChegada;
	private Vector<Servico> servicos;
	
	public void setCodChegada(int codChegada) {
		this.codChegada = codChegada;
	}
	
	public int getCodChegada() {
		return codChegada;
	}

	public void setServicos(Vector<Servico> servicos) {
		this.servicos = servicos;
	}

	public Vector<Servico> getServicos() {
		return servicos;
	}
}
