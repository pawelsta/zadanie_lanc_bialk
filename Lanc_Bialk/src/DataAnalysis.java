import java.util.Arrays;

import javax.swing.JOptionPane;

public class DataAnalysis {
	private String s1;
	private String s2;
	boolean wynik;
	DataAnalysis (String DA1, String DA2) {
		s1=DA1;
		s2=DA2;
	}
	boolean changePossible() {
		
		char[] s1InCharArray = s1.toCharArray();
		char[] s2InCharArray = s2.toCharArray();
	
		 
		    int[] alphaArray = new int[20];
		    for ( int i = 0; i < s1InCharArray.length; i++ ) {
		         char ch =  s1InCharArray[i];
		         int value = (int) ch;
		         if (value >= 65 && value <= 84){
		         alphaArray[ch-'A']++;
		        }
		    }
		    
		    for (int i = 0; i < alphaArray.length; i++) {
		        if(alphaArray[i]>0){
		          char ch = (char) (i+65);
		        }         
		   }
		    
		    int[] alphaArray2 = new int[20];
		    for ( int i = 0; i < s2InCharArray.length; i++ ) {
		         char ch =  s2InCharArray[i];
		         int value = (int) ch;
		         if (value >= 65 && value <= 84){
		         alphaArray2[ch-'A']++;
		        }
		    }
		    
		    for (int i = 0; i < alphaArray2.length; i++) {
		        if(alphaArray2[i]>0){
		          char ch = (char) (i+65);
		        }         
		   }
		    
		    wynik = Arrays.equals(alphaArray, alphaArray2);  
		    
		    JOptionPane.showMessageDialog(null, "Wynik porównania ³añcuchów: " + "\n" + s1 + "\n" + s2 + "\n" + "Wynosi: " + wynik);
		    return wynik;
	}
}
