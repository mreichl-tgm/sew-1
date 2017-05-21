/*
 * @author: Pierre Rieger
 * @Date = 3.5.2014
 * @Version 1.0
 * @TODO:
 * ---------
 * Complete
 * ---------
 */

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Hangman {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String suchwort = JOptionPane.showInputDialog(null,"geben sie das suchwort an").toLowerCase(); 	//um den vergleich zu machen 
		int versuche = suchwort.length()+4;																// mit dem ist sicher gestellt dass man mindestens 4 mehr versuche hat als man mind. braucht
		String eingabe ="";
		String antwort ="";
		char[] vergleich = suchwort.toCharArray(); 
		char[] ausgabe = new char[suchwort.length()];
		for(int i = 0; i < ausgabe.length;i++){ 														// das hier konstrouiert einen leeren string mit _ so lang wie ausgabe.length
			ausgabe[i] ='_';
		}
		while(true){
			//String ausgabe ="";
			
			if (versuche <= 0 ){
				 antwort = "sie haben es nicht geschaft";
				break;
			}
			if (Arrays.equals(vergleich, ausgabe)){
				antwort = "GEWONNEN";
				break;
			}
			do{
				eingabe = JOptionPane.showInputDialog(null,"geben sie eien buchstaben ein").toLowerCase();// so wie auf  ln 22
			}while(eingabe.length() <= 0);
			
			for(int i = 0; i <  suchwort.length(); i++){
				if(suchwort.charAt(i) == eingabe.charAt(0)){
					ausgabe[i] = eingabe.charAt(0);
				}
			}
			System.out.println("");
			System.out.println(ausgabe);
			versuche--;
		}
		System.out.println(antwort);
			

	}

}