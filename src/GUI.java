import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI(){

        JFrame frame = new JFrame();

        JButton button = new JButton("click me");
        JLabel label = new JLabel("number of clicks");



        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("our gui");
        frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new GUI();


    }
}
