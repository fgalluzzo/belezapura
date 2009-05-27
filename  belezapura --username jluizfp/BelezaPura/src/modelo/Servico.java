package modelo;

public class Servico {
    
	private final int pesoCortePent = 18;
	private final int pesoPenteado = 15;
	private final int pesoCorte = 14 ;
	private final int pesoDepilacao = 13;
	private final int pesoPedicure = 12;
	private final int pesoMassagem = 11 ;
	private final int pesoLavagem = 10;
	
	private int tipoServico;
	private int custo;
	private int tempo;
	
	/*
	 * Variavel de verificacao de execucao do servico:
	 * 
	 * TRUE = se o servico ja foi feito.
	 * FALSE = se o servico ainda nao foi feito. 
	 * 
	 */
	
	private boolean encerrado;
	
	
	public void setTipoServico(int tipoServico ) {
		this.tipoServico = tipoServico;
		//O preço de cada serviço é de 50 para penteado,
		//  30 para corte, 40 para corte e pente-
		//ado, 10 para lavagem, 30 para pedicure, 40 para depilação e 20 para massagem.
		
		//O tempo gasto em cada serviço por cada cliente deve ser gerado aleatoriamente con-
		//siderando a seguinte ordem decrescente de duração: penteado, corte, depilação, pés
		//e mãos, massagem e lavagem.

		switch(tipoServico){
			case 0:// Penteado
				this.custo =  50;
				this.tempo = (int)Math.random()*pesoPenteado;
				break;
			case 1:// Corte
				this.custo = 30;
				this.tempo = (int)Math.random()*pesoCorte;
				break;
			case 2://Corte e Penteado
				this.custo = 40;
				this.tempo = (int)Math.random()*pesoCortePent;
				break;
			case 3:// Massagem
				this.custo =  20;
				this.tempo = (int)Math.random()*pesoMassagem;
				break;
			case 4:// Pedicure
				this.custo = 30;
				this.tempo = (int)Math.random()*pesoPedicure;
				break;
			case 5://Depilação
				this.custo = 40;
				this.tempo = (int)Math.random()*pesoDepilacao;
				break;
			case 6://Lavagem
				this.custo = 10;
				this.tempo = (int)Math.random()*pesoLavagem;
				break;
				
		}
	}
	
	public TipoServico getTipoServico() {
		return TipoServico.getByIndice(tipoServico);
	}

	public float getCusto() {
		return custo;
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
