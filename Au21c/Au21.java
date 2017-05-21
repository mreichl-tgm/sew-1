/**
 * Au21 MASTER
 * 
 * @mreichl
 * @13.Mai.14
 */
import javax.swing.JOptionPane;
public class Au21 {
    public static void main() {
        String eingabe="";
       do {eingabe=JOptionPane.showInputDialog("Bitte verwenden Sie mindestens einen Groß- und einen Kleinbuchstaben!");
           if (eingabe.length()==0) break;
        } while (eingabe.equals(eingabe.toLowerCase()) ||       // mind. ein Großbuchstaben enthalten
                 eingabe.equals(eingabe.toUpperCase()) ||       // mind. ein Kleinbuchsrabe
                (eingabe.length()<6)                   ||       // mind. sechs Zeichen
                space(eingabe)==true);
    }
    public static boolean space(String s) {
        for (int i=0; i<s.length();i++) {
            if (s.charAt(i)==' ')return true;
        }
        return false;
    }
}
