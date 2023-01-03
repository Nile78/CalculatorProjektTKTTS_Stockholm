import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorProjektTKTTS_Stockholm implements ActionListener {
    CalculationBackEndOperators calculationBackEndOperators = new CalculationBackEndOperators();
    private double firstNumber, secondNumber, summa;
    private String operation;
    private final JPanel panel = new JPanel();
    private final JFrame frame = new JFrame();
    private final JTextArea textArea = new JTextArea();
    private final JButton  buttonZero = new JButton("0"), buttonOne = new JButton("1"), buttonTwo = new JButton("2"),
            buttonThree = new JButton("3"), buttonFour = new JButton("4"), buttonFive = new JButton("5"),
            buttonSix = new JButton("6"), buttonSeven = new JButton("7"), buttonEight = new JButton("8"),
            buttonNine = new JButton("9"), buttonPlus = new JButton("+"), buttonMinus = new JButton("-"),
            buttonMultiplication = new JButton("*"), buttonDivision = new JButton("/"), buttonSumma = new JButton("=");

        CalculatorProjektTKTTS_Stockholm() {

            frame.add(setUpPanel());
            frame.setSize(300, 400);
            frame.setVisible(true);
            frame.setTitle("My First Calculator");

            buttonZeroSetUP(); buttonOneSetUp(); buttonTwoSetUp(); buttonThreeSetUp(); buttonFourSetUp();
            buttonFiveSetUp(); buttonSixSetUp(); buttonSevenSetUP(); buttonEightSetUp();buttonNineSetUp();
            buttonPlusSetUp(); buttonMinusSetUp(); buttonDivisionSetUp(); getButtonMultiplicationSetUp();

            buttonSumma.setBackground(Color.LIGHT_GRAY);
            buttonSumma.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String answer;

                    secondNumber = Double.parseDouble(textArea.getText());
                    if (operation == "+") {
                        answer = String.format("%.2f", calculationBackEndOperators.operatorPlus
                                (firstNumber, secondNumber));
                        textArea.setText(answer);
                    }

                    if (operation == "-") {
                        answer = String.format("%.2f", calculationBackEndOperators.operatorMinus
                                (firstNumber, secondNumber));
                        textArea.setText(answer);

                    } else if (operation == "*") {
                        answer = String.format("%.2f", calculationBackEndOperators.operatorMultiplication
                                (firstNumber, secondNumber));
                        textArea.setText(answer);
                    }

                    if (operation == "/") {
                        if (secondNumber == 0) {
                            textArea.setText("Cannot divide by zero");
                        } else {
                            answer = String.format("%.2f", calculationBackEndOperators.operatorDivision
                                    (firstNumber, secondNumber));
                            textArea.setText(answer);
                        }
                    }
                }
            });
        }

    public JPanel setUpPanel() {
        panel.add(textArea); panel.setLayout(new GridLayout(4,4,5,5));panel.setBackground(Color.BLACK);panel.add(buttonZero);panel.add(buttonZero);
        panel.add(buttonOne);panel.add(buttonTwo);panel.add(buttonThree);panel.add(buttonFour);panel.add(buttonFive);
        panel.add(buttonSix);panel.add(buttonSeven);panel.add(buttonEight);panel.add(buttonNine);panel.add(buttonPlus);
        panel.add(buttonMinus);panel.add(buttonDivision);panel.add(buttonMultiplication);panel.add(buttonSumma);
        return panel;
    }

    public JButton buttonZeroSetUP() {
        buttonZero.setBackground(Color.LIGHT_GRAY);
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textArea.getText() + buttonZero.getText();
                textArea.setText(number);
            }
        });
        return buttonZero;
    }
    public JButton buttonOneSetUp () {
        buttonOne.setBackground(Color.LIGHT_GRAY);
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textArea.getText() + buttonOne.getText();
                textArea.setText(number);
            }
        }); return buttonOne;
    }
    public JButton buttonTwoSetUp () {
        buttonTwo.setBackground(Color.LIGHT_GRAY);
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textArea.getText() + buttonTwo.getText();
                textArea.setText(number);
            }
        }); return buttonTwo;
    }
    public JButton buttonThreeSetUp () {
        buttonThree.setBackground(Color.LIGHT_GRAY);
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textArea.getText() + buttonThree.getText();
                textArea.setText(number);
            }
        }); return buttonThree;
    }
    public JButton buttonFourSetUp() {
        buttonFour.setBackground(Color.LIGHT_GRAY);
        buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textArea.getText() + buttonFour.getText();
                textArea.setText(number);
            }
        }); return buttonFour;
    }
    public JButton buttonFiveSetUp() {
        buttonFive.setBackground(Color.LIGHT_GRAY);
        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textArea.getText() + buttonFive.getText();
                textArea.setText(number);
            }
        }); return buttonFive;
   }
    public JButton buttonSixSetUp() {
            buttonSix.setBackground(Color.LIGHT_GRAY);
        buttonSix.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String number = textArea.getText() + buttonSix.getText();
                    textArea.setText(number);
                }
            }); return buttonSix;
    }
    public JButton buttonSevenSetUP () {
        buttonSeven.setBackground(Color.LIGHT_GRAY);
        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textArea.getText() + buttonSeven.getText();
                textArea.setText(number);
            }
        }); return buttonSeven;
    }
    public JButton buttonEightSetUp() {
        buttonEight.setBackground(Color.LIGHT_GRAY);
        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textArea.getText() + buttonEight.getText();
                textArea.setText(number);
            }
        }); return buttonOne;
    }
    public JButton buttonNineSetUp() {
        buttonNine.setBackground(Color.LIGHT_GRAY);
        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textArea.getText() + buttonNine.getText();
                textArea.setText(number);
            }
        }); return buttonNine;
    }
    public JButton buttonPlusSetUp() {
        buttonPlus.setBackground(Color.LIGHT_GRAY);
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textArea.getText());
                textArea.setText("");
                operation = "+";
            }
        }); return buttonPlus;
    }
    public JButton buttonMinusSetUp() {
        buttonMinus.setBackground(Color.LIGHT_GRAY);
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textArea.getText());
                textArea.setText("");
                operation = "-";
            }
        }); return buttonMinus;
    }
    public JButton buttonDivisionSetUp() {
        buttonDivision.setBackground(Color.LIGHT_GRAY);
        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textArea.getText());
                textArea.setText("");
                operation = "/";
            }
        }); return buttonThree;
    }
    public JButton getButtonMultiplicationSetUp() {
        buttonMultiplication.setBackground(Color.LIGHT_GRAY);
        buttonMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber = Double.parseDouble(textArea.getText());
                textArea.setText("");
                operation = "*";
            }
        }); return buttonMultiplication;
    }
    @Override
        public void actionPerformed(ActionEvent e) {
        }
    }