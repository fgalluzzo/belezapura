package modelo;
import java.util.List;


public class ClienteThread {

	// Classe utilizada  apenas para teste de manutenção da Thread
	// Tipo de pedidos = CORTAR_CABELO , LAVAR_CABECA , FAZER_PES ,APLICAR_MASSAGEM ...
    
	private String nome;
	private Boolean cabeloLavado = Boolean.TRUE;
	private Boolean pesFeitos = Boolean.TRUE;
	private Boolean massagemRecebida = Boolean.TRUE;
	private Boolean cabeloCortado = Boolean.TRUE;
	private Boolean depilado = Boolean.TRUE; 
	private List<String> pedidos;
	
	public ClienteThread(String nome,List<String> pedidos){
	
		this.nome = nome;
	    this.pedidos = pedidos;
	    
	    if(pedidos.contains("CORTAR_CABELO"))
	    	cabeloCortado = Boolean.FALSE;
	    
	    if(pedidos.contains("LAVAR_CABECA"))
	    	cabeloLavado = Boolean.FALSE;
	    
	    if(pedidos.contains("FAZER_PES"))
	    	pesFeitos = Boolean.FALSE;
	   	    
	    if(pedidos.contains("APLICAR_MASSAGEM"))
	    	massagemRecebida = Boolean.FALSE;
	    
	    if(pedidos.contains("FAZER_DEPILACAO"))
	    	depilado = Boolean.FALSE;
	}
	
	
	public List<String> getPedidos() {
		return pedidos;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public Boolean getCabeloCortado() {
		return cabeloCortado;
	}

	public void setCabeloCortado(Boolean cabeloCortado) {
		this.cabeloCortado = cabeloCortado;
	}
	
	public Boolean getCabeloLavado() {
		return cabeloLavado;
	}

	public void setCabeloLavado(Boolean cabeloLavado) {
		this.cabeloLavado = cabeloLavado;
	}

	public Boolean getPesFeitos() {
		return pesFeitos;
	}

	public void setPesFeitos(Boolean pesFeitos) {
		this.pesFeitos = pesFeitos;
	}

	public Boolean getMassagemRecebida() {
		return massagemRecebida;
	}

	public void setMassagemRecebida(Boolean massagemRecebida) {
		this.massagemRecebida = massagemRecebida;
	}
	
	public Boolean getDepilado() {
		return depilado;
	}

	public void setDepilado(Boolean depilado) {
		this.depilado = depilado;
	}
}
