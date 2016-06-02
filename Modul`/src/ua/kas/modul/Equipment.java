package ua.kas.modul;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;

import javax.swing.JOptionPane;

import javafx.collections.ObservableList;

public class Equipment {

	static String izvl;
	static String s;
	
	static void run(String addres) throws Exception {
		Runtime rt = Runtime.getRuntime();
		Process proc = null;

		proc = rt.exec("cmd");

		BufferedReader bfIn = new BufferedReader(new InputStreamReader(proc.getInputStream(), "utf-8"));
		BufferedWriter bfOut = new BufferedWriter(new OutputStreamWriter(proc.getOutputStream(), "utf-8"));

		int i = 0;
		Array[] ii = new Array[]{};
		
		while ((i = bfIn.read()) != 62) {
			System.out.print((char) i);
		}

		System.out.print((char) i);
		bfOut.write("reg query " + addres);
		bfOut.newLine();
		bfOut.flush();

		while ((i = bfIn.read()) != 62){
			s+=(char) i;
//			if((char)i == (char)ii){
//				JOptionPane.showMessageDialog(null, Integer.toString((char)i));
//			}
		}
//		System.out.print(s);
	}
}
