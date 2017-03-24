package co.za.cput;

/**
 *
 */
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorApp extends JFrame implements ActionListener{

    //declare labels and textfields
    private JLabel number1 = new JLabel("Number 1");
    private JTextField numberTxt1 = new JTextField(4);
    private JLabel number2 = new JLabel("Number 2");
    private JTextField numberTxt2 = new JTextField(4);
    private JLabel result = new JLabel("Result");
    private JTextField resultTxt = new JTextField(4);

    //declare the buttons
    private JButton addBtn = new JButton("Add");
    private JButton subtractBtn = new JButton("Subtract");
    private JButton multiplyBtn = new JButton("Multiply");
    private JButton devideBtn = new JButton("Devide");

    private JMenuBar mbar = new JMenuBar();
    private JMenu operation = new JMenu("Operation");
    private JMenu exit = new JMenu("Exit");
    private JMenuItem newItem = new JMenuItem("New Rec");

    public CalculatorApp()
    {
        //call parent class constructor
        super("Calculator");     //will be displayed in title bar

        //layout of the frame
        setLayout(new FlowLayout());

        //adding textfield and label to frame
        add(number1);
        add(numberTxt1);
        add(number2);
        add(numberTxt2);
        add(result);
        add(resultTxt);

        //add buttons to frame
        add(addBtn);
        add(subtractBtn);
        add(multiplyBtn);
        add(devideBtn);

        setJMenuBar(mbar);
        mbar.add(operation);
        mbar.add(exit);
        operation.add(newItem);

        //register components with the Listener
        addBtn.addActionListener(this);
        subtractBtn.addActionListener(this);
        multiplyBtn.addActionListener(this);
        devideBtn.addActionListener(this);
        newItem.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            int a = Integer.parseInt(numberTxt1.getText());
            int b = Integer.parseInt(numberTxt2.getText());


            if(e.getSource() == addBtn)
            {
                resultTxt.setText("" + Addition.addIntegers(a,b));
            }

            if(e.getSource() == subtractBtn)
            {
                resultTxt.setText("" + Subtraction.subtractIntegers(a,b));
            }

            if(e.getSource() == multiplyBtn)
            {
                resultTxt.setText("" + Multiplication.multiplyIntegers(a,b));
            }

            if(e.getSource() == devideBtn)
            {
                resultTxt.setText("" + Devision.divideIntegers(a,b));
            }

        }

        catch(NumberFormatException nfe)
        {
            System.err.printf("\nException: %s\n", nfe);
            System.out.println("must be a number");
            JOptionPane.showMessageDialog(null,"not a num entered");
        }

        catch(ArithmeticException are)
        {
            System.err.printf("\nException: %s\n", are);
            System.out.println("cant be zero");
        }
    }


    public static void main (String[]args)
    {
        CalculatorApp calc1 = new CalculatorApp();
        calc1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc1.setSize(350,130);
        calc1.setVisible(true);
    }

}



