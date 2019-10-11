package gui;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblM01_ponte = new JLabel("Ponte");
		lblM01_ponte.setBounds(10, 29, 61, 14);
		contentPane.add(lblM01_ponte);
		
		JLabel lblM01Bandeira1 = new JLabel("Bandeira 1");
		lblM01Bandeira1.setBounds(50, 29, 69, 14);
		contentPane.add(lblM01Bandeira1);
		
		JLabel lblM01Bandeira2 = new JLabel("Bandeira 2");
		lblM01Bandeira2.setBounds(127, 29, 69, 14);
		contentPane.add(lblM01Bandeira2);
		
		JLabel M01 = new JLabel("M01:");
		M01.setBounds(73, 11, 46, 14);
		contentPane.add(M01);
		
		comboBoxM01Ponte.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxM01Ponte.setBounds(10, 54, 40, 20);
		contentPane.add(comboBoxM01Ponte);
		
		
		comboBoxM01B1.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxM01B1.setBounds(60, 54, 46, 20);
		contentPane.add(comboBoxM01B1);
		
		
		comboBoxM01B2.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxM01B2.setBounds(127, 54, 46, 20);
		contentPane.add(comboBoxM01B2);
		
		JButton btnContabilizar = new JButton("Contabilizar");
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
		btnContabilizar.setBounds(294, 446, 89, 23);
		contentPane.add(btnContabilizar);
		
		JLabel lblM02 = new JLabel("M02:");
		lblM02.setBounds(73, 85, 46, 14);
		contentPane.add(lblM02);
		
		JLabel lblAbaixado = new JLabel("Abaixado");
		lblAbaixado.setBounds(10, 115, 46, 14);
		contentPane.add(lblAbaixado);
		
		JLabel lblApoiado = new JLabel("Apoiado");
		lblApoiado.setBounds(73, 115, 46, 14);
		contentPane.add(lblApoiado);
		
		JLabel lblCirculo = new JLabel("Circulo");
		lblCirculo.setBounds(127, 115, 46, 14);
		contentPane.add(lblCirculo);
		
		
		comboBoxAbaixado.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxAbaixado.setBounds(10, 140, 40, 20);
		contentPane.add(comboBoxAbaixado);
		
		
		comboBoxApoiado.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxApoiado.setBounds(60, 140, 46, 20);
		contentPane.add(comboBoxApoiado);
		
		
		comboBoxCirculo.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxCirculo.setBounds(127, 140, 46, 20);
		contentPane.add(comboBoxCirculo);
		
		JLabel lblM03 = new JLabel("M03:");
		lblM03.setBounds(60, 176, 46, 14);
		contentPane.add(lblM03);
		
		JLabel lblEixo = new JLabel("No eixo A");
		lblEixo.setBounds(10, 190, 46, 14);
		contentPane.add(lblEixo);
		
		
		comboBoxM03.setModel(new DefaultComboBoxModel(new String[] {"", "Sim ", "N\u00E3o"}));
		comboBoxM03.setBounds(73, 187, 46, 20);
		contentPane.add(comboBoxM03);
		
		JLabel lblM04 = new JLabel("M04:");
		lblM04.setBounds(50, 214, 46, 14);
		contentPane.add(lblM04);
		
		JLabel lblGalho = new JLabel("No Galho");
		lblGalho.setBounds(10, 230, 46, 14);
		contentPane.add(lblGalho);
		
		
		comboBoxM04.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxM04.setBounds(73, 227, 46, 20);
		contentPane.add(comboBoxM04);
		
		JLabel lblM05 = new JLabel("M05:");
		lblM05.setBounds(50, 255, 46, 14);
		contentPane.add(lblM05);
		
		JLabel lblGalhoGrande = new JLabel("Grande");
		lblGalhoGrande.setBounds(10, 280, 46, 14);
		contentPane.add(lblGalhoGrande);
		
		JLabel lblGalhoPequeno = new JLabel("Pequeno");
		lblGalhoPequeno.setBounds(73, 280, 46, 14);
		contentPane.add(lblGalhoPequeno);
		
		JLabel lblQTDG = new JLabel("QTD:");
		lblQTDG.setBounds(4, 305, 46, 14);
		contentPane.add(lblQTDG);
		
		JLabel lblQTDP = new JLabel("QTD:");
		lblQTDP.setBounds(73, 305, 46, 14);
		contentPane.add(lblQTDP);
		
		
		comboBoxQtdGrande.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3"}));
		comboBoxQtdGrande.setBounds(4, 330, 46, 20);
		contentPane.add(comboBoxQtdGrande);
		
		
		comboBoxQtdPequeno.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3"}));
		comboBoxQtdPequeno.setBounds(73, 330, 41, 20);
		contentPane.add(comboBoxQtdPequeno);
		
		JLabel lblM06 = new JLabel("M06:");
		lblM06.setBounds(50, 392, 46, 14);
		contentPane.add(lblM06);
		
		
		comboBoxM06.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxM06.setBounds(36, 412, 56, 20);
		contentPane.add(comboBoxM06);
		
		JLabel lblM07 = new JLabel("M07:");
		lblM07.setBounds(260, 11, 46, 14);
		contentPane.add(lblM07);
		
		
		comboBoxM07.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxM07.setBounds(260, 37, 46, 20);
		contentPane.add(comboBoxM07);
		
		JLabel lblM08 = new JLabel("M08:");
		lblM08.setBounds(260, 68, 46, 14);
		contentPane.add(lblM08);
		
		
		comboBoxM08.setModel(new DefaultComboBoxModel(new String[] {"", "Equilibrio", "P/Baixo"}));
		comboBoxM08.setBounds(249, 93, 46, 20);
		contentPane.add(comboBoxM08);
		
		JLabel lblM09 = new JLabel("M09:");
		lblM09.setBounds(260, 143, 46, 14);
		contentPane.add(lblM09);
		
		textFieldVigasM09 = new JTextField();
		textFieldVigasM09.setBounds(235, 173, 86, 20);
		contentPane.add(textFieldVigasM09);
		textFieldVigasM09.setColumns(10);
		
		JLabel lblQTDVigas = new JLabel("QTDVigas");
		lblQTDVigas.setBounds(249, 156, 46, 14);
		contentPane.add(lblQTDVigas);
		
		JLabel lblM10 = new JLabel("M10:");
		lblM10.setBounds(245, 214, 46, 14);
		contentPane.add(lblM10);
		
		
		comboBoxM10.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxM10.setBounds(243, 230, 63, 20);
		contentPane.add(comboBoxM10);
		
		JLabel lblM11 = new JLabel("M11:");
		lblM11.setBounds(245, 280, 46, 14);
		contentPane.add(lblM11);
		
		
		comboBoxM11.setModel(new DefaultComboBoxModel(new String[] {"", "Total", "Parcial"}));
		comboBoxM11.setBounds(243, 305, 63, 20);
		contentPane.add(comboBoxM11);
		
		JLabel lblM12 = new JLabel("M12:");
		lblM12.setBounds(225, 336, 46, 14);
		contentPane.add(lblM12);
		
		JLabel lblMesmaCor = new JLabel("Mesma Cor ");
		lblMesmaCor.setBounds(225, 364, 81, 14);
		contentPane.add(lblMesmaCor);
		
		JLabel lblCoresDiferentes = new JLabel("Cores Diferentes");
		lblCoresDiferentes.setBounds(225, 392, 81, 14);
		contentPane.add(lblCoresDiferentes);
		
		JLabel lblNiveis = new JLabel("Niveis:");
		lblNiveis.setBounds(260, 336, 46, 14);
		contentPane.add(lblNiveis);
		
		textFieldMesmaCor = new JTextField();
		textFieldMesmaCor.setBounds(281, 361, 40, 20);
		contentPane.add(textFieldMesmaCor);
		textFieldMesmaCor.setColumns(10);
		
		textFieldCorDiferente = new JTextField();
		textFieldCorDiferente.setBounds(315, 389, 40, 20);
		contentPane.add(textFieldCorDiferente);
		textFieldCorDiferente.setColumns(10);
		
		JLabel lblM13 = new JLabel("M13:");
		lblM13.setBounds(409, 11, 46, 14);
		contentPane.add(lblM13);
		
		JLabel lblMelhorias = new JLabel("Melhorias:");
		lblMelhorias.setBounds(409, 40, 61, 14);
		contentPane.add(lblMelhorias);
		
		textFieldMelhorias = new JTextField();
		textFieldMelhorias.setBounds(409, 54, 46, 20);
		contentPane.add(textFieldMelhorias);
		textFieldMelhorias.setColumns(10);
		
		JLabel lblM14 = new JLabel("M14:");
		lblM14.setBounds(409, 96, 46, 14);
		contentPane.add(lblM14);
		
		
		comboBoxM14.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6"}));
		comboBoxM14.setBounds(409, 115, 46, 20);
		contentPane.add(comboBoxM14);
		
		JLabel lblTempo = new JLabel("Tempo:");
		lblTempo.setBounds(481, 176, 46, 14);
		contentPane.add(lblTempo);
	}
}
