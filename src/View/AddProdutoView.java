package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Controller.ControllerProduto;
import Model.Produto;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddProdutoView extends JFrame {

	private JPanel contentPane;
	private JTextField txtCadastroNome;
	private JTextField txtCadastroValor;
	private JTextField txtQtd;

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
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 58, 200, 50);
		getContentPane().add(lblNewLabel);
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
		lblValor.setBounds(6, 97, 41, 16);
		contentPane.add(lblValor);
		
		JLabel lblQtd = new JLabel("qtd:");
		lblQtd.setBounds(0, 69, 41, 16);
		contentPane.add(lblQtd);
		
		txtCadastroNome = new JTextField();
		txtCadastroNome.setBounds(59, 24, 130, 26);
		contentPane.add(txtCadastroNome);
		txtCadastroNome.setColumns(10);
		
		txtCadastroValor = new JTextField();
		txtCadastroValor.setColumns(10);
		txtCadastroValor.setBounds(59, 92, 130, 26);
		contentPane.add(txtCadastroValor);
		
		JButton btnCadastroProduto = new JButton("Cadastrar Produto");
		btnCadastroProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto p = new Produto();
				ControllerProduto ctr = new ControllerProduto(); 
				p.setNome(txtCadastroNome.getText());
				p.setQtd_atual(Integer.parseInt(txtQtd.getText()));
				p.setPreco(Double.parseDouble(txtCadastroValor.getText()));
				
				ctr.create(p);
			}
		});
		
		txtQtd = new JTextField();
		txtQtd.setBounds(59, 62, 130, 26);
		contentPane.add(txtQtd);
		txtQtd.setColumns(10);
		btnCadastroProduto.setBounds(30, 130, 141, 29);
		contentPane.add(btnCadastroProduto);
	}
}
