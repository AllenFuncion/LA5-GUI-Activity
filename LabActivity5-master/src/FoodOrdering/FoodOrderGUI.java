package FoodOrdering;

import javax.swing.*;
public class FoodOrderGUI extends JFrame{
    private JLabel jlFoods;
    private JCheckBox cbBurger;
    private JCheckBox cbFries;
    private JCheckBox cbSoftDrinks;
    private JCheckBox cbTea;
    private JCheckBox cbSundae;
    private JLabel jl100;
    private JLabel jl80;
    private JLabel jl65;
    private JLabel jl55;
    private JLabel jl50;
    private JLabel jl40;
    private JLabel jlDiscount;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JRadioButton rbNone;
    private JCheckBox cbPizza;
    private JPanel pricePanel;
    private JPanel discountPanel;
    private JPanel btnPanel;
    private JPanel mainPanel;
    private JButton btnOrder;
    public FoodOrderGUI() {
        setContentPane(mainPanel);
        setTitle("Leap Year Checker");
        setSize(450, 470);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        FoodOrderGUI order = new FoodOrderGUI();
    }
}
