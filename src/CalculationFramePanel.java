import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;

public class CalculationFramePanel extends CalculatorProjektTKTTS_Stockholm {

    private JPanel panel = new JPanel();
    private JTextArea textArea = new JTextArea();

    public JPanel setUpPanel() {
        panel.add(textArea); panel.setLayout(new GridLayout(4,4,5,5));panel.setBackground(Color.BLACK);/*panel.add(buttonZero);panel.add(buttonZero);
        panel.add(buttonOne);panel.add(buttonTwo);panel.add(buttonThree);panel.add(buttonFour);panel.add(buttonFive);
        panel.add(buttonSix);panel.add(buttonSeven);panel.add(buttonEight);panel.add(buttonNine);panel.add(buttonPlus);
        panel.add(buttonMinus);panel.add(buttonDivision);panel.add(buttonMultiplication);panel.add(buttonSumma);*/
        return panel;
    }





}

