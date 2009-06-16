package controle;

import view.Janela;
import view.Simulador;

public class Cronometro extends Thread {

	private double horaD;
	private double minutoD;
	private int hora;
	private int minuto;
	private int cont = 0;
	
	public void run() {

		while(!Simulador.salaoFechado) {
			try {
				sleep(100);
				horaD = ((System.currentTimeMillis()- Simulador.tempoInicial)/1000);
				horaD *=(Simulador.tempoExpedienteEmSegundos/Simulador.horarioComercial);
				hora = (int) horaD;
				
				minutoD = ((System.currentTimeMillis()- Simulador.tempoInicial)/1000);
				minutoD *=(Simulador.tempoExpedienteEmSegundos/Simulador.horarioComercial*60);
				minutoD %= 60;
				minuto = (int)minutoD;
				
				
				Janela.jLabelHora.setText(String.format("%02d:%02d", 9+hora, minuto));
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
