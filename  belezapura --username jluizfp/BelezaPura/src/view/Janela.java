package view;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

public class Janela extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	
	private javax.swing.JButton jButtonParar;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelCabeleireira1;
    private javax.swing.JLabel jLabelCabeleireira2;
    private javax.swing.JLabel jLabelCabeleireira3;
    private javax.swing.JLabel jLabelCabeleireira4;
    private javax.swing.JLabel jLabelCabeleireira5;
    private javax.swing.JLabel jLabelCabeloStatus1;
    private javax.swing.JLabel jLabelCabeloStatus2;
    private javax.swing.JLabel jLabelCabeloStatus3;
    private javax.swing.JLabel jLabelCabeloStatus4;
    private javax.swing.JLabel jLabelCabeloStatus5;
    private javax.swing.JLabel jLabelCaixa1;
    private javax.swing.JLabel jLabelCaixa2;
    private javax.swing.JLabel jLabelCaixaStatus1;
    private javax.swing.JLabel jLabelCaixaStatus2;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelClientesChegada;
    private javax.swing.JLabel jLabelFaturamentoLogo;
    private javax.swing.JLabel jLabelFaturamentoValor;
    private javax.swing.JLabel jLabelLavadaStatus1;
    private javax.swing.JLabel jLabelLavadaStatus2;
    private javax.swing.JLabel jLabelLavadaStatus3;
    private javax.swing.JLabel jLabelLavadora1;
    private javax.swing.JLabel jLabelLavadora2;
    private javax.swing.JLabel jLabelLavadora3;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPeStatus1;
    private javax.swing.JLabel jLabelPeStatus2;
    private javax.swing.JLabel jLabelPeStatus3;
    private javax.swing.JLabel jLabelDepilacaoStatus1;
    private javax.swing.JLabel jLabelDepilacaoStatus2;
    private javax.swing.JLabel jLabelMassagemStatus1;
    private javax.swing.JLabel jLabelPedicure1;
    private javax.swing.JLabel jLabelPedicure2;
    private javax.swing.JLabel jLabelPedicure3;
    private javax.swing.JLabel jLabelDepiladora1;
    private javax.swing.JLabel jLabelDepiladora2;
    private javax.swing.JLabel jLabelMassagista1;
    private javax.swing.JLabel jLabelRelogioLogo;
    private javax.swing.JList jListClientes;
    private javax.swing.JPanel jPanelCabeleireiras;
    private javax.swing.JPanel jPanelCaixas;
    private javax.swing.JPanel jPanelDepiladoras;
    private javax.swing.JPanel jPanelEsquerda;
    private javax.swing.JPanel jPanelFaturamento;
    private javax.swing.JPanel jPanelLavadoras;
    private javax.swing.JPanel jPanelMassagista;
    private javax.swing.JPanel jPanelMeio;
    private javax.swing.JPanel jPanelPedicures;
    private javax.swing.JPanel jPanelRelogio;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JScrollPane jScrollClientes;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;

	
    public Janela() {
        initComponents();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(new Point((screenSize.width - frameSize.width) / 2,
                              (screenSize.height - frameSize.height) / 2));
        this.setResizable(false);
    }

    private void initComponents() {
    	
        jPanelEsquerda = new javax.swing.JPanel();
        jLabelClientesChegada = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jScrollClientes = new javax.swing.JScrollPane();
        jListClientes = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelMeio = new javax.swing.JPanel();
        jPanelMassagista = new javax.swing.JPanel();
        jPanelDepiladoras = new javax.swing.JPanel();
        jPanelPedicures = new javax.swing.JPanel();
        jPanelCabeleireiras = new javax.swing.JPanel();
        jPanelLavadoras = new javax.swing.JPanel();
        jPanelCaixas = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelRodape = new javax.swing.JPanel();
        jPanelFaturamento = new javax.swing.JPanel();
        jLabelFaturamentoValor = new javax.swing.JLabel();
        jPanelRelogio = new javax.swing.JPanel();
        jLabelHora = new javax.swing.JLabel();
        jButtonParar = new javax.swing.JButton();

        jLabelLogo = new javax.swing.JLabel(new ImageIcon("imgs/logoPrincipal.png"));
        
        jLabelLavadora1 = new javax.swing.JLabel(new ImageIcon("imgs/lavadora.png"));
        jLabelLavadora2 = new javax.swing.JLabel(new ImageIcon("imgs/lavadora.png"));
        jLabelLavadora3 = new javax.swing.JLabel(new ImageIcon("imgs/lavadora.png"));
        jLabelLavadaStatus1 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        jLabelLavadaStatus2 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        jLabelLavadaStatus3 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        
        jLabelCabeleireira1 = new javax.swing.JLabel(new ImageIcon("imgs/cabeleireira.png"));
        jLabelCabeleireira2 = new javax.swing.JLabel(new ImageIcon("imgs/cabeleireira.png"));
        jLabelCabeleireira3 = new javax.swing.JLabel(new ImageIcon("imgs/cabeleireira.png"));
        jLabelCabeleireira4 = new javax.swing.JLabel(new ImageIcon("imgs/cabeleireira.png"));
        jLabelCabeleireira5 = new javax.swing.JLabel(new ImageIcon("imgs/cabeleireira.png"));
        jLabelCabeloStatus1 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        jLabelCabeloStatus2 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        jLabelCabeloStatus3 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        jLabelCabeloStatus4 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        jLabelCabeloStatus5 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        
        jLabelPedicure1 = new javax.swing.JLabel(new ImageIcon("imgs/pedicure.png"));
        jLabelPedicure2 = new javax.swing.JLabel(new ImageIcon("imgs/pedicure.png"));
        jLabelPedicure3 = new javax.swing.JLabel(new ImageIcon("imgs/pedicure.png"));
        
        jLabelPeStatus1 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        jLabelPeStatus2 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        jLabelPeStatus3 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        
        jLabelDepiladora1 = new javax.swing.JLabel(new ImageIcon("imgs/depiladora.png"));
        jLabelDepiladora2 = new javax.swing.JLabel(new ImageIcon("imgs/depiladora.png"));
        
        jLabelDepilacaoStatus1 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        jLabelDepilacaoStatus2 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        
        jLabelMassagista1 = new javax.swing.JLabel(new ImageIcon("imgs/massagista.png"));
        jLabelMassagemStatus1 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));

        jLabelCaixa1 = new javax.swing.JLabel(new ImageIcon("imgs/caixas.png"));
        jLabelCaixa2 = new javax.swing.JLabel(new ImageIcon("imgs/caixas.png"));
        
        jLabelCaixaStatus1 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        jLabelCaixaStatus2 = new javax.swing.JLabel(new ImageIcon("imgs/free.gif"));
        
        jLabelFaturamentoLogo = new javax.swing.JLabel(new ImageIcon("imgs/faturamento.png"));
        
        jLabelRelogioLogo = new javax.swing.JLabel(new ImageIcon("imgs/relogio.png"));

        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador - Beleza Pura - Sistemas Operacionais 2009.1");

        jLabelClientesChegada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClientesChegada.setText("Clientes - Horario de Chegada");

        jLabelCliente = new javax.swing.JLabel(new ImageIcon("imgs/cliente.gif"));

        jListClientes.setModel(new javax.swing.AbstractListModel() {
           private static final long serialVersionUID = 1L;
			String[] strings = { "Cliente 1 - 00:00:00", "Cliente 2 - 00:00:00", "Cliente 3 - 00:00:00", "Cliente 4 - 00:00:00", "Cliente 5 - 00:00:00" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollClientes.setViewportView(jListClientes);

        javax.swing.GroupLayout jPanelEsquerdaLayout = new javax.swing.GroupLayout(jPanelEsquerda);
        jPanelEsquerda.setLayout(jPanelEsquerdaLayout);
        jPanelEsquerdaLayout.setHorizontalGroup(
            jPanelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEsquerdaLayout.createSequentialGroup()
                .addGroup(jPanelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEsquerdaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addGroup(jPanelEsquerdaLayout.createSequentialGroup()
                        .addComponent(jLabelClientesChegada, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jPanelEsquerdaLayout.setVerticalGroup(
            jPanelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEsquerdaLayout.createSequentialGroup()
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClientesChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanelMassagista.setBorder(javax.swing.BorderFactory.createTitledBorder("Massagista"));
        
        javax.swing.GroupLayout jPanelMassagistaLayout = new javax.swing.GroupLayout(jPanelMassagista);
        jPanelMassagista.setLayout(jPanelMassagistaLayout);
        jPanelMassagistaLayout.setHorizontalGroup(
            jPanelMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMassagistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMassagemStatus1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jLabelMassagista1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMassagistaLayout.setVerticalGroup(
            jPanelMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMassagistaLayout.createSequentialGroup()
                .addComponent(jLabelMassagista1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMassagemStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelDepiladoras.setBorder(javax.swing.BorderFactory.createTitledBorder("Depiladoras"));

        javax.swing.GroupLayout jPanelDepiladorasLayout = new javax.swing.GroupLayout(jPanelDepiladoras);
        jPanelDepiladoras.setLayout(jPanelDepiladorasLayout);
        jPanelDepiladorasLayout.setHorizontalGroup(
            jPanelDepiladorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDepiladorasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDepiladorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelDepilacaoStatus1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDepiladora1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDepiladorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelDepilacaoStatus2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDepiladora2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelDepiladorasLayout.setVerticalGroup(
            jPanelDepiladorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDepiladorasLayout.createSequentialGroup()
                .addGroup(jPanelDepiladorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDepiladorasLayout.createSequentialGroup()
                        .addComponent(jLabelDepiladora1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDepilacaoStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDepiladorasLayout.createSequentialGroup()
                        .addComponent(jLabelDepiladora2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDepilacaoStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelPedicures.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedicures"));

        javax.swing.GroupLayout jPanelPedicuresLayout = new javax.swing.GroupLayout(jPanelPedicures);
        jPanelPedicures.setLayout(jPanelPedicuresLayout);
        jPanelPedicuresLayout.setHorizontalGroup(
            jPanelPedicuresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedicuresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPedicuresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelPeStatus1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPedicure1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPedicuresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelPeStatus2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPedicure2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPedicuresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelPeStatus3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPedicure3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPedicuresLayout.setVerticalGroup(
            jPanelPedicuresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedicuresLayout.createSequentialGroup()
                .addGroup(jPanelPedicuresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPedicuresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPedicuresLayout.createSequentialGroup()
                            .addComponent(jLabelPedicure1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelPeStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelPedicuresLayout.createSequentialGroup()
                            .addComponent(jLabelPedicure2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelPeStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPedicuresLayout.createSequentialGroup()
                        .addComponent(jLabelPedicure3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPeStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelCabeleireiras.setBorder(javax.swing.BorderFactory.createTitledBorder("Cabeleireiras"));

        javax.swing.GroupLayout jPanelCabeleireirasLayout = new javax.swing.GroupLayout(jPanelCabeleireiras);
        jPanelCabeleireiras.setLayout(jPanelCabeleireirasLayout);
        jPanelCabeleireirasLayout.setHorizontalGroup(
            jPanelCabeleireirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabeleireirasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCabeleireirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCabeloStatus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCabeleireira1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCabeleireirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCabeloStatus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCabeleireira2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCabeleireirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCabeloStatus3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCabeleireira3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCabeleireirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCabeloStatus4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCabeleireira4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCabeleireirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCabeloStatus5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCabeleireira5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCabeleireirasLayout.setVerticalGroup(
            jPanelCabeleireirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabeleireirasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCabeleireirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCabeleireirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCabeleireirasLayout.createSequentialGroup()
                            .addComponent(jLabelCabeleireira3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelCabeloStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCabeleireirasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCabeleireirasLayout.createSequentialGroup()
                                .addComponent(jLabelCabeleireira1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCabeloStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCabeleireirasLayout.createSequentialGroup()
                                .addComponent(jLabelCabeleireira2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCabeloStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelCabeleireirasLayout.createSequentialGroup()
                        .addComponent(jLabelCabeleireira4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCabeloStatus4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCabeleireirasLayout.createSequentialGroup()
                        .addComponent(jLabelCabeleireira5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCabeloStatus5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanelLavadoras.setBorder(javax.swing.BorderFactory.createTitledBorder("Lavadoras"));

        javax.swing.GroupLayout jPanelLavadorasLayout = new javax.swing.GroupLayout(jPanelLavadoras);
        jPanelLavadoras.setLayout(jPanelLavadorasLayout);
        jPanelLavadorasLayout.setHorizontalGroup(
            jPanelLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLavadorasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLavadaStatus1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jLabelLavadora1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelLavadaStatus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLavadora2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelLavadaStatus3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLavadora3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLavadorasLayout.setVerticalGroup(
            jPanelLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLavadorasLayout.createSequentialGroup()
                .addGroup(jPanelLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLavadora1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLavadora2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLavadora3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLavadaStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLavadaStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLavadaStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCaixas.setBorder(javax.swing.BorderFactory.createTitledBorder("Caixas"));

        javax.swing.GroupLayout jPanelCaixasLayout = new javax.swing.GroupLayout(jPanelCaixas);
        jPanelCaixas.setLayout(jPanelCaixasLayout);
        jPanelCaixasLayout.setHorizontalGroup(
            jPanelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCaixasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelCaixaStatus1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCaixa1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelCaixaStatus2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCaixa2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelCaixasLayout.setVerticalGroup(
            jPanelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCaixasLayout.createSequentialGroup()
                .addGroup(jPanelCaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCaixasLayout.createSequentialGroup()
                        .addComponent(jLabelCaixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCaixaStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCaixasLayout.createSequentialGroup()
                        .addComponent(jLabelCaixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCaixaStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMeioLayout = new javax.swing.GroupLayout(jPanelMeio);
        jPanelMeio.setLayout(jPanelMeioLayout);
        jPanelMeioLayout.setHorizontalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addComponent(jPanelLavadoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanelCabeleireiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelCaixas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMeioLayout.createSequentialGroup()
                        .addComponent(jPanelPedicures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jPanelDepiladoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addComponent(jPanelMassagista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMeioLayout.setVerticalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeioLayout.createSequentialGroup()
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelLavadoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCabeleireiras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMassagista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPedicures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDepiladoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanelCaixas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanelMassagista.getAccessibleContext().setAccessibleName("null");

        jPanelFaturamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Faturamento do Dia"));

        jLabelFaturamentoValor.setText("R$ xx.xxx,xx");

        javax.swing.GroupLayout jPanelFaturamentoLayout = new javax.swing.GroupLayout(jPanelFaturamento);
        jPanelFaturamento.setLayout(jPanelFaturamentoLayout);
        jPanelFaturamentoLayout.setHorizontalGroup(
            jPanelFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFaturamentoLayout.createSequentialGroup()
                .addComponent(jLabelFaturamentoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(jPanelFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFaturamentoLayout.createSequentialGroup()
                    .addContainerGap(84, Short.MAX_VALUE)
                    .addComponent(jLabelFaturamentoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelFaturamentoLayout.setVerticalGroup(
            jPanelFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFaturamentoLayout.createSequentialGroup()
                .addComponent(jLabelFaturamentoLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFaturamentoLayout.createSequentialGroup()
                    .addComponent(jLabelFaturamentoValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabelHora.setText("00:00:00");

        javax.swing.GroupLayout jPanelRelogioLayout = new javax.swing.GroupLayout(jPanelRelogio);
        jPanelRelogio.setLayout(jPanelRelogioLayout);
        jPanelRelogioLayout.setHorizontalGroup(
            jPanelRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelogioLayout.createSequentialGroup()
                .addComponent(jLabelRelogioLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHora, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRelogioLayout.setVerticalGroup(
            jPanelRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelogioLayout.createSequentialGroup()
                .addComponent(jLabelRelogioLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelRelogioLayout.createSequentialGroup()
                    .addComponent(jLabelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jButtonParar.setText("Parar");
        jButtonParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addComponent(jPanelFaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(jButtonParar)
                .addGap(162, 162, 162)
                .addComponent(jPanelRelogio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelFaturamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelRelogio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelRodapeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonParar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanelEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMeio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1)
                        .addComponent(jPanelEsquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
}