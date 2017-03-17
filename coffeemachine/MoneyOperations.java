package coffeemachine;

import javax.swing.JOptionPane;

/**
 * This class contains all the operations related to money
 * @author Adri
 * @since 1.0.0
 */
public class MoneyOperations {

    private final float SRP = 0.50f;
    private double credit = 0;
    
    /**
     * Setter method for the 'credit' variable
     * @param credit User credit.
     */
    public void setCredit(double credit) {
        this.credit = credit;
    }
    /**
     * Getter method for the 'credit' variable
     * @return credit 
     */
    public double getCredit() {
        return credit;
    }
    /**
     * Method that checks if the current credit is enough to buy a product.
     * If it's possible the current credit will be decreased in SRP units.
     * @return boolean Returns true if it's possible
     */
    public boolean sell() {
        if (getCredit() >= SRP ) {
            this.credit -= SRP;
            return true;
        } else {
            return false;
        }
    }
    /**
     * Method that assign 0 to the credit variable.
     * It's used when we want to cancel de operation.
     */
    public void creditReturn() {
        credit = 0;
    }
    
    /**
     * Method that displays the money selection menu.
     * It's used when we want to add credit.
     */
    public void moneySelectionMenu() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog("MONEY:\n1. + 0.50€\n2. Exit\n\n#####\nCash: " + getCredit()));
        while (menu != 2) {
            switch (menu) {
                case 1:
                    if (getCredit()>=0 && getCredit()<5){
                        setCredit(getCredit() + 0.50);
                    } else {
                        JOptionPane.showMessageDialog(null, "Maximum credit reached");
                    }
                    break;
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog("MONEY:\n1. + 0.50€\n2. Exit\n\n#####\nCash: " + getCredit()));
        }
    }
}
