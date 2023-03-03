package principal.main.com.br;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class view {

	JFrame caiza = new JFrame();
	JPanel tela = new JPanel();
	JLabel txtTitulo = new JLabel();
	JLabel txtExplicaçoes = new JLabel();
	JTextField email = new JTextField();
	JCheckBox opcoes = new JCheckBox();
	JButton botao = new JButton();
	
	public void exibirMenu() {
		tela.add(txtTitulo);
		tela.add(email);
		tela.add(opcoes);
		tela.add(botao);
		
	}
	public void exibirSenha() {
		
	}
}
