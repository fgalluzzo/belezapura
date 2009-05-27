package modelo;

public enum TipoServico {
	
	//INDEFINIDO(0),
	PENTEADO(0),
	CORTE(1),
	CORTE_E_PENTEADO(2),
	MASSAGEM(3),
	PEDICURE(4),
	DEPILACAO(5),
	LAVAGEM(6);
	
	private int indice;
	
	private TipoServico(int indice) {
		this.indice = indice;
	}
	
	public int getIndice() {
		return indice;
	}
	
	public static TipoServico getByIndice(int indice) {
		switch (indice) {
			//case 0: return INDEFINIDO;
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
