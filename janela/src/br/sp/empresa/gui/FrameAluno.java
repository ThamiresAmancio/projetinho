package br.sp.empresa.gui;

import javax.swing.JFrame;

import br.sp.empresa.model.App;

public class FrameAluno {
		public void criarTela() {
			JFrame telaAluno = new JFrame();
			telaAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			telaAluno.setSize(500, 450);
			telaAluno.setTitle("Calculando o IMC e NCD");
			telaAluno.setLayout(null);
			telaAluno.setVisible(true);
			
		}
}
