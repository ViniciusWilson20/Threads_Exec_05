package controller;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Numeros extends Thread {

	private int numero;
	private JTextField textField;
	JLabel resultado;
	JButton btnBotao;

	public Numeros(JTextField textField, JButton btnButtao) {

		this.textField = textField;
		this.btnBotao = btnButtao;
	}

	public void run() {

		selecionar();
	}

	public void selecionar() {

		Random r = new Random();
		int intervalo = 10;
		int contador = 1;

		while (contador <= 150) {

			btnBotao.setVisible(false);
			numero = r.nextInt(6) + 1;

			textField.setText(Integer.toString(numero));

			try {

				Thread.sleep(intervalo);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			contador++;
		}
		btnBotao.setVisible(true);

	}
}
