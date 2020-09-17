package ENTIDADES;

import APLICACAO.Pessoa;

public class ADMINISTRADOR extends Pessoa {

	private int ajudaDeCusto;
	
	public ADMINISTRADOR (String nome, String endereco, long telefone, int ajudaDeCusto)
	{
		super(nome, endereco, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public int getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	
}
