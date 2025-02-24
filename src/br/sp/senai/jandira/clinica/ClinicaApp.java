package br.sp.senai.jandira.clinica;

import java.time.LocalDate;

import br.sp.senai.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		Paciente p2 = new Paciente ();
		
	p1.setNome ("Victor Hugo");
	p1.setPeso(68);
	p1.setAltura(1.63);
	p1.setGenero("M");
	p1.setTelefone("(11)994476842");
	p1.setDataNascimento(LocalDate.of(2001, 5, 12));
	
	p2.setNome ("João Vitor");
	p2.setPeso(83);
	p2.setAltura(1.81);
	p2.setGenero("O");
	p2.setTelefone("192929");
	
	p1.exibirDados();
	p2.exibirDados();
	
	System.out.println(p1.getNome().length());
	System.out.println(p1.getNome().toUpperCase());
	System.out.println(p1.getGenero() );

	}

}
