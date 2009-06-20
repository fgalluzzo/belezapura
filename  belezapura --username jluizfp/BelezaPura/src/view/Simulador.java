package view;

import java.util.concurrent.Semaphore;

import modelo.FilaCaixa;
import modelo.FilaEspera;

public class Simulador {
	/*private final int pesoCortePent = 18;
	private final int pesoPenteado = 15;
	private final int pesoCorte = 14 ;
	private final int pesoDepilacao = 13;
	private final int pesoPedicure = 12;
	private final int pesoMassagem = 11 ;
	private final int pesoLavagem = 10;
	*/
    public static final int pesoCorte = 3500 ;
    public static final int pesoPenteado = 4000;
    public static final int pesoCortePenteado = 5000;
    public static final int pesoLavagem = 1000;
    public static final int pesoMassagem = 1500;
    public static final int pesoPedicure =2500;
    public static final int pesoDepilacao =3000;
    public static final int pesoCaixa = 2000;
    
    public static int horaAberturaEmSegundos;
    public static int horaFechamentoEmSegundos  ;
    public static  double tempoExpedienteEmSegundos ;
    
    public static double horarioComercial;
    
    public static  double lambda ;
    
    public static int N;
	public static double tempoInicial;
	//public static double tempoSimulacao;
	public static FilaEspera fila;
	
	public static FilaEspera filaLavagem;
	public static FilaCaixa filaCaixa;
	
	public static Semaphore mutualEx;
	public static Semaphore sinc;
	public static Semaphore mutualExLav;
	public static Semaphore sincLav;
	public static Semaphore mutualExCaixa;
	public static Semaphore sincCaixa;
	
	public static int fatCab[] = new int[5];
	public static int fatLav[] = new int[3];
	public static int fatPed[] = new int[3];
	public static int fatDep[] = new int[2];
	public static int fatMas ;
	
	
	public static boolean salaoFechado = false;

}
