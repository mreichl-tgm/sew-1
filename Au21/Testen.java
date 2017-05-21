/**
 * Methodisches Testen
 * 
 * @mreichl
 * @27.4.14
 */
import javax.swing.JOptionPane;
public class Testen {
    public static void main() {
        int anzahlLeerzeichen = 0;
        int anzahlZiffern = 0;
        String text = JOptionPane.showInputDialog(null,
                                                  "Bitte geben Sie einen Text ein:");
        
        for(int i = 1; i <= text.length(); i++) {
            switch(text.charAt(i)) {
            case '0' : 
            case '1' :
            case '2' :
            case '3' :
            case '4' :
            case '5' :
            case '6' :
            case '7' :
            case '8' :
            case '9' : anzahlZiffern++;
            case ' ' : anzahlLeerzeichen++;
           }
        }
        System.out.println("Sie haben "+anzahlZiffern+" Ziffern und "+anzahlLeerzeichen+" Leerzeichen verwendet");
    }
}