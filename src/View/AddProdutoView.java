package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddProdutoView extends JFrame {

	private JPanel contentPane;
	private JTextField txtCadastroNome;
	private JTextField txtCadastroValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProdutoView frame = new AddProdutoView();
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
	public AddProdutoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarProduto = new JLabel("Cadastrar Produto");
		lblCadastrarProduto.setBounds(6, 6, 165, 16);
		contentPane.add(lblCadastrarProduto);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(6, 29, 41, 16);
		contentPane.add(lblNome);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(6, 68, 41, 16);
		contentPane.add(lblValor);
		
		txtCadastroNome = new JTextField();
		txtCadastroNome.setBounds(59, 24, 130, 26);
		contentPane.add(txtCadastroNome);
		txtCadastroNome.setColumns(10);
		
		txtCadastroValor = new JTextField();
		txtCadastroValor.setColumns(10);
		txtCadastroValor.setBounds(59, 63, 130, 26);
		contentPane.add(txtCadastroValor);
		
		JButton btnCadastroProduto = new JButton("Cadastrar Produto");
		btnCadastroProduto.setBounds(30, 96, 141, 29);
		contentPane.add(btnCadastroProduto);
	}
}
