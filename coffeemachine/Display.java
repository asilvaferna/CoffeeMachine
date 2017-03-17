package coffeemachine;

import javax.swing.JOptionPane;

/**
 * This class is a virtual display using JOptionPane
 * @author Adri
 * @since 1.0.0
 */
public class Display {
    
    /**
     * Method that displays the change to be returned.
     * @param change Change that the machine returns to the user.
     * @since 1.0.0
     */
    public static void returnMessage(Double change){
        JOptionPane.showMessageDialog(null, "Your change is: " + change);
    }
    /**
     * Method that displays greetings.
     * @since 1.0.0
     */
    public static void exitMessage(){
        JOptionPane.showMessageDialog(null, "Thank you!");
    }
    /**
     * Method that displays the name of the product that the user selected.
     * @param nameProduct String of the product's name.
     * @since 1.0.0
     */
    
    public static void processMessage(String nameProduct){
        JOptionPane.showMessageDialog(null, "Making a " + nameProduct + "\n\n\nYour product has been made");
    }
    /**
     * Method that displays a String text when the user don't have
     * enough credit to buy a product.
     * @since 1.0.0
     */
    public static void noMoneyMessage(){
        JOptionPane.showMessageDialog(null, "You got no cash");
    }
}
