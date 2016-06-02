package ua.kas.modul;

public class DelReg {

	public void run(String zn, String zn2){
		String s = "cmd /C " + "reg delete " + zn + " /v " + zn2 + " /f\r\n";
	    try {  Runtime.getRuntime().exec(s); }
	    catch(Exception ex){ex.printStackTrace();}
	}
}
