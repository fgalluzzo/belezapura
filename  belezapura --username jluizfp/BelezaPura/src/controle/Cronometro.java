package controle;

import javax.swing.JOptionPane;

import view.Janela;
import view.Simulador;

public class Cronometro extends Thread {

	private double horaD;
	private double minutoD;
	private int hora;
	private int minuto;
	public void run() {

		while(!Simulador.salaoFechado) {
			try {
				if(Simulador.horaAberturaEmSegundos+hora == Simulador.horaFechamentoEmSegundos){
					Simulador.salaoFechado = true;
					JOptionPane.showMessageDialog(null, "Salão fechado para chegada de clientes!\n Aguarde o atendimento dos clientes finais.","Aviso de Encerramento do Expediente" , JOptionPane.INFORMATION_MESSAGE);
				}
				sleep(100);
				horaD = ((System.currentTimeMillis()- Simulador.tempoInicial)/1000);
				horaD *=(Simulador.tempoExpedienteEmSegundos/Simulador.horarioComercial);
				hora = (int) horaD;
				
				minutoD = ((System.currentTimeMillis()- Simulador.tempoInicial)/1000);
				minutoD *=(Simulador.tempoExpedienteEmSegundos/Simulador.horarioComercial*60);
				minutoD %= 60;
				minuto = (int)minutoD;
				
			
				
				Janela.jLabelHora.setText(String.format("%02d:%02d", Simulador.horaAberturaEmSegundos+hora, minuto));
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
