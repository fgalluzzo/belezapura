package view;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import modelo.Cliente;
import modelo.FilaEspera;
import controle.Cabeleireiro;
import controle.ChegadaClientes;
import controle.Controle;
import controle.Depiladora;
import controle.Lavadeira;
import controle.Massagista;
import controle.Pedicure;

public class Simulador {
    public static final int pesoCorte = 7500 ;
    public static final int pesoPenteado = 8000;
    public static final int pesoCortePenteado = 10000;
    public static final int pesoLavagem = 1500;
    public static final int pesoMassagem = 3000;
    public static final int pesoPedicure = 4000;
    public static final int pesoDepilacao = 5000;
    
    public static final int horarioComercial = 120;
    
    public static  double lambda = 1.5;
    
	public static double tempoInicial;
	//public static double tempoSimulacao;
	public static FilaEspera fila;
	
	public static FilaEspera filaLavagem;
	public static FilaEspera filaCaixa;
	
	//variáveis para sincronização
	public static int n =0;
	public static int nl = 0;
	public static int nc = 0;
	
	
	public static Semaphore mutualEx;
	public static Semaphore sinc;
	public static Semaphore mutualExLav;
	public static Semaphore sincLav;
	public static Semaphore mutualExCaixa;
	public static Semaphore sincCaixa;
	
	public static void main(String[] args) {
		mutualEx = new Semaphore(1);
		mutualExLav = new Semaphore(1);
		mutualExCaixa = new Semaphore(1);
		sinc = new Semaphore(0);
		sincLav = new Semaphore(0);
		sincCaixa = new Semaphore(0);
		
        new Janela().setVisible(true);
    
		tempoInicial = System.currentTimeMillis();
		
		fila = new FilaEspera();
		filaLavagem = new FilaEspera();
		filaCaixa = new FilaEspera();
		
		
		
		
		Cabeleireiro cab1 = new Cabeleireiro();
		cab1.start();
		Cabeleireiro cab2 = new Cabeleireiro();
		cab2.start();
		Cabeleireiro cab3 = new Cabeleireiro();
		cab3.start();
		Cabeleireiro cab4 = new Cabeleireiro();
		cab4.start();
		Cabeleireiro cab5 = new Cabeleireiro();
		cab5.start();
		
		Lavadeira lav1 = new Lavadeira();
		lav1.start();
		Lavadeira lav2 = new Lavadeira();
		lav2.start();
		Lavadeira lav3 = new Lavadeira();
		lav3.start();
		
		Pedicure ped1 = new Pedicure();
		ped1.start();
		Pedicure ped2 = new Pedicure();
		ped2.start();
		Pedicure ped3 = new Pedicure();
		ped3.start();
		
		Depiladora dep1 = new Depiladora();
		dep1.start();
		Depiladora dep2 = new Depiladora();
		dep2.start();
		
		Massagista mas1 = new Massagista();
		mas1.start();
		
		
		
		ChegadaClientes cc = new ChegadaClientes();
		cc.start();
		Controle cntrl = new Controle();
		cntrl.start();
		
	}

}
