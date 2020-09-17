package APLICACAO;

public class Pessoa {

	/* 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, 
	com seus respectivos seletores (getters) e modificadores (setters), 
	e ainda o construtor padrão e pelo menos mais duas opções de construtores 
	conforme sua percepção. Atributos: String nome; String endereço; String telefone; */
	
		private String nome;
		private String endereco;
		private long telefone;
		private int idade;
		private char sexo;
		
		public Pessoa(String nome) {
			super();
			this.nome = nome;
		}

		public Pessoa(String nome, String endereco) 
		{
			super();
			this.nome = nome;
			this.endereco = endereco;
		}

		public Pessoa(String nome, String endereco, long telefone) 
		{
			super();
			this.nome = nome;
			this.endereco = endereco;
			this.telefone=telefone;
		}

		public Pessoa(String nome, String endereco, long telefone, int idade) 
		{
			super();
			this.nome = nome;
			this.endereco = endereco;
			this.telefone = telefone;
			this.idade = idade;
		}

		public Pessoa(String nome, String endereco, long telefone, int idade, char sexo) 
		{
			super();
			this.nome = nome;
			this.endereco = endereco;
			this.telefone = telefone;
			this.idade = idade;
			this.sexo = sexo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public long getTelefone() {
			return telefone;
		}

		public void setTelefone(long telefone) {
			this.telefone = telefone;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}
		
		

	

}
