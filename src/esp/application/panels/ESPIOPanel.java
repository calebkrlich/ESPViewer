package esp.application.panels;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import javax.swing.JPanel;

public class ESPIOPanel extends JPanel
{

	public ESPIOPanel()
	{
		
	}
	
	private void drawESPModel(Graphics2D g2d)
	{
		g2d.setStroke(new BasicStroke());
		g2d.setColor(Color.blue);
		g2d.fillRect(100,10, 100,140);
		
		g2d.setColor(Color.DARK_GRAY);
		g2d.fillRect(120, 35, 60, 80);
		
		g2d.setColor(Color.black);
		g2d.fillRect(110, 12, 80, 30);
		
		g2d.setColor(Color.yellow);
		g2d.fillOval(105, 30, 7, 7);
		g2d.fillOval(105, 45, 7, 7);
		g2d.fillOval(105, 60, 7, 7);
		g2d.fillOval(105, 75, 7, 7);
		g2d.fillOval(105, 90, 7, 7);
		g2d.fillOval(105, 105, 7, 7);
		g2d.fillOval(105, 120, 7, 7);
		g2d.fillOval(105, 135, 7, 7);
		
		g2d.fillOval(190, 30, 7, 7);
		g2d.fillOval(190, 45, 7, 7);
		g2d.fillOval(190, 60, 7, 7);
		g2d.fillOval(190, 75, 7, 7);
		g2d.fillOval(190, 90, 7, 7);
		g2d.fillOval(190, 105, 7, 7);
		g2d.fillOval(190, 120, 7, 7);
		g2d.fillOval(190, 135, 7, 7);
		
		
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		drawESPModel(g2d);
	}
}
