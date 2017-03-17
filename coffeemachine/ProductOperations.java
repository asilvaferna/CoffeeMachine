package coffeemachine;

import javax.swing.JOptionPane;

/**
 * This class contains all the operations related to a product
 * @author Adri
 * @since 1.0.0
 */
public class ProductOperations {

    private int sugar = 2;
    private String product;
    private MoneyOperations money;
    
    /**
     * Getter method for the sugar variable.
     * @return sugar
     */
    public int getSugar() {
        return sugar;
    }
    /**
     * Constructor of the ProductOperations class.
     * @param money Variable MoneyOperations type.
     */
    public ProductOperations(MoneyOperations money) {
        this.money = money;
    }
    /**
     * Getter method for the product variable.
     * @return product
     */
    public String getProduct() {
        return product;
    }
    /**
     * Setter method for the sugar variable.
     * @param sugar Sugar variable
     */
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
    /**
     * Method that displays a sugar selection menu
     * It's used when we want to change the value of the sugar
     * in the product, it's called from the productSelection method.
     */
    public void sugarSelection() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog("SUGAR:\n1. + Sugar\n2. - Sugar\n3. Exit\n\n#####\nSugar: " + getSugar()));
        while (menu != 3) {
            switch (menu) {
                case 1:
                    if (getSugar() < 5 && getSugar() > 0) {
                        setSugar(getSugar() + 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "You just reach the maximum level");
                    }
                    break;
                case 2:
                    if (getSugar() < 5 && getSugar() > 0) {
                        setSugar(getSugar() - 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "You just reach the minimum level");
                    }
                    break;
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog("SUGAR:\n1. + Sugar\n2. - Sugar\n3. Exit\n\n#####\nSugar: " + getSugar()));
        }
    }
    /**
     * Method that displays a product selection menu
     * It's used to select the product that the user wants.
     */
    public void productSelection() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog("PRODUCTS:\n1. Cafe\n2. Tea\n3. Hot Chocolate\n 4. Exit\n\n#####\nCash: " + this.money.getCredit() + "\nSugar: " + getSugar()));
        while (menu != 4) {
            switch (menu) {
                case 1:
                    if (this.money.sell()) {
                        sugarSelection();
                        Display.processMessage("Cafe");
                    } else {
                        Display.noMoneyMessage();
                    }
                    break;
                case 2:
                    if (this.money.sell()) {
                        sugarSelection();
                        Display.processMessage("Tea");
                    } else {
                        Display.noMoneyMessage();
                    }
                    break;
                case 3:
                    if (this.money.sell()) {
                        sugarSelection();
                        Display.processMessage("Hot Chocolate");
                    } else {
                        Display.noMoneyMessage();
                    }
                    break;

            }
            menu = Integer.parseInt(JOptionPane.showInputDialog("PRODUCTS:\n1. Cafe\n2. Tea\n3. Hot Chocolate\n 4. Exit\n\n#####\nCash: " + this.money.getCredit() + "\nSugar: " + getSugar()));
        }
    }

}
