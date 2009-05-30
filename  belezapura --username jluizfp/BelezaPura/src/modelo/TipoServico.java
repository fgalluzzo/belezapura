package modelo;

public enum TipoServico {
	
	PENTEADO(50),
	CORTE(30),
	CORTE_E_PENTEADO(40),
	MASSAGEM(20),
	PEDICURE(30),
	DEPILACAO(40),
	LAVAGEM(10);
	
	private int valor;
	
	private TipoServico(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public static TipoServico getByIndice(int valor) {
		switch (valor) {
			case 0: return PENTEADO;
			case 1: return CORTE;
			case 2: return CORTE_E_PENTEADO;
			case 3: return MASSAGEM;
			case 4: return PEDICURE;
			case 5: return DEPILACAO;
			case 6: return LAVAGEM ;
			default: throw new IndexOutOfBoundsException();
		}
	}
}
