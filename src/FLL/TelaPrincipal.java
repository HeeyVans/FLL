package FLL;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	JComboBox comboBoxM01Ponte = new JComboBox();
	JComboBox comboBoxM01B1 = new JComboBox();
	JComboBox comboBoxM01B2 = new JComboBox();
	JComboBox comboBoxAbaixado = new JComboBox();
	JComboBox comboBoxApoiado = new JComboBox();
	JComboBox comboBoxM03 = new JComboBox();
	JComboBox comboBoxCirculo = new JComboBox();
	JComboBox comboBoxM04 = new JComboBox();
	JComboBox comboBoxQtdGrande = new JComboBox();
	JComboBox comboBoxQtdPequeno = new JComboBox();
	JComboBox comboBoxM14 = new JComboBox();
	JComboBox comboBoxM06 = new JComboBox();
	JComboBox comboBoxM07 = new JComboBox();
	JComboBox comboBoxM08 = new JComboBox();
	JComboBox comboBoxM10 = new JComboBox();
	JComboBox comboBoxM11 = new JComboBox();
	private JTextField textFieldVigasM09;
	private JTextField textFieldMesmaCor;
	private JTextField textFieldCorDiferente;
	private JTextField textFieldMelhorias;
	
	private boolean comboSelecionado(JComboBox comboBox) {
		if(comboBox.getSelectedIndex() == 1) {
			return true;
		}
		return false;
	}
	
	private int comboSelecionadoInteiro(JComboBox comboBox) {
		if(comboBox.getSelectedIndex() == 1) {
			return 1;
		}else if(comboBox.getSelectedIndex() == 2) {
			return 2;
		}else if(comboBox.getSelectedIndex() == 3) {
			return 3;
		}
		return 0;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setFont(new Font("Arial Black", Font.PLAIN, 15));
		setTitle("First Lego League - Treino");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipal.class.getResource("/Imagens/246x0w (1).jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1015, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(0, 785, 999, 76);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnContabilizar = new JButton("CONTABILIZAR");
		btnContabilizar.setForeground(Color.BLACK);
		btnContabilizar.setFont(new Font("Arial", Font.BOLD, 14));
		btnContabilizar.setBackground(Color.WHITE);
		btnContabilizar.setBounds(430, 16, 150, 38);
		panel.add(btnContabilizar);
		
		JLabel lblTempo = new JLabel("Tempo:");
		lblTempo.setBounds(10, 8, 110, 20);
		panel.add(lblTempo);
		lblTempo.setForeground(Color.WHITE);
		lblTempo.setFont(new Font("Arial", Font.BOLD, 18));
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(135, 206, 235));
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_16.setBounds(806, 5, 77, 65);
		panel.add(panel_16);
		panel_16.setLayout(null);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/PCR FLL.jpg")));
		label_11.setBounds(0, 0, 102, 65);
		panel_16.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/First-Lego-League - redimensionado 2.jpg")));
		label_12.setBounds(893, 5, 102, 65);
		panel.add(label_12);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Parte-De-Cima-FLL - Teste 6.jpg")));
		label.setBounds(0, 0, 999, 147);
		contentPane.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 158, 321, 616);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Miss\u00E3o 1 - Lugares Elevados (FLL).JPG")));
		label_1.setBounds(10, 36, 150, 149);
		panel_1.add(label_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 235));
		panel_2.setBounds(0, 0, 339, 30);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel M01 = new JLabel("M01 - LUGARES ELEVADOS");
		M01.setForeground(new Color(255, 255, 255));
		M01.setHorizontalAlignment(SwingConstants.CENTER);
		M01.setFont(new Font("Arial", Font.BOLD, 14));
		M01.setBounds(10, 6, 186, 19);
		panel_2.add(M01);
		
		JLabel lblM01_ponte = new JLabel("Ponte: ");
		lblM01_ponte.setHorizontalAlignment(SwingConstants.CENTER);
		lblM01_ponte.setFont(new Font("Arial", Font.BOLD, 15));
		lblM01_ponte.setBounds(151, 50, 61, 14);
		panel_1.add(lblM01_ponte);
		comboBoxM01Ponte.setBounds(249, 48, 46, 20);
		panel_1.add(comboBoxM01Ponte);
		
		comboBoxM01Ponte.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		
		JLabel lblM01Bandeira1 = new JLabel("Bandeira 1:");
		lblM01Bandeira1.setHorizontalAlignment(SwingConstants.CENTER);
		lblM01Bandeira1.setFont(new Font("Arial", Font.BOLD, 15));
		lblM01Bandeira1.setBounds(145, 79, 103, 20);
		panel_1.add(lblM01Bandeira1);
		comboBoxM01B1.setBounds(249, 79, 46, 20);
		panel_1.add(comboBoxM01B1);
		
		
		comboBoxM01B1.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		
		JLabel lblM01Bandeira2 = new JLabel("Bandeira 2:");
		lblM01Bandeira2.setFont(new Font("Arial", Font.BOLD, 15));
		lblM01Bandeira2.setBounds(155, 113, 83, 14);
		panel_1.add(lblM01Bandeira2);
		comboBoxM01B2.setBounds(249, 110, 46, 20);
		panel_1.add(comboBoxM01B2);
		
		
		comboBoxM01B2.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxAbaixado.setBounds(249, 231, 46, 20);
		panel_1.add(comboBoxAbaixado);
		
		
		comboBoxAbaixado.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxApoiado.setBounds(249, 262, 46, 20);
		panel_1.add(comboBoxApoiado);
		
		
		comboBoxApoiado.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxCirculo.setBounds(249, 293, 46, 20);
		panel_1.add(comboBoxCirculo);
		
		
		comboBoxCirculo.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		
		JLabel lblAbaixado = new JLabel("Abaixado:");
		lblAbaixado.setFont(new Font("Arial", Font.BOLD, 15));
		lblAbaixado.setBounds(136, 230, 76, 20);
		panel_1.add(lblAbaixado);
		
		JLabel lblApoiado = new JLabel("Apoiado:");
		lblApoiado.setFont(new Font("Arial", Font.BOLD, 15));
		lblApoiado.setBounds(142, 264, 70, 14);
		panel_1.add(lblApoiado);
		
		JLabel lblCirculo = new JLabel("Circulo:");
		lblCirculo.setFont(new Font("Arial", Font.BOLD, 15));
		lblCirculo.setBounds(145, 295, 57, 14);
		panel_1.add(lblCirculo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(0, 183, 339, 30);
		panel_1.add(panel_3);
		
		JLabel lblM02 = new JLabel("M02 - GUINDASTE");
		lblM02.setForeground(Color.WHITE);
		lblM02.setFont(new Font("Arial", Font.BOLD, 14));
		lblM02.setBounds(10, 8, 136, 14);
		panel_3.add(lblM02);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Missao 2 - Guindaste (FLL).JPG")));
		label_2.setBounds(10, 216, 93, 117);
		panel_1.add(label_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(135, 206, 235));
		panel_4.setBounds(0, 336, 339, 30);
		panel_1.add(panel_4);
		
		JLabel lblM03 = new JLabel("M03 - DRONE DE INSPE\u00C7\u00C3O");
		lblM03.setForeground(Color.WHITE);
		lblM03.setFont(new Font("Arial", Font.BOLD, 14));
		lblM03.setBounds(10, 2, 212, 25);
		panel_4.add(lblM03);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Missao 3 - Drone de inspe\u00E7\u00E3o (FLL).JPG")));
		label_3.setBounds(10, 368, 83, 101);
		panel_1.add(label_3);
		
		JLabel lblEixo = new JLabel("No eixo A:");
		lblEixo.setFont(new Font("Arial", Font.BOLD, 15));
		lblEixo.setBounds(129, 391, 83, 14);
		panel_1.add(lblEixo);
		comboBoxM03.setBounds(249, 389, 46, 20);
		panel_1.add(comboBoxM03);
		
		
		comboBoxM03.setModel(new DefaultComboBoxModel(new String[] {"", "Sim ", "N\u00E3o"}));
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(135, 206, 235));
		panel_5.setBounds(0, 474, 339, 30);
		panel_1.add(panel_5);
		
		JLabel lblM04 = new JLabel("M04 - DESIGN PARA OS ANIMAIS");
		lblM04.setForeground(new Color(255, 255, 255));
		lblM04.setFont(new Font("Arial", Font.BOLD, 14));
		lblM04.setBounds(10, 9, 218, 14);
		panel_5.add(lblM04);
		
		JLabel lblGalho = new JLabel("No Galho:");
		lblGalho.setFont(new Font("Arial", Font.BOLD, 14));
		lblGalho.setBounds(129, 527, 72, 14);
		panel_1.add(lblGalho);
		comboBoxM04.setBounds(249, 525, 46, 20);
		panel_1.add(comboBoxM04);
		
		
		comboBoxM04.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Missao 4 - Design para os animais.JPG")));
		label_4.setBounds(10, 505, 93, 107);
		panel_1.add(label_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(341, 158, 321, 616);
		contentPane.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(135, 206, 235));
		panel_7.setBounds(0, 0, 339, 30);
		panel_6.add(panel_7);
		
		JLabel lblM05 = new JLabel("M05 - CASA NA \u00C1RVORE");
		lblM05.setForeground(Color.WHITE);
		lblM05.setFont(new Font("Arial", Font.BOLD, 14));
		lblM05.setBounds(10, 8, 164, 14);
		panel_7.add(lblM05);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(135, 206, 235));
		panel_8.setBounds(0, 183, 339, 30);
		panel_6.add(panel_8);
		
		JLabel lblM06 = new JLabel("M06 - ENGARRAFAMENTO");
		lblM06.setForeground(Color.WHITE);
		lblM06.setFont(new Font("Arial", Font.BOLD, 14));
		lblM06.setBounds(10, 8, 187, 14);
		panel_8.add(lblM06);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(new Color(135, 206, 235));
		panel_9.setBounds(0, 336, 339, 30);
		panel_6.add(panel_9);
		
		JLabel lblM07 = new JLabel("M07 - BALAN\u00C7O        //");
		lblM07.setForeground(Color.WHITE);
		lblM07.setFont(new Font("Arial", Font.BOLD, 14));
		lblM07.setBounds(10, 8, 196, 14);
		panel_9.add(lblM07);
		
		JLabel lblM08 = new JLabel("M08 - ELEVADOR");
		lblM08.setBounds(177, 8, 135, 14);
		panel_9.add(lblM08);
		lblM08.setForeground(Color.WHITE);
		lblM08.setFont(new Font("Arial", Font.BOLD, 14));
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBackground(new Color(135, 206, 235));
		panel_10.setBounds(0, 474, 339, 30);
		panel_6.add(panel_10);
		
		JLabel lblM09 = new JLabel("M09 - FATOR DE SEGURAN\u00C7A");
		lblM09.setBounds(10, 8, 231, 14);
		panel_10.add(lblM09);
		lblM09.setForeground(Color.WHITE);
		lblM09.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Missao 5 - Casa na \u00E1rvore.JPG")));
		label_6.setBounds(10, 36, 103, 128);
		panel_6.add(label_6);
		
		JLabel lblGalhoGrande = new JLabel("Grande");
		lblGalhoGrande.setFont(new Font("Arial", Font.BOLD, 15));
		lblGalhoGrande.setBounds(129, 45, 66, 14);
		panel_6.add(lblGalhoGrande);
		
		JLabel lblQTDG = new JLabel("QTD:");
		lblQTDG.setFont(new Font("Arial", Font.BOLD, 14));
		lblQTDG.setBounds(136, 70, 46, 14);
		panel_6.add(lblQTDG);
		
		JLabel lblGalhoPequeno = new JLabel("Pequeno");
		lblGalhoPequeno.setFont(new Font("Arial", Font.BOLD, 15));
		lblGalhoPequeno.setBounds(228, 45, 83, 14);
		panel_6.add(lblGalhoPequeno);
		
		JLabel lblQTDP = new JLabel("QTD:");
		lblQTDP.setFont(new Font("Arial", Font.BOLD, 14));
		lblQTDP.setBounds(238, 70, 46, 14);
		panel_6.add(lblQTDP);
		comboBoxQtdGrande.setBounds(129, 95, 46, 20);
		panel_6.add(comboBoxQtdGrande);
		
		
		comboBoxQtdGrande.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3"}));
		comboBoxQtdPequeno.setBounds(232, 95, 46, 20);
		panel_6.add(comboBoxQtdPequeno);
		
		
		comboBoxQtdPequeno.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3"}));
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Missao 6 - Engarrafamento (FLL).JPG")));
		label_7.setBounds(10, 216, 103, 117);
		panel_6.add(label_7);
		comboBoxM06.setBounds(136, 252, 46, 20);
		panel_6.add(comboBoxM06);
		
		
		comboBoxM06.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Missao 7 - Balan\u00E7o (FLL).JPG")));
		label_8.setBounds(10, 368, 83, 101);
		panel_6.add(label_8);
		comboBoxM07.setBounds(113, 397, 46, 20);
		panel_6.add(comboBoxM07);
		
		
		comboBoxM07.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Missao 8 - Elevador (FLL).JPG")));
		label_9.setBounds(178, 368, 83, 100);
		panel_6.add(label_9);
		comboBoxM08.setBounds(265, 397, 46, 20);
		panel_6.add(comboBoxM08);
		
		
		comboBoxM08.setModel(new DefaultComboBoxModel(new String[] {"", "Equilibrio", "P/Baixo"}));
		
		JLabel label_21 = new JLabel("");
		label_21.setBounds(10, 505, 108, 111);
		panel_6.add(label_21);
		label_21.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Missao 9 - Fator de Seguran\u00E7a (FLL).JPG")));
		
		JLabel lblQTDVigas = new JLabel("QTD Vigas:");
		lblQTDVigas.setBounds(158, 515, 86, 30);
		panel_6.add(lblQTDVigas);
		lblQTDVigas.setFont(new Font("Arial", Font.BOLD, 15));
		
		textFieldVigasM09 = new JTextField();
		textFieldVigasM09.setBounds(158, 551, 103, 30);
		panel_6.add(textFieldVigasM09);
		textFieldVigasM09.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(672, 158, 321, 616);
		contentPane.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBackground(new Color(135, 206, 235));
		panel_12.setBounds(0, 0, 339, 30);
		panel_11.add(panel_12);
		
		JLabel lblM10 = new JLabel("M10 - CONSTRU\u00C7\u00C3O EM A\u00C7O");
		lblM10.setBounds(10, 8, 215, 14);
		panel_12.add(lblM10);
		lblM10.setForeground(Color.WHITE);
		lblM10.setFont(new Font("Arial", Font.BOLD, 14));
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBackground(new Color(135, 206, 235));
		panel_13.setBounds(0, 183, 339, 30);
		panel_11.add(panel_13);
		
		JLabel lblM11 = new JLabel("M11 - ARQUITETURA INOVADORA");
		lblM11.setForeground(Color.WHITE);
		lblM11.setFont(new Font("Arial", Font.BOLD, 14));
		lblM11.setBounds(10, 8, 240, 14);
		panel_13.add(lblM11);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Missao 10 - Constru\u00E7ao em a\u00E7o (FLL).JPG")));
		label_13.setBounds(10, 41, 93, 117);
		panel_11.add(label_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBackground(new Color(135, 206, 235));
		panel_14.setBounds(0, 336, 339, 30);
		panel_11.add(panel_14);
		
		JLabel lblM12 = new JLabel("M12 - PLANEJE E CONSTRUA");
		lblM12.setForeground(Color.WHITE);
		lblM12.setFont(new Font("Arial", Font.BOLD, 14));
		lblM12.setBounds(10, 8, 215, 14);
		panel_14.add(lblM12);
		
		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Missao 12 - Planeje e construa (FLL).JPG")));
		label_17.setBounds(10, 368, 110, 101);
		panel_11.add(label_17);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBackground(new Color(135, 206, 235));
		panel_15.setBounds(0, 474, 339, 30);
		panel_11.add(panel_15);
		
		JLabel lblM13 = new JLabel("M13 - MELHORIAS  // ");
		lblM13.setForeground(Color.WHITE);
		lblM13.setFont(new Font("Arial", Font.BOLD, 14));
		lblM13.setBounds(10, 8, 162, 14);
		panel_15.add(lblM13);
		
		JLabel lblM14 = new JLabel("M14 - PRECIS\u00C3O");
		lblM14.setForeground(Color.WHITE);
		lblM14.setFont(new Font("Arial", Font.BOLD, 14));
		lblM14.setBounds(162, 8, 152, 14);
		panel_15.add(lblM14);
		
		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Missao 13 - Melhorias (FLL).JPG")));
		label_19.setBounds(10, 508, 93, 111);
		panel_11.add(label_19);
		
		JLabel label_26 = new JLabel("");
		label_26.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Missao 11 - Arquitetura Inovadora (FLL).JPG")));
		label_26.setBounds(10, 216, 110, 117);
		panel_11.add(label_26);
		
		JLabel label_27 = new JLabel("");
		label_27.setBounds(10, 368, 83, 101);
		panel_11.add(label_27);
		
		JLabel label_28 = new JLabel("");
		label_28.setBounds(10, 505, 83, 100);
		panel_11.add(label_28);
		comboBoxM10.setBounds(148, 84, 46, 20);
		panel_11.add(comboBoxM10);
		
		
		comboBoxM10.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		
		JLabel lblNiveis = new JLabel("Niveis:");
		lblNiveis.setFont(new Font("Arial", Font.BOLD, 15));
		lblNiveis.setBounds(148, 377, 69, 14);
		panel_11.add(lblNiveis);
		
		textFieldMesmaCor = new JTextField();
		textFieldMesmaCor.setBounds(256, 400, 57, 20);
		panel_11.add(textFieldMesmaCor);
		textFieldMesmaCor.setColumns(10);
		
		JLabel lblMesmaCor = new JLabel("Mesma Cor ");
		lblMesmaCor.setFont(new Font("Arial", Font.BOLD, 14));
		lblMesmaCor.setBounds(130, 406, 96, 14);
		panel_11.add(lblMesmaCor);
		
		JLabel lblCoresDiferentes = new JLabel("Cores Diferentes");
		lblCoresDiferentes.setFont(new Font("Arial", Font.BOLD, 14));
		lblCoresDiferentes.setBounds(130, 437, 127, 14);
		panel_11.add(lblCoresDiferentes);
		
		textFieldCorDiferente = new JTextField();
		textFieldCorDiferente.setBounds(256, 435, 57, 20);
		panel_11.add(textFieldCorDiferente);
		textFieldCorDiferente.setColumns(10);
		comboBoxM11.setBounds(148, 250, 46, 20);
		panel_11.add(comboBoxM11);
		
		
		comboBoxM11.setModel(new DefaultComboBoxModel(new String[] {"", "Total", "Parcial"}));
		
		JLabel lblMelhorias = new JLabel("Melhorias:");
		lblMelhorias.setFont(new Font("Arial", Font.BOLD, 14));
		lblMelhorias.setBounds(110, 519, 80, 14);
		panel_11.add(lblMelhorias);
		
		textFieldMelhorias = new JTextField();
		textFieldMelhorias.setBounds(110, 544, 57, 20);
		panel_11.add(textFieldMelhorias);
		textFieldMelhorias.setColumns(10);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/Imagens/Missao 14 - Precis\u00E3o (FLL).JPG")));
		label_10.setBounds(188, 508, 69, 104);
		panel_11.add(label_10);
		comboBoxM14.setBounds(267, 544, 46, 20);
		panel_11.add(comboBoxM14);
		
		
		comboBoxM14.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6"}));
		btnContabilizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int soma = 0, somaM01P = 0, somaM01B1 = 0, somaM01B2 = 0, somaCBAbaixado = 0, somaCBApoiado = 0, somaCBCirculo = 0, M03 = 0, M04 = 0, GG = 0, GP = 0,
						M06 = 0, M07 = 0, M08 = 0, M09 = 0, M10 = 0, M11 = 0, M12Igual = 0, M12Diferente = 0, M13 = 0, M14 = 0;
				//M01
				if(comboSelecionado(comboBoxM01Ponte) == true) {
					somaM01P = 20;
				}
				if(comboSelecionado(comboBoxM01B1) == true) {
					somaM01B1 = 15;
				}
				if(comboSelecionado(comboBoxM01B2) == true) {
					somaM01B2 = 15;
				}
				//M02
				if(comboSelecionado(comboBoxAbaixado) == true) {
					somaCBAbaixado = 20;
				}
				if(comboSelecionado(comboBoxApoiado) == true) {
					somaCBApoiado = 15;
				}
				if(comboSelecionado(comboBoxCirculo) == true) {
					somaCBCirculo = 15;
				}
				//M03
				if(comboSelecionado(comboBoxM03) == true) {
					M03 = 10;
				}
				//M04
				if(comboSelecionado(comboBoxM04) == true) {
					M04 = 10;
				}
				//M05
				GG = comboSelecionadoInteiro(comboBoxQtdGrande) * 10;
				GP = comboSelecionadoInteiro(comboBoxQtdPequeno) * 15;
				//M06
				if(comboSelecionado(comboBoxM06) == true) {
					M06 = 10;
				}
				//M07
				if(comboSelecionado(comboBoxM07) == true) {
					M07 = 20;
				}
				//M08
				if(comboBoxM08.getSelectedIndex() == 1) {
					M08 = 20;
				}else if(comboBoxM08.getSelectedIndex() == 2) {
					M08 = 15;
				}
				//M09
				int temp1 = Integer.parseInt(textFieldVigasM09.getText());
				M09 =  temp1 * 10;
				//M10
				if(comboSelecionado(comboBoxM10) == true) {
					M10 = 20;
				}
				//M11
				if(comboBoxM11.getSelectedIndex() == 1) {
					M11 = 15;
				}else if(comboBoxM11.getSelectedIndex() == 2) {
					M11 = 10;
				}
				//M12
				int temp2 = Integer.parseInt(textFieldMesmaCor.getText()), temp3 = Integer.parseInt(textFieldCorDiferente.getText());
				M12Igual = temp2 * 10;
				M12Diferente = temp3 * 5;
				//M13
				int temp4 = Integer.parseInt(textFieldMelhorias.getText());
				M13 = temp4 * 10;
				//M14
				if(comboBoxM14.getSelectedIndex() == 1) {
					M14 = 5;
				}else if(comboBoxM14.getSelectedIndex() == 2) {
					M14 = 10;
				}else if(comboBoxM14.getSelectedIndex() == 3) {
					M14 = 20;
				}else if(comboBoxM14.getSelectedIndex() == 4) {
					M14 = 30;
				}else if(comboBoxM14.getSelectedIndex() == 5) {
					M14 = 45;
				}else if(comboBoxM14.getSelectedIndex() == 6) {
					M14 = 60;
				}
				//Total
				soma = somaM01P + somaM01B1 + somaM01B2 + somaCBAbaixado + somaCBApoiado + somaCBCirculo + M03  + M04  + GG  + GP  +
						M06 + M07 + M08 + M09 + M10 + M11 + M12Igual + M12Diferente + M13 + M14;
				JOptionPane.showMessageDialog(null, "Pontuação total: " + soma);
			}
		
		});
	}
}
