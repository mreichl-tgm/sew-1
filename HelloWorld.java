import javax.swing.JOptionPane;
/**
 * Write a description of class HelloWorld here.
 * 
 * @author Michael Martinides
 * @datum 7.5.2013
 * @version 1.0
 */
public class HelloWorld
{
    public HelloWorld(String name)
    {
        System.out.print("Hello ");
        System.out.print(name);
        System.out.print(" in der Konsole");
        System.out.println();
        JOptionPane.showMessageDialog(null, "Hello " + name + " mit JOptionPane");
    }
    
    public static void main(String args[]) {
        HelloWorld hw = new HelloWorld(args[0]);
    }
}
