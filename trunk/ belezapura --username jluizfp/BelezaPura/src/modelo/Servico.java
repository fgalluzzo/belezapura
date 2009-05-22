package modelo;

public class Servico {

	private TipoServico tipoServico;
		
	private float custo;
	private int tempo;
	
	/*
	 * Variavel de verificacao de execucao do servico:
	 * 
	 * TRUE = se o servico ja foi feito.
	 * FALSE = se o servico ainda nao foi feito. 
	 * 
	 */
	
	private boolean encerrado;
	
	
	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public float getCusto() {
		return custo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setEncerrado(boolean status) {
		this.encerrado = status;
	}

	public boolean isEncerrado() {
		return encerrado;
	}
	
}
