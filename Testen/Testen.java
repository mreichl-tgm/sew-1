/**
 * Methodisches Testen
 * 
 * @mreichl
 * @27.4.14
 */
import javax.swing.JOptionPane;
public class Testen {
    //Auswählen
    public static void main() {
        JOptionPane.showMessageDialog(null,"Es folgt eine Zähl Aufgabe");
        zählAufgabe();
        JOptionPane.showMessageDialog(null,"Es folgt eine Rechen Aufgabe");
        rechenAufgabe();
    }
    /* 
     */
    public static void zählAufgabe() {
        int anzahlLeerzeichen = 0;
        int anzahlZiffern = 0;
        String text = JOptionPane.showInputDialog(null,
                                                  "Bitte geben Sie einen Text ein:");
        
        for(int i = 0; i < text.length(); i++) {
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
                       break;
            case ' ' : anzahlLeerzeichen++;
           }
        }
        System.out.println("Sie haben "+anzahlZiffern+" Ziffern und "+anzahlLeerzeichen+" Leerzeichen verwendet");
    }
    
    public static void rechenAufgabe() {
        try {
            int ganzeZahl = Integer.parseInt(JOptionPane.showInputDialog(null,"Bitte gib die erste Zahl ein:"))
                          + Integer.parseInt(JOptionPane.showInputDialog(null,"Bitte gib die zweite Zahl ein:"));
            System.out.println("Das Ergebnis ist "+ganzeZahl+"!");
        } catch(NumberFormatException f) {
                System.out.println("Bitte gib eine Zahl ein...");
        } catch(Exception e) {
                System.out.println("Wie bist du hierher gekommen oO");
        }
    }
}