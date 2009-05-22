package modelo;

public enum TipoServico {
	
	INDEFINIDO(0),
	PENTEADO(1),
	CORTE(2),
	CORTE_E_PENTEADO(3),
	LAVAGEM(4),
	PEDICURE(5),
	DEPILACAO(6),
	MASSAGEM(7);
	
	private int indice;
	
	private TipoServico(int indice) {
		this.indice = indice;
	}
	
	public int getIndice() {
		return indice;
	}
	
	public static TipoServico getByIndice(int indice) {
		switch (indice) {
			case 0: return INDEFINIDO;
			case 1: return PENTEADO;
			case 2: return CORTE;
			case 3: return CORTE_E_PENTEADO;
			case 4: return LAVAGEM;
			case 5: return PEDICURE;
			case 6: return DEPILACAO;
			case 7: return MASSAGEM;
			default: throw new IndexOutOfBoundsException();
		}
	}
}
