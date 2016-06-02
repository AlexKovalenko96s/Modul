package ua.kas.modul;

import java.util.Timer;
import java.util.TimerTask;

import javafx.event.ActionEvent;

public class Controller {

	static Equipment eq = new Equipment();
	static CurrentVersion cv = new CurrentVersion();
	static AddReg ar = new AddReg();
	static DelReg dr = new DelReg();
	static String name;
	static String reg;
	static String key;
	static String s;
	static int int_key;
	static Timer t = new Timer();

	public void click(javafx.scene.input.MouseEvent e) {
		System.out.println("Mouse clicked!");
	}

	public void moving(javafx.scene.input.MouseEvent e) {
		System.out.println(e.getX() + " " + e.getY());
	}

	public void second(ActionEvent e) {
		String addres = "HKEY_CURRENT_USER\\Software\\SPLab3";
		try {
			cv.run();
			Equipment.run(addres);
			s = Equipment.s.substring((Equipment.s.indexOf("REG_SZ    ")) + 10);
			s = s.substring((s.indexOf("    ")) + 4);
			for (int i = 0; i < CurrentVersion.kol-1; i++) {
			
				name = s.substring(0, s.indexOf("    "));
				s = s.substring((s.indexOf(name + "    ")) + 4 + name.length());

				reg = s.substring(0, s.indexOf("    "));
				s = s.substring((s.indexOf(reg + "    ")) + 4 + reg.length());

				
				key = s.substring(0, (s.indexOf("\n")-1));
				s = s.substring((s.indexOf(key + "    ")) + 7+key.length());
								
				try {
					int_key = Integer.parseInt(key);
					int_key++;
					
					String addres_del = "HKEY_CURRENT_USER\\Software\\SPLab3";
					String name_del = name;
					dr.run(addres_del, name_del);
					
					t.schedule(new TimerTask() {

						@Override
						public void run() {
							String addres_regedit = "HKEY_CURRENT_USER\\Software\\SPLab3";
							String name_regedit = name;
							String value_regedit = Integer.toString(int_key);
							ar.run(addres_regedit, name_regedit, value_regedit);
							System.err.println("compleat");
						}
					}, 10);
					
				} catch (Exception ex) {
					System.err.println("не возможно");
				}
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
