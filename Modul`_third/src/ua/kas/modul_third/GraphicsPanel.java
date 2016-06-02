package ua.kas.modul_third;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class GraphicsPanel extends JPanel{

	int x1;
	int x2=10;
	@Override
	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		
		for(int i=0; i<6; i++){
			x1=i*30;
			x2=i*30+10;
			if(i==1){
				x1=30;
			}
			
			g2.setColor(Color.RED);
            g2.setStroke(new BasicStroke(2));
            g2.draw(new Line2D.Float(0, x1, 100, x2));
           
			
			//g2.drawLine(0, x1, 100, x2);
			
		}
	}
}
