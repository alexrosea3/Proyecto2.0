package Vista;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Modelo.Modelo;

public class Vista {

	JTextField cajatext = new JTextField(30);
	ArrayList<JButton> botones = new ArrayList();
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	Modelo modelo = new Modelo();

	public Vista() {

		for (int i = 0; i < 3; i++) {
			botones.add(new JButton(modelo.getTxtbtn().get(i)));
			panel.add(botones.get(i));
		}
		panel.add(cajatext);
		frame.setSize(400, 400);

		frame.add(panel);

		frame.setVisible(true);

	}

	public JTextField getCajatext() {
		return cajatext;
	}

	public void setCajatext(JTextField cajatext) {
		this.cajatext = cajatext;
	}

	public ArrayList<JButton> getBotones() {
		return botones;
	}

	public void setBotones(ArrayList<JButton> botones) {
		this.botones = botones;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

}
