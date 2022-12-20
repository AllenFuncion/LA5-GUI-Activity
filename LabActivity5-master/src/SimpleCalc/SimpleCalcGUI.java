package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField tf1Number;
    private JComboBox cmbSymbol;
    private JButton btnResult;
    private JPanel mainPanel1;
    private JPanel panel1;
    private JLabel jl1Number;
    private JLabel jl2Number;
    private JPanel panel2;
    private JTextField tf2Number;
    private JPanel panel3;
    private JLabel jlResult;
    private JTextField tfResult;
    private JPanel resultPanel;
    public SimpleCalcGUI() {
        setContentPane(mainPanel);
        setTitle("Leap Year Checker");
        setSize(550, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        cmbSymbol.addItem("+");
        cmbSymbol.addItem("-");
        cmbSymbol.addItem("*");
        cmbSymbol.addItem("/");
        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(tf1Number.getText());
                    int n2 = Integer.parseInt(tf2Number.getText());
                    int result = 0;
                    String sym = cmbSymbol.getSelectedItem().toString();
                    if (sym == "+"){
                        result = n1 + n2;
                        tfResult.setText(String.valueOf(result));
                    } else if (sym == "-") {
                        result = n1 - n2;
                        tfResult.setText(String.valueOf(result));
                    } else if (sym == "*") {
                        result = n1 * n2;
                        tfResult.setText(String.valueOf(result));
                    } else {
                        result = n1 / n2;
                        tfResult.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException nfe) {
                    JFrame f = new SimpleCalcGUI();
                    JOptionPane.showMessageDialog(f, "Invalid Input");
                }
            }
        });
    }
    public static void main(String[] args) {
        SimpleCalcGUI calcu = new SimpleCalcGUI();
    }
}
