import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorProjektTKTTS_Stockholm implements ActionListener {


        private JFrame frame;
        private JPanel panel;
        private JTextArea textArea;
        private FlowLayout flowLayout;



        private JButton buttonZero;
        private JButton buttonOne;
        private JButton buttonTwo;
        private JButton buttonThree;
        private JButton buttonFour;
        private JButton buttonFive;
        private JButton buttonSix;
        private JButton buttonSeven;
        private JButton buttonEight;
        private JButton buttonNine;
        private JButton buttonPlus;
        private JButton buttonMinus;
        private JButton buttonMultiplication;
        private JButton buttonDivision;
        private JButton buttonSumma;



        double firstNumber;
        double secondNumber;
        private String operation;

        private String answer;
        private String number;
        double summa;





        CalculatorProjektTKTTS_Stockholm(){


            panel = new JPanel();
            frame = new JFrame();
            flowLayout = new FlowLayout();
            textArea = new JTextArea(1,10);




            buttonZero = new JButton("0");
            buttonOne = new JButton("1");
            buttonTwo = new JButton("2");
            buttonThree = new JButton("3");
            buttonFour = new JButton("4");
            buttonFive = new JButton("5");
            buttonSix = new JButton("6");
            buttonSeven = new JButton("7");
            buttonEight = new JButton("8");
            buttonNine = new JButton("9");
            buttonPlus = new JButton("+");
            buttonMinus = new JButton("-");
            buttonMultiplication = new JButton("*");
            buttonDivision = new JButton("/");
            buttonSumma = new JButton("=");


            frame.setSize(800,120);
            frame.setVisible(true);
            frame.add(panel);

            panel.setVisible(true);
            panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

            panel.add(textArea);
            panel.add(buttonZero);
            panel.add(buttonOne);
            panel.add(buttonTwo);
            panel.add(buttonThree);
            panel.add(buttonFour);
            panel.add(buttonFive);
            panel.add(buttonSix);
            panel.add(buttonSeven);
            panel.add(buttonEight);
            panel.add(buttonNine);
            panel.add(buttonPlus);
            panel.add(buttonMinus);
            panel.add(buttonMultiplication);
            panel.add(buttonDivision);
            panel.add(buttonSumma);
            panel.add(textArea);



            buttonZero.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonZero.getText();
                    textArea.setText(number);
                }
            });

            buttonOne.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText()+buttonOne.getText();
                    textArea.setText(number);
                    //System.out.print("1");
                    //textArea.append("1");
                }
            });

            buttonTwo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonTwo.getText();
                    textArea.setText(number);
                    //System.out.print("2");
                    //textArea.append("2");
                }
            });

            buttonThree.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonThree.getText();
                    textArea.setText(number);
                    //System.out.print("3");
                    //textArea.append("3");
                }
            });

            buttonFour.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonFour.getText();
                    textArea.setText(number);
                    //System.out.print("4");
                    //textArea.append("4");
                }
            });

            buttonFive.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonFive.getText();
                    textArea.setText(number);
                    //System.out.print("5");
                    //textArea.append("5");
                }
            });

            buttonSix.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonSix.getText();
                    textArea.setText(number);
                    //System.out.print("6");
                    //textArea.append("6");
                }
            });

            buttonSeven.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonSeven.getText();
                    textArea.setText(number);
                    //System.out.print("7");
                    //textArea.append("7");
                }
            });

            buttonEight.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonEight.getText();
                    textArea.setText(number);
                    //System.out.print("8");
                    //textArea.append("8");
                }
            });

            buttonNine.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonNine.getText();
                    textArea.setText(number);
                    //System.out.print("9");
                    //textArea.append("9");
                }
            });

            buttonPlus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    firstNumber = Double.parseDouble(textArea.getText());
                    textArea.setText("");
                    operation = "+";
                    //System.out.print("+");
                    //textArea.append("+");
                }
            });

            buttonMinus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    firstNumber = Double.parseDouble(textArea.getText());
                    textArea.setText("");
                    operation = "-";
                    //System.out.print("-");
                    //textArea.append("-");
                }
            });

            buttonMultiplication.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    firstNumber = Double.parseDouble(textArea.getText());
                    textArea.setText("");
                    operation = "*";
                    //System.out.print("*");
                    //textArea.append("*");
                }
            });

            buttonDivision.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    firstNumber = Double.parseDouble(textArea.getText());
                    textArea.setText("");
                    operation = "/";
                    //System.out.print("/");
                    //textArea.append("/");
                }
            });

            buttonSumma.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String answer;
                    secondNumber = Double.parseDouble(textArea.getText());
                    if (operation == "+"){
                        summa = firstNumber + secondNumber;
                        answer = String.format("%.2f", summa);
                        textArea.setText(answer);
                    }
                }
            });




        }


        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

