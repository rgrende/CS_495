import javafx.embed.swing.JFXPanel;

import javax.swing.*;


public class gui extends JPanel {
    private JFormattedTextField getName;
    private JTextArea name;
    private JFormattedTextField greeting;
    private JButton yes;
    private JButton no;

    public gui() {
        setTitle("Random Fact Generator");
        setSize(600, 800);
        setVisible(true);

    }

    private void setTitle(String random_fact_generator) {
    }

    public static void main(String[] args){
        gui myFrame = new gui();

    }
        }

