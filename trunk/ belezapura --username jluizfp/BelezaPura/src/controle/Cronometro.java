package controle;

import view.Janela;
import view.Simulador;

public class Cronometro extends Thread {

	private double horaRealEmSegundos;
	private int cont = 0;
	
	public void run() {

		while (cont < Simulador.horarioComercial && !Simulador.salaoFechado) {
			try {
				sleep(1000);
				horaRealEmSegundos = ((Simulador.tempoExpedienteEmSegundos*cont)/Simulador.horarioComercial) + Simulador.horaAberturaEmSegundos; 
				cont++;
				int hora = (int) horaRealEmSegundos / 3600;
				int minuto = (int) horaRealEmSegundos % 3600;
				minuto = minuto/100;
				
				//System.out.println(hora + " : " + minuto);
				
				Janela.jLabelHora.setText(String.format("%02d:%02d", hora, minuto));
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
