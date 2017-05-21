/**
 * Au24a - Taschenrechner
 * 
 * mreichl
 * 3.6.14
 */
import javax.swing.JOptionPane;
public class Au24a {
    public static void taschenRechner(String[]args) {
       String eingabe= "";
       String operand= "";
       
       while (true) {
           eingabe = JOptionPane.showInputDialog(null,"Bitte geben Sie eine Rechnung nach folgendem Beispiel ein: 1 + 1");
           int pos1 = eingabe.indexOf(' ');
           int pos2 = eingabe.lastIndexOf(' ');
           if(pos1 == pos2) {
                   System.out.println("Ein Leerzeichen fehlt!");
           } else {
               if((pos1 - pos2 > 2)) {
                       System.out.println("Zu viele Leerzeichen oder Rechenoperatoren!");
               } else {
                   try {
                       
                       String z1 = eingabe.substring(0, pos1);
                       String z2 = eingabe.substring(pos2+1);
                           
                       int operand1 = Integer.parseInt(z1);
                       int operand2 = Integer.parseInt(z2);
                       int ergebnis = 0;
                           
                       switch (eingabe.charAt(pos1+1)) {
                       case '+': ergebnis= operand1 + operand2;
                                 System.out.println(""+ergebnis+"");
                                 break;
                       case '-': ergebnis= operand1 - operand2;
                                 System.out.println(""+ergebnis+"");
                                 break;
                       case '*': ergebnis= operand1 * operand2;
                                 System.out.println(""+ergebnis+"");
                                 break;
                       case '/': ergebnis= operand1 / operand2;
                                 System.out.println(""+ergebnis+"");
                                 break;
                       case '%': ergebnis= operand1 % operand2;
                                 System.out.println(""+ergebnis+"");
                                 break;
                       default : System.out.println("Kein uns bekannter Operator!");
                                 break;
                       }
                   } catch(NumberFormatException n) {
                       System.out.println("Nicht Numerisch!");
                   } catch(Exception e) {
                       System.out.println("Eingabe Unzulässig");
                   }
               }
           }
       }
    }
}