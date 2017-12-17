import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;;


public class ReadFile {
	
	private Scanner x;
	private String path;
	
	
	public void openFile() {
		path = JOptionPane.showInputDialog("Podaj sciezke do pliku .txt: ");
		try {
			x = new Scanner(new File(path));
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Nie znaleziono pliku");
		}
	}
	
	public void readFile() {
		while(x.hasNext()) {
			String a = x.next();
			String b = x.next();		
			
			DataAnalysis q = new DataAnalysis(a,b);
			q.changePossible();
			
		}
	}
	
	public void closeFile() {
		x.close();
	}
}
