package br.sp.empresa.gui;



import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.sp.empresa.Aluno;


public class FrameAluno {
	
	public void criarTela() {
		
		JFrame telaAluno = new JFrame();
		
		telaAluno.setSize(350, 500);
		telaAluno.setTitle("Calculando o IMC e NCD");
		telaAluno.setLayout(null);
		
		// Label Nome 
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome: ");
		labelNome.setBounds(10, 20, 50, 30);
		
		// TExtField nome
		
		JTextField textNome = new JTextField();
		textNome.setBounds(60, 20, 185, 30);
		
		//  Data de Nascimento
		
		JLabel labelDataNascimento = new JLabel();
		labelDataNascimento.setText("Data de Nascimento: ");
		labelDataNascimento.setBounds(10, 75, 120, 30);
		
		JTextField textNascimento = new JTextField();
		textNascimento.setBounds(135, 75, 90, 30);
		textNascimento.setText("___/___/______");
		
		//Sexo
		
		JLabel labelSexo = new JLabel();
		labelSexo.setText("Sexo: ");
		labelSexo.setBounds(10, 120, 80, 30);
		
		
		JRadioButton radioSexo1 = new JRadioButton("Masculino");
		radioSexo1.setBounds(60, 120, 90, 30);
		JRadioButton radioSexo2 = new JRadioButton("Feminino");
		radioSexo2.setBounds(150, 120, 80, 30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(radioSexo1);bg.add(radioSexo2);
		
		//Peso
		
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso: ");
		labelPeso.setBounds(10 ,160 , 90, 30);
		
		JTextField textPeso = new JTextField();
		textPeso.setBounds(60, 160, 90, 30);
		
		
		//Altura
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura: ");
		labelAltura.setBounds(10, 200, 90, 30);
		
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds(60, 200, 90, 30);
		
		// Atividade Fisica
		
		JLabel labelFisica = new JLabel();
		labelFisica.setText("Atividade F�sica: ");
		labelFisica.setBounds(10, 245, 120, 30);
		
		
		
		telaAluno.getContentPane().add(labelFisica);
		telaAluno.getContentPane().add(textAltura);
		telaAluno.getContentPane().add(labelAltura);
		telaAluno.getContentPane().add(textPeso);
		telaAluno.getContentPane().add(labelPeso);
		telaAluno.getContentPane().add(radioSexo2);
		telaAluno.getContentPane().add(radioSexo1);
		telaAluno.getContentPane().add(labelSexo);
		telaAluno.getContentPane().add(textNascimento);
		telaAluno.getContentPane().add(labelDataNascimento);
		telaAluno.getContentPane().add(textNome);
		telaAluno.getContentPane().add(labelNome);
		telaAluno.setVisible(true);
		
	}
}
