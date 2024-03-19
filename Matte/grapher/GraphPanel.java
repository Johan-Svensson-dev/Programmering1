package grapher;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraphPanel extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		
		g.drawLine(20, 20, 20, 500); //y axel
		g.drawLine(20, 500, 1000, 500); //x axel
		
		g.setColor(Color.red);
		//for sats för x axelns värden
		for(int x=20; x<=1000; x++) {
			g.fillOval(x, (500-(x-20)*(x-20)), 5, 5); //parabel
		}
		g.setColor(Color.blue);
		for(int x = 20; x <= 1000; x++) {
		    int y = 500 - (int)(100 * Math.sin((x - 20) * 0.05)); // En enkel sinusvåg
		    g.fillOval(x, y, 8, 8);
		}
	}

}
