package modelo;

public class Servico {

	/*
	 * Tipos de Servi�os:
	 * 
	 *  1 - penteado
	 *  2 - corte
	 *  3 - corte e penteado
	 *  4 - lavagem
	 *  5 - pedicure
	 *  6 - depila��o
	 *  7 - massagem
	 *  
	 */
	private int tipo;
		
	private float custo;
	private int tempo;
	
	/*
	 * Variavel de verifica��o de execu��o do servi�o:
	 * 
	 * TRUE = se o servi�o j� foi feito.
	 * FALSE = se o servi�o ainda n�o foi feito. 
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
