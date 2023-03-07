package frontend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class FrontWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gov File Viewer");
        frame.setSize(400, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("xml_file.xml"));
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
    }
}
