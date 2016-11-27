package flappyBIrd;

import java.awt.Graphics;

import javax.swing.JPanel;

public class render extends JPanel {
	private static final long serialVersionUID =1L;
	
	@Override
	protected void paintComponent(Graphics g)
	{ 
		super.paintComponent(g);
		flappyBird.flappyBird.repaint(g);
		
} 
}