package ua.kas.modul_third;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Main{

	static JFrame f = new JFrame();
	static GraphicsPanel graphicsPanel = new GraphicsPanel();

	public static void main(String[] args) {

		f.setTitle("Try!");
		f.setSize(200, 200);
		f.setLocationRelativeTo(null);
		f.setLayout(new GridBagLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		f.add(graphicsPanel, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2), 0, 0));
		

		f.setVisible(true);
	}
}