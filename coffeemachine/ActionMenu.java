package coffeemachine;

import javax.swing.JOptionPane;

/**
 * <h1>Coffee Machine</h1> 
 * Virtual coffee machine writen in Java
 * This class contains the main menu of the machine
 * @version 1.0.0
 * @author Adri
 * @since 1.0.0
 */
public class ActionMenu {

    /**
     * Main method that displays the main menu of the machine
     * @param args Args for Java.
     * @since 1.0.0
     * @author Adri
     */
    public static void main(String[] args) {

        MoneyOperations cash = new MoneyOperations();
        ProductOperations product = new ProductOperations(cash);
        
        int menu2 = 0;
        int menu = Integer.parseInt(JOptionPane.showInputDialog("VENDING MACHINE:\n1. Insert credit\n2. Cancel operation\n3. Product selection\n\n#####\nCash: " + cash.getCredit()));
        while (menu != 0) {
            switch (menu) {
                case 1:
                    cash.moneySelectionMenu();
                    break;
                case 2:
                    cash.creditReturn();
                    Display.exitMessage();
                    break;
                case 3:
                    product.productSelection();
                    break;
                    
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog("VENDING MACHINE:\n1. Insert credit\n2. Cancel operation\n3. Product selection\n\n#####\nCash: " + cash.getCredit()));
        }

    }

}
