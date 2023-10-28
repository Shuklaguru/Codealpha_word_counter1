import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Word Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JTextArea textArea = new JTextArea();
        JLabel wordCountLabel = new JLabel("Word Count: 0");
        JButton countButton = new JButton("Count Words");

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                String[] words = text.split("\\s+");
                int wordCount = words.length;
                wordCountLabel.setText("Word Count: " + wordCount);
            }
        });

        JPanel panel = new JPanel();
        panel.add(textArea);
        panel.add(countButton);
        panel.add(wordCountLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}
