package view;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.concurrent.Semaphore;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import modelo.FilaCaixa;
import modelo.FilaEspera;
import controle.Cabeleireiro;
import controle.Caixa;
import controle.ChegadaClientes;
import controle.Controle;
import controle.Cronometro;
import controle.Depiladora;
import controle.Lavadeira;
import controle.Massagista;
import controle.Pedicure;

public class Entrada extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form Entrada */
    public Entrada() {
        initComponents();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(new Point((screenSize.width - frameSize.width) / 2,
                              (screenSize.height - frameSize.height) / 2));
        this.setResizable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {

        jPanelCabecalho = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelMeio = new javax.swing.JPanel();
        jLabelLambda = new javax.swing.JLabel();
        jTextFieldLambda = new javax.swing.JTextField();
        jLabelHorarioA = new javax.swing.JLabel();
        jTextFieldHorarioA = new javax.swing.JTextField();
        jLabelHorarioA1 = new javax.swing.JLabel();
        jTextFieldHorarioA1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelDescricao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Beleza Pura - Sistemas Operacionais 2009.1");

        //jLabelLogo.setText("jLabel2");
        jLabelLogo = new javax.swing.JLabel(new ImageIcon("imgs/logoPrincipal.png"));
        
        jLabelTitulo.setText("Trabalho de Sistemas Operacionais 2009.1\nGrupo 8 - Beleza Pura\\n Parametros Iniciais");

        javax.swing.GroupLayout jPanelCabecalhoLayout = new javax.swing.GroupLayout(jPanelCabecalho);
        jPanelCabecalho.setLayout(jPanelCabecalhoLayout);
        jPanelCabecalhoLayout.setHorizontalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabecalhoLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanelCabecalhoLayout.setVerticalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );
        
        jLabelLambda.setText("Lambda:");

        jTextFieldLambda.setText("2.0");

        jLabelHorarioA.setText("H_Abertura:");

        jTextFieldHorarioA.setText("09");

        jLabelHorarioA1.setText("H_Fechamento:");

        jTextFieldHorarioA1.setText("19");

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescricao.setText("Par�metros Iniciais de Simula��o");

        javax.swing.GroupLayout jPanelMeioLayout = new javax.swing.GroupLayout(jPanelMeio);
        jPanelMeio.setLayout(jPanelMeioLayout);
        jPanelMeioLayout.setHorizontalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addComponent(jLabelLambda, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLambda, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addComponent(jLabelHorarioA, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldHorarioA, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addComponent(jLabelHorarioA1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldHorarioA1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanelMeioLayout.setVerticalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLambda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLambda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHorarioA, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHorarioA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHorarioA1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHorarioA1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMeio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>
    
    private void jButton1ActionPerformed(ActionEvent evt) {
    	Simulador.lambda = Double.parseDouble(jTextFieldLambda.getText());
    	
    	Simulador.horaAberturaEmSegundos = Integer.parseInt(jTextFieldHorarioA.getText());
    	Simulador.horaFechamentoEmSegundos = Integer.parseInt(jTextFieldHorarioA1.getText());
    	
    	if (Simulador.horaFechamentoEmSegundos <= Simulador.horaAberturaEmSegundos) {
    		JOptionPane.showMessageDialog(null, "O horario de fechamento do sal�o � menor ou igual ao horario de abertura.","Mensagem de Erro" , JOptionPane.ERROR_MESSAGE);
    	} else {
    		this.setVisible(false);
        	iniciarSimulacao();
    	}
	}
    
    private void iniciarSimulacao() {
    	
    	Simulador.tempoExpedienteEmSegundos = Simulador.horaFechamentoEmSegundos - Simulador.horaAberturaEmSegundos;
    	Simulador.horarioComercial = 3*Simulador.tempoExpedienteEmSegundos;
    	
    	Simulador.mutualEx = new Semaphore(1);
    	Simulador.mutualExLav = new Semaphore(1);
    	Simulador.mutualExCaixa = new Semaphore(1);
    	Simulador.sinc = new Semaphore(0);
    	Simulador.sincLav = new Semaphore(0);
    	Simulador.sincCaixa = new Semaphore(0);
		
    	
		
    	Simulador.fila = new FilaEspera();
    	Simulador.filaLavagem = new FilaEspera();
    	Simulador.filaCaixa = new FilaCaixa();
		
		new Janela().setVisible(true);
		
		Simulador.tempoInicial = System.currentTimeMillis();
		
		Cronometro cronometro = new Cronometro();
		cronometro.start();
		
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
		
		Caixa cx1 = new Caixa();
		cx1.start();
		Caixa cx2 = new Caixa();
		cx2.start();
		
		ChegadaClientes cc = new ChegadaClientes();
		cc.start();
		Controle cntrl = new Controle();
		cntrl.start();	
	}

	// Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelHorarioA;
    private javax.swing.JLabel jLabelHorarioA1;
    private javax.swing.JLabel jLabelLambda;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCabecalho;
    private javax.swing.JPanel jPanelMeio;
    private javax.swing.JTextField jTextFieldHorarioA;
    private javax.swing.JTextField jTextFieldHorarioA1;
    private javax.swing.JTextField jTextFieldLambda;
    // End of variables declaration

}
