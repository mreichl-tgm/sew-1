
/**
 * Au21a
 * 
 * @author mreichl 
 * @version 13.Mai.14
 */
import javax.swing.JOptionPane;
public class Au21a
{
    public static void main() {
        String eingabe ="";
        
        do {eingabe = JOptionPane.showInputDialog("Bitte geben Sie ein Passwort mit mehr als 6 Zeichen an");
            if(eingabe.length()==0)break;
        }while (eingabe.length()<6);
    }
}
