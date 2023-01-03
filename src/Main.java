import javax.swing.*;
/*
Main klassen med en
metod för att göra
körningen av programmet
stabilare.
 */
public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new CalculatorProjektTKTTS_Stockholm();



            }
        });

    }
}