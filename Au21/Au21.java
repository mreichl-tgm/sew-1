/**
 * Au21 MASTER
 * 
 * @mreichl
 * @13.Mai.14
 */
import javax.swing.JOptionPane;
public class Au21 {
    //Mainfunktion
    public static void main() {
        String eingabe="";
        int weiter=0;
        //Prüft Passwort auf Großbuchstaben, Leerzeichen etc.
        do {eingabe=JOptionPane.showInputDialog("Bitte verwenden Sie mindestens einen Groß- und einen Kleinbuchstaben, Leerzeichen sind verboten! Wählen Sie anschließend die Darstellungsart ihres Textes aus.");
               if (eingabe.length()==0) break;
            } while (eingabe.equals(eingabe.toLowerCase()) ||       // mind. ein Großbuchstaben enthalten
                    eingabe.equals(eingabe.toUpperCase()) ||       // mind. ein Kleinbuchsrabe
                    (eingabe.length()<6)                   ||       // mind. sechs Zeichen
                    space(eingabe)==true);
        //Widerholt die Beispielauswahl bis Abgebrochen wird
        do {
            beispielAuswahl(eingabe);
            weiter=JOptionPane.showConfirmDialog(null,
                                                 "Weitermachen?",
                                                 "Frage",
                                                 JOptionPane.YES_NO_OPTION);
            System.out.println("");
            if (weiter == 1) break;
        }while (true);
    }
    //Funktion zur Auswahl des Beispiels
    public static void beispielAuswahl(String s) {
        Object[] antworten={"d", "e", "f", "g", "h"};
        int auswahl = JOptionPane.showOptionDialog (null,
                                              "Wählen Sie eine Au21:",
                                              "Au21",
                                              JOptionPane.DEFAULT_OPTION,
                                              JOptionPane.QUESTION_MESSAGE,
                                              null,
                                              antworten, antworten[0]);
        switch (auswahl) { 
                 case 0: längeAnzeigen(s.length());
                 break;
                 case 1: nurGroßbuchstaben(s.toUpperCase());
                 break;
                 case 2: textVertikal(s);
                 break;
                 case 3: mitAbstand(s);
                 break;
                 case 4: textUmdrehen(s);
                 break;
                 default : System.out.println("Programmierfehler");
        }
    }
    //Boolean zum erkennen eines Leerzeichens
    public static boolean space(String s) {
        for (int i=0; i<s.length();i++) {
            if (s.charAt(i)==' ')return true;
        }
        return false;
    }
    //Funktion zur Ausgabe der Textlänge
    public static void längeAnzeigen(int i) {
        System.out.println("Dein Passwort hat "+i+" Zeichen!");
    }
    //Funktion zur Ausgabe des Textes in Großbuchstaben
    public static void nurGroßbuchstaben(String s) {
        System.out.println(""+s+"");
    }
    //Funktion zum Anzeigen des Vertikalen Textes
    public static void textVertikal(String s) {
        int anzahl=0; 
        for (int i=1; i<=s.length();i++) {
            System.out.println(""+s.charAt(anzahl)+"");
            anzahl++;
        }
    }
    //Funktion zum hinzufügen von Abständen 
    public static void mitAbstand(String s) {
        int anzahl=0; 
        for (int i=1; i<=s.length();i++) {
            System.out.print(" "+s.charAt(anzahl)+"");
            anzahl++;
        }
    }
    //Zum umdrehen des Textes
    public static void textUmdrehen(String s) {
        //int anzahl=s.length()-1; 
        //for (int i=0; i<s.length();i++) {
            //System.out.print(""+s.charAt(anzahl)+"");
            //anzahl--;
        //}
        for (int i=s.length()-1; i>=0 ;i--) {
            //System.out.print(""+s.charAt(anzahl)+"");
            System.out.print(""+s.charAt(i)+"");
        }
    }
}