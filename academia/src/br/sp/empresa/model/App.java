package br.sp.empresa.model;

import java.time.LocalDate;

import br.sp.empresa.Aluno;

public class App {

	public static void main(String[] args) {
		
		Aluno alana = new Aluno();
		
		alana.setNome("Alana");
		alana.setPeso(45);
		alana.setAltura(1.50);
		alana.setdataNascimento(LocalDate.of(2001, 9, 27));
		alana.setSexo("Feminino");
		alana.setNivelAtividade("Moderado");
		alana.setCalcularNcd(14.7*45+496);
		
		
		System.out.println("Nome: " + alana.getNome());
		System.out.println("Idade: " + alana.getidade());
		System.out.println("IMC: " +  alana.getCalcularImc());
		System.out.println("NCD: "+ alana.getCalcularNcd());
		System.out.println("Situa��o:" + alana.getStatusImc());
		
		
		
		Aluno alice  = new Aluno();
		
		alice.setNome("Alice");
		alice.setPeso(60);
		alice.setAltura(1.64);
		alice.setdataNascimento(LocalDate.of(1999, 6, 10));
		alice.setSexo("Feminino");
		alice.setNivelAtividade("Nenhum");
		alice.setCalcularNcd(14.7*60+496);
		System.out.println("---------------------------------------");
		System.out.println("Nome: " + alice.getNome());
		System.out.println("Idade: " + alice.getidade());
		System.out.println("IMC: " +  alice.getCalcularImc());
		System.out.println("NCD: "+ alice.getCalcularNcd());
		System.out.println("Situa�ao: " + alice.getStatusImc());
		
		
		Aluno emanuel  = new Aluno();
		
		emanuel.setNome("Emanuel");
		emanuel.setPeso(80);
		emanuel.setAltura(1.80);
		emanuel.setdataNascimento(LocalDate.of(1969, 11, 18));
		emanuel.setSexo("Masculino");
		emanuel.setNivelAtividade("Intermedi�rio");
		emanuel.setCalcularNcd(11.9*80+879);
		
		System.out.println("---------------------------------------");
		System.out.println("Nome: " + emanuel.getNome());
		System.out.println("Idade: " + emanuel.getidade());
		System.out.println("IMC: " +  emanuel.getCalcularImc());
		System.out.println("NDC:" + emanuel.getCalcularNcd());
		System.out.println("Situa��o:" + emanuel.getStatusImc());
		
		
		
		Aluno erick  = new Aluno();
		
		erick.setNome("Erick");
		erick.setPeso(90);
		erick.setAltura(1.88);
		erick.setdataNascimento(LocalDate.of(1995, 3, 15));
		erick.setSexo("Masculino");
		erick.setNivelAtividade("Avan�ado");
		erick.setCalcularNcd(15.3*90+679);
		
		System.out.println("---------------------------------------");
		System.out.println("Nome: " + erick.getNome());
		System.out.println("Idade: " + erick.getidade());
		System.out.println("IMC: " +  erick.getCalcularImc());
		System.out.println("NDC:" + erick.getCalcularNcd());
		System.out.println("Situa��o:" + erick.getStatusImc());
		
		
	}

}
