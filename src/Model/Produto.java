package Model;

import java.util.Date;
 

public class Produto {
	private String nome;
	private int cod;
	private int qtd_atual;
	private Date validade;
	private double preco;
	private int qtd_vendida;
	private boolean bloqueado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getQtd_atual() {
		return qtd_atual;
	}
	public void setQtd_atual(int qtd) {
		this.qtd_atual = qtd;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtd_vendida() {
		return qtd_vendida;
	}
	public void setQtd_vendida(int qtd_vendida) {
		this.qtd_vendida = qtd_vendida;
	}
	public boolean isBloqueado() {
		return bloqueado;
	}
	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
	
}
