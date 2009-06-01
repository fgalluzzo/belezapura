package modelo;

public class Servico {
    
	/*private final int pesoCortePent = 18;
	private final int pesoPenteado = 15;
	private final int pesoCorte = 14 ;
	private final int pesoDepilacao = 13;
	private final int pesoPedicure = 12;
	private final int pesoMassagem = 11 ;
	private final int pesoLavagem = 10;
	*/
	private TipoServico tipoServico;
	private int custo;
	//private int tempo;
	
	/*
	 * Variavel de verificacao de execucao do servico:
	 * 
	 * TRUE = se o servico ja foi feito.
	 * FALSE = se o servico ainda nao foi feito. 
	 * 
	 */
	
	private boolean encerrado;
	
	public Servico(){
		
	}
	public Servico(TipoServico ts){
		this.setTipoServico(ts);	
	}
	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
		//O pre�o de cada servi�o � de 50 para penteado,
		//  30 para corte, 40 para corte e pente-
		//ado, 10 para lavagem, 30 para pedicure, 40 para depila��o e 20 para massagem.
		
		//O tempo gasto em cada servi�o por cada cliente deve ser gerado aleatoriamente con-
		//siderando a seguinte ordem decrescente de dura��o: penteado, corte, depila��o, p�s
		//e m�os, massagem e lavagem.

		/*if (tipoServico == TipoServico.PENTEADO) {
			this.tempo = (int)Math.random()*pesoPenteado;
		} else if (tipoServico == TipoServico.CORTE) {
			this.tempo = (int)Math.random()*pesoCorte;
		} else if (tipoServico == TipoServico.CORTE_E_PENTEADO) {
			this.tempo = (int)Math.random()*pesoCortePent;
		} else if (tipoServico == TipoServico.MASSAGEM) {
			this.tempo = (int)Math.random()*pesoMassagem;
		} else if (tipoServico == TipoServico.PEDICURE) {
			this.tempo = (int)Math.random()*pesoPedicure;
		} else if (tipoServico == TipoServico.DEPILACAO) {
			this.tempo = (int)Math.random()*pesoDepilacao;
		} else if (tipoServico == TipoServico.LAVAGEM) {
			this.tempo = (int)Math.random()*pesoLavagem;
		}*/		
		this.custo = tipoServico.getValor();
	}
	
	public TipoServico getTipoServico() {
		return tipoServico;
	}
	
	public float getCusto() {
		return custo;
	}

	/*public int getTempo() {
		return tempo;
	}*/

	public void setEncerrado(boolean status) {
		this.encerrado = status;
	}

	public boolean isEncerrado() {
		return encerrado;
	}
	
}
