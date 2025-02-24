package br.sp.senai.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {

	private String nome;
	private double peso;
	private double altura;
	private String genero;
	private String telefone;
	private LocalDate dataNascimento;

	public void setNome(String nome) {
		if (nome.length() > 3) {
			// verdade
			this.nome = nome;
		} else {
			// falso
			System.out.println("O nome deve ser maior que 3 caracteres");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setPeso(double peso) {

		if (peso > 0) {
			// verdade
			this.peso = peso;
		} else {
			// falso
			System.out.println("O peso deve ser maior do que ZERO!");
		}

	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {

		if (altura > 0.5) {
			// verdade
			this.altura = altura;
		} else {
			// falso
			System.out.println("A altura deve ser maior do que 0,5m");
		}

	}

	public void setGenero(String genero) {
		if (genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("o")) {
			// verdade
			this.genero = genero.toUpperCase();
			System.out.println("Digite  (M) para Masculino, (F) para Feminino ou para (O) Outros");
		} else {
			// falso
			System.out.println("O genero do(a) " + nome + " deve ser (M) Masculino, (F) Feminino ou (O) Outros");
		}

	}

	public String getGenero() {

		return genero;

	}

	public void setTelefone (String telefone) {
    	if (telefone.length() >= 13 ) {
    		this.telefone = telefone;
    	} else {
    		System.out.println("O valor " + telefone + "não é um telefone!");
    	}
    	 
    }

	public String getTelefone() {

		return telefone;

	}
	
	public void setDataNascimento (LolcalDate DataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void marcarConsulta() {

	}

	public void calcularIdade() {

	}

	public void calcularImc() {

		double imc = peso / altura * altura;

	}

	public void classificarImc() {

	}

	public void exibirDados() {
		String unidadePeso = "Kg.";
		String unidadeAltura = "m";
		System.out.println("----------------------------");
		System.out.println("dados do paciente".toUpperCase());
		System.out.println("----------------------------");
		System.out.println("nome:".toUpperCase() + nome);
		System.out.printf("PESO: %s %s\n", peso, unidadePeso);
		System.out.println("Altura : ".toUpperCase() + altura + unidadeAltura);
		System.out.println("Genero : ".toUpperCase() + genero);
		System.out.println("Telefone : " + telefone);
	}

}