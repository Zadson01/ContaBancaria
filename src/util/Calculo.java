package util;

public class Calculo {
	
	private int conta;
	private String nome;
	private double saldoinicial;
	private double deposito;
	private char reposta;
    
	// Método com dois paramentos 
	public  Calculo(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
		
	}
	// Método para adcionar valor
	public void addconta(double saldo) {
	    this.saldoinicial += saldo;
	    this.conta += saldo;
	}
	// Método para remover saldo
	public void removeSaldo(double saldo) {
		this.saldoinicial -= saldo;
		this.conta -= saldo;
	}
	
	// Get e set sendo inciado
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	
	public double getSaldoinicial() {
		return saldoinicial;
	}
	public void setSaldoinicial(double saldoinicial) {
		this.saldoinicial = saldoinicial;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	public char getReposta() {
		return reposta;
	}
	public void setReposta(char reposta) {
		this.reposta = reposta;
	}
	
	
	
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	
}

