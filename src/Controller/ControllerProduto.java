package Controller;
import Connection.ConnectionFactory;
import Model.Produto;
import com.mysql.jdbc.Connection;
import java.sql.*;


import javax.swing.JOptionPane;

public class ControllerProduto {

	public void create(Produto p){
		
		Connection con = null;
		try {
			con = (Connection) ConnectionFactory.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement("INSERT INTO produto (nome, qtd, preco) VALUES(?,?,?)");
			stmt.setString(1,p.getNome());
			stmt.setInt(2,p.getQtd_atual());
			stmt.setDouble(3,p.getPreco());
			
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "salvo com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao salvar: " + e);
		}finally{
			ConnectionFactory.closeConnection(con, stmt);
		}
		
	}
	
}
