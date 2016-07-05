package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JRadioButton;

public class UserView extends JFrame {

	private JPanel contentPane;
	private JTextField txtTroco;
	private JTextField txtBdjItem;
	private JTextField txtDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserView frame = new UserView();
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
	public UserView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCinquenta = new JButton("0.50");
		btnCinquenta.setBounds(6, 79, 80, 25);
		contentPane.add(btnCinquenta);
		
		JButton btnCem = new JButton("1.00");
		btnCem.setBounds(6, 100, 80, 25);
		contentPane.add(btnCem);
		
		JButton btnQuinhentos = new JButton("5.00");
		btnQuinhentos.setBounds(6, 123, 80, 25);
		contentPane.add(btnQuinhentos);
		
		JButton btnMil = new JButton("10.00");
		btnMil.setBounds(6, 147, 80, 25);
		contentPane.add(btnMil);
		
		JLabel lblInserir = new JLabel("Inserir");
		lblInserir.setBounds(6, 58, 66, 30);
		contentPane.add(lblInserir);
		
		JLabel lblTroco = new JLabel("Troco");
		lblTroco.setBounds(6, 238, 49, 42);
		contentPane.add(lblTroco);
		
		txtTroco = new JTextField();
		txtTroco.setText("0");
		txtTroco.setBounds(55, 246, 80, 26);
		contentPane.add(txtTroco);
		txtTroco.setColumns(10);
		
		txtBdjItem = new JTextField();
		txtBdjItem.setBounds(314, 246, 130, 26);
		contentPane.add(txtBdjItem);
		txtBdjItem.setColumns(10);
		
		JLabel lblBandejaItem = new JLabel("Bandeja Item");
		lblBandejaItem.setBounds(227, 245, 117, 29);
		contentPane.add(lblBandejaItem);
		
		JLabel lblDisplay = new JLabel("Display");
		lblDisplay.setBounds(91, 52, 57, 38);
		contentPane.add(lblDisplay);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(84, 77, 93, 26);
		contentPane.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JRadioButton rdbtnSuco = new JRadioButton("Suco");
		rdbtnSuco.setBounds(303, 61, 141, 23);
		contentPane.add(rdbtnSuco);
		
		JRadioButton rdbtnBolo = new JRadioButton("Bolo");
		rdbtnBolo.setBounds(303, 79, 141, 23);
		contentPane.add(rdbtnBolo);
		
		JRadioButton rdbtnRefri = new JRadioButton("Refri");
		rdbtnRefri.setBounds(303, 99, 141, 23);
		contentPane.add(rdbtnRefri);
		
		JRadioButton rdbtnSanduiche = new JRadioButton("Sanduiche");
		rdbtnSanduiche.setBounds(303, 122, 141, 23);
		contentPane.add(rdbtnSanduiche);
		
		JRadioButton rdbtnChocolate = new JRadioButton("Chocolate");
		rdbtnChocolate.setBounds(303, 146, 141, 23);
		contentPane.add(rdbtnChocolate);
		
		JButton btnEfetuarcompra = new JButton("EfetuarCompra");
		btnEfetuarcompra.setBounds(298, 172, 117, 29);
		contentPane.add(btnEfetuarcompra);
	}
}
