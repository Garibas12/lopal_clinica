package br.sp.senai.jandira.clinica;

import br.sp.senai.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		Paciente p2 = new Paciente ();
		
	p1.setNome ("Victor Hugo");
	p1.setPeso(68);
	p1.setAltura(1.63);
	
	p2.setNome ("João Vitor");
	p2.setPeso(83);
	p2.setAltura(1.81);
	
	p1.exibirDados();
	p2.exibirDados();

	}

}
