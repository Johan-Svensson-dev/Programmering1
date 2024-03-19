package grapher;

import java.awt.Color;

import javax.swing.JFrame;

public class GraphMain extends JFrame{

	public static void main(String[] args) {
		GraphMain graph = new GraphMain();
		

	}

	public GraphMain() {
		setVisible (true);
		setSize (1280, 960);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphPanel panel = new GraphPanel();
		setContentPane(panel);
		panel.setBackground(Color.white);
		setContentPane(panel);
		
	}
}
