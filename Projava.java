import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Projava extends JFrame {
    public Projava() {
        setTitle("Frequently Asked Questions");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        addFAQ(mainPanel, "A. What services do you offer?",
            "I offer bot and website development services. I also sell blank numbers for WhatsApp and legal premium apps.");

        addFAQ(mainPanel, "B. Are the numbers you sell safe to use for WhatsApp?",
            "Yes, the numbers I provide are tested and safe to use for WhatsApp account creation or verification.");

        addFAQ(mainPanel, "C. What type of bots do you create?",
            "I create WhatsApp bots, auto-reply systems, and custom bots tailored to personal or business needs.");

        addFAQ(mainPanel, "D. Are the premium apps you sell original and legal?",
            "Yes, all the apps I offer are original, legal, and sold at affordable prices.");

        addFAQ(mainPanel, "E. How can I order your services?",
            "You can contact me via the contact form or directly message me on Instagram.");

        addFAQ(mainPanel, "F. Do you provide revisions or support after purchase?",
            "Yes, I provide support and basic revisions depending on the service purchased.");

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        add(scrollPane);
    }

    private void addFAQ(JPanel panel, String question, String answer) {
        JButton qButton = new JButton(question);
        JTextArea aText = new JTextArea(answer);
        aText.setWrapStyleWord(true);
        aText.setLineWrap(true);
        aText.setEditable(false);
        aText.setVisible(false);
        aText.setBackground(new Color(240, 240, 240));
        aText.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        qButton.addActionListener(e -> {
            aText.setVisible(!aText.isVisible());
            pack();
        });

        panel.add(qButton);
        panel.add(aText);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Projava().setVisible(true);
        });
    }
}