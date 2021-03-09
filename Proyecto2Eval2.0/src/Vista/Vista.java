package Vista;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista {

	JTextField cajatext = new JTextField(30);
	ArrayList<JButton> btn = new ArrayList();
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();

	public Vista() {

		for (int i = 0; i < 3; i++) {
			panel.add(new JButton());
		}
		panel.add(cajatext);
		frame.setSize(400, 400);

		frame.add(panel);

		frame.setVisible(true);

	}
}
