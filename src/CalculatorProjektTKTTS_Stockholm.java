import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorProjektTKTTS_Stockholm implements ActionListener {

    Calculation calculation = new Calculation();
    double firstNumber, secondNumber, summa;
    private String operation;
    private JButton buttonZero = new JButton("0"), buttonOne = new JButton("1"), buttonTwo = new JButton("2"),
            buttonThree = new JButton("3"), buttonFour = new JButton("4"), buttonFive = new JButton("5"),
            buttonSix = new JButton("6"), buttonSeven = new JButton("7"), buttonEight = new JButton("8"),
            buttonNine = new JButton("9"), buttonPlus = new JButton("+"), buttonMinus = new JButton("-"),
            buttonMultiplication = new JButton("*"), buttonDivision = new JButton("/"), buttonSumma = new JButton("=");

        CalculatorProjektTKTTS_Stockholm() {


            JTextArea textArea = new JTextArea();

            JPanel panel = new JPanel();
            panel.setVisible(true);
            panel.setBackground(Color.BLACK);
            panel.setLayout(new GridLayout(4,4,5,5));

            JFrame frame = new JFrame();
            frame.setSize(300, 370);
            frame.setVisible(true);
            frame.setTitle("Calculator");
            frame.add(panel);

            buttonOne.setBackground(Color.LIGHT_GRAY);
            buttonTwo.setBackground(Color.LIGHT_GRAY);
            buttonThree.setBackground(Color.LIGHT_GRAY);
            buttonFour.setBackground(Color.LIGHT_GRAY);
            buttonFive.setBackground(Color.LIGHT_GRAY);
            buttonSix.setBackground(Color.LIGHT_GRAY);
            buttonSeven.setBackground(Color.LIGHT_GRAY);
            buttonEight.setBackground(Color.LIGHT_GRAY);
            buttonNine.setBackground(Color.LIGHT_GRAY);
            buttonZero.setBackground(Color.LIGHT_GRAY);
            buttonPlus.setBackground(Color.LIGHT_GRAY);
            buttonMinus.setBackground(Color.LIGHT_GRAY);
            buttonDivision.setBackground(Color.LIGHT_GRAY);
            buttonMultiplication.setBackground(Color.LIGHT_GRAY);
            buttonSumma.setBackground(Color.LIGHT_GRAY);

            panel.add(textArea);
            panel.add(buttonOne);
            panel.add(buttonTwo);
            panel.add(buttonThree);
            panel.add(buttonFour);
            panel.add(buttonFive);
            panel.add(buttonSix);
            panel.add(buttonSeven);
            panel.add(buttonEight);
            panel.add(buttonNine);
            panel.add(buttonZero);
            panel.add(buttonPlus);
            panel.add(buttonMinus);
            panel.add(buttonMultiplication);
            panel.add(buttonDivision);
            panel.add(buttonSumma);


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
                }
            });

            buttonTwo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonTwo.getText();
                    textArea.setText(number);
                }
            });

            buttonThree.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonThree.getText();
                    textArea.setText(number);
                }
            });

            buttonFour.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonFour.getText();
                    textArea.setText(number);
                }
            });

            buttonFive.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonFive.getText();
                    textArea.setText(number);
                }
            });

            buttonSix.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonSix.getText();
                    textArea.setText(number);
                }
            });

            buttonSeven.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonSeven.getText();
                    textArea.setText(number);
                }
            });

            buttonEight.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonEight.getText();
                    textArea.setText(number);
                }
            });

            buttonNine.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonNine.getText();
                    textArea.setText(number);
                }
            });

            buttonPlus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    firstNumber = Double.parseDouble(textArea.getText());
                    textArea.setText("");
                    operation = "+";
                }
            });

            buttonMinus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    firstNumber = Double.parseDouble(textArea.getText());
                    textArea.setText("");
                    operation = "-";
                }
            });

            buttonDivision.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    firstNumber = Double.parseDouble(textArea.getText());
                    textArea.setText("");
                    operation = "/";
                }
            });

            buttonMultiplication.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    firstNumber = Double.parseDouble(textArea.getText());
                    textArea.setText("");
                    operation = "*";}
            });


            buttonSumma.addActionListener(new ActionListener() {
                @Override

                   public void actionPerformed(ActionEvent e) {
                    String answer;

                    secondNumber = Double.parseDouble(textArea.getText());
                    if (operation == "+") {
                        summa = calculation.operatorPlus(firstNumber, secondNumber);
                        answer = String.format("%.2f", summa);
                        textArea.setText(answer);

                    }else if (operation == "-"){
                        summa = calculation.operatorMinus(firstNumber, secondNumber);
                        answer = String.format("%.2f", summa);
                        textArea.setText(answer);

                    }else if (operation == "*"){
                        summa = calculation.operatorMultiplication(firstNumber, secondNumber);
                        answer = String.format("%.2f", summa);
                        textArea.setText(answer);

                    } else if (operation == "/"){
                        summa = calculation.operatorDivision(firstNumber, secondNumber);
                        if (secondNumber == 0) {
                            textArea.setText("Cannot divide by zero");
                        } else {
                            summa = calculation.operatorDivision(firstNumber, secondNumber);
                            answer = String.format("%.2f", summa);
                            textArea.setText(answer);
                    }

                }}
            });
        }

    @Override
        public void actionPerformed(ActionEvent e) {
        }
    }