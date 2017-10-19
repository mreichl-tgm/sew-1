
/**
 * Aufgabe AU20a.
 * 
 * @mreichl 
 * @06.05.14
 */
public class Au20a {
    public static void main (String[]args){
        if (args[0].equals("Mo")){
            System.out.println("Montag");
        }else{
            if (args[0].equals("Di")){
            System.out.println("Dienstag");
            }else{
                if (args[0].equals("Mi")){
                    System.out.println("Mittwoch");
                }else{
                    if (args[0].equals("Do")){
                        System.out.println("Donnerstag");
                    }else{
                        if (args[0].equals("Fr")){
                            System.out.println("Freitag");
                        }else{
                            System.out.println("Eingabe unzulässig");
                        }
                    }
                }
            }
        }
    }
}
