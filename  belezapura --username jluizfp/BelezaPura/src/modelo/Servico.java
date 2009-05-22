package modelo;

public class Servico {

	/*
	 * Tipos de Serviços:
	 * 
	 *  1 - penteado
	 *  2 - corte
	 *  3 - corte e penteado
	 *  4 - lavagem
	 *  5 - pedicure
	 *  6 - depilação
	 *  7 - massagem
	 *  
	 */
	private int tipo;
		
	private float custo;
	private int tempo;
	
	/*
	 * Variavel de verificação de execução do serviço:
	 * 
	 * TRUE = se o serviço já foi feito.
	 * FALSE = se o serviço ainda não foi feito. 
	 * 
	 */
	
	private boolean encerrado;
	
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
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
