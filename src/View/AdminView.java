package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class AdminView extends JFrame {

	private JPanel contentPane;
	private JTextField txtAmount;
	private JTextField txtAddCinquenta;
	private JTextField txtAddCem;
	private JTextField txtAddQuinhentos;
	private JTextField txtAddMil;
	private JTextField textField_4;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminView frame = new AdminView();
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
	public AdminView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddProduto = new JButton("AddProduto");
		btnAddProduto.setBounds(6, 243, 117, 29);
		contentPane.add(btnAddProduto);
		
		txtAmount = new JTextField();
		txtAmount.setText("0");
		txtAmount.setBounds(51, 171, 32, 26);
		contentPane.add(txtAmount);
		txtAmount.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dispensados:");
		lblNewLabel.setBounds(159, 25, 96, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblFaturamento = new JLabel("Faturamento");
		lblFaturamento.setBounds(181, 198, 93, 16);
		contentPane.add(lblFaturamento);
		
		JLabel lblValidade = new JLabel("Validade");
		lblValidade.setBounds(22, 198, 61, 16);
		contentPane.add(lblValidade);
		
		JLabel lblQtd = new JLabel("Qtd");
		lblQtd.setBounds(16, 170, 39, 29);
		contentPane.add(lblQtd);
		
		JLabel label = new JLabel("0.50");
		label.setBounds(413, 129, 32, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("1.00");
		label_1.setBounds(413, 147, 31, 26);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("5.00");
		label_2.setBounds(413, 176, 41, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("10.00");
		label_3.setBounds(413, 198, 41, 16);
		contentPane.add(label_3);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(298, 214, 41, 29);
		contentPane.add(lblTotal);
		
		txtAddCinquenta = new JTextField();
		txtAddCinquenta.setText("0");
		txtAddCinquenta.setColumns(10);
		txtAddCinquenta.setBounds(379, 124, 32, 26);
		contentPane.add(txtAddCinquenta);
		
		txtAddCem = new JTextField();
		txtAddCem.setText("0");
		txtAddCem.setColumns(10);
		txtAddCem.setBounds(379, 147, 32, 26);
		contentPane.add(txtAddCem);
		
		txtAddQuinhentos = new JTextField();
		txtAddQuinhentos.setText("0");
		txtAddQuinhentos.setColumns(10);
		txtAddQuinhentos.setBounds(379, 171, 32, 26);
		contentPane.add(txtAddQuinhentos);
		
		txtAddMil = new JTextField();
		txtAddMil.setText("0");
		txtAddMil.setColumns(10);
		txtAddMil.setBounds(379, 193, 32, 26);
		contentPane.add(txtAddMil);
		
		JButton btnAddcedula = new JButton("AddCedula");
		btnAddcedula.setBounds(337, 243, 117, 29);
		contentPane.add(btnAddcedula);
		
		textField_4 = new JTextField();
		textField_4.setBounds(338, 215, 107, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnRecolherfaturamento = new JButton("RecolherFaturamento");
		btnRecolherfaturamento.setBounds(135, 243, 164, 29);
		contentPane.add(btnRecolherfaturamento);
		
		textField = new JTextField();
		textField.setBounds(159, 215, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JFormattedTextField txtValidade = new JFormattedTextField();
		txtValidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtValidade.setText("/ /");
		txtValidade.setBounds(6, 211, 96, 26);
		contentPane.add(txtValidade);
	}
}
