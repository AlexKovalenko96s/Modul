package ua.kas.modul;

import com.sun.deploy.association.utility.WinRegistryWrapper;

public class CurrentVersion {
	
	static int kol=0;
	
	public void run(){
		String[] keys= WinRegistryWrapper.WinRegGetValues(WinRegistryWrapper.HKEY_CURRENT_USER,"Software\\SPLab3",100);
        for(int i=0; i < keys.length; i++)
            kol++;
	}
}
