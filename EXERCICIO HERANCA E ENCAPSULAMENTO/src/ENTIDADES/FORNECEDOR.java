package ENTIDADES;

import APLICACAO.Pessoa;

public class FORNECEDOR extends Pessoa {
	
	/*2. Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) 
	 * a classe Fornecedor. Considere que cada inst�ncia da classe Fornecedor tem, 
	 * para al�m dos atributos que caracterizam a classe Pessoa, os atributos valorCredito
	 * (correspondente ao cr�dito m�ximo atribu�do ao fornecedor) e valorDivida 
	 * (montante da d�vida para com o fornecedor). 
	 * Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores,
	 * um m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos 
	 * valorCredito e valorDivida. Depois de implementada a classe Fornecedor, 
	 * crie um programa de teste adequado que lhe permita verificar o funcionamento 
	 * dos m�todos implementados na classe Fornecedor e os herdados da classe Pessoa. 
	 */

	private int valorCredito;
	private int valorDivida;
	private int obterSaldo;
	
	
	public FORNECEDOR(String nome, String endereco, int valorCredito) 
	{
		super(nome, endereco);
		this.valorCredito = valorCredito;
	}

	
	public FORNECEDOR(String nome, String endereco, long telefone, int valorCredito, int valorDivida) 
	{
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public FORNECEDOR(String nome,  String endereco, long telefone, int valorCredito, int valorDivida, int obterSaldo) 
	{
		super(nome,endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.obterSaldo = obterSaldo;
	}


	public int getValorCredito() {
		return valorCredito;
	}


	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}


	public int getValorDivida() {
		return valorDivida;
	}


	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}


	public int getObterSaldo() {
		return obterSaldo;
	}


	public void setObterSaldo(int obterSaldo) {
		this.obterSaldo = obterSaldo;
	}
	
	public void MostraSaldo ()
	{
		obterSaldo = valorCredito-valorDivida;
		
		System.out.println(obterSaldo);
	}

	
}
