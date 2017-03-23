import java.awt.*;
import javax.swing.*;

public class BorderLayoutTest {
    JFrame f;
    BorderLayoutTest(){
        getGUI();
    }
    private void getGUI(){
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b1 = new JButton("Welcome Akkal Bista");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");

        //JButton b5 = new JButton("CENTER");
        //b5.setBounds(5, 5, 50, 50);
        //JButton b6 = new JButton("CENTER1");
        //b6.setBounds(60, 60, 50, 50);

        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);

        JPanel panel = new JPanel();
        //panel.add(b5);
        //panel.add(b6);
        JPanel southPanel = new JPanel();
        JTextField jtf = new JTextField("@copyright 2017");
        JTextField jtf1 = new JTextField("Akkal Bista");
        southPanel.add(jtf);
        southPanel.add(jtf1);

        JPanel card1 = new JPanel(new GridLayout(4, 1));
        JPanel westPanel = new JPanel();
        JButton jtf2 = new JButton("Home\n");
        JButton jtf3 = new JButton("About\n");
        JButton jtf4 = new JButton("Contect\n");
        JButton jtf5 = new JButton("Profile\n");

        westPanel.add(jtf2);
        westPanel.add(jtf3);
        westPanel.add(jtf4);
        westPanel.add(jtf5);

        JLabel userLabel = new JLabel("User Email\n");
    		userLabel.setBounds(10, 10, 80, 25);
    		panel.add(userLabel);
    		JTextField userText = new JTextField(20);
    		userText.setBounds(100, 10, 160, 25);
    		panel.add(userText);
    		JLabel passwordLabel = new JLabel("Password\n");
    		passwordLabel.setBounds(10, 40, 80, 25);
    		panel.add(passwordLabel);
    		JPasswordField passwordText = new JPasswordField(20);
    		passwordText.setBounds(100, 40, 160, 25);
    		panel.add(passwordText);
    		JButton loginButton = new JButton("login");
    		loginButton.setBounds(10, 80, 80, 25);
    		panel.add(loginButton);
    		JButton registerButton = new JButton("register");
    		registerButton.setBounds(180, 80, 80, 25);
    		panel.add(registerButton);

        f.add(panel, BorderLayout.CENTER);
        f.add(southPanel, BorderLayout.SOUTH);
        f.add(westPanel, BorderLayout.WEST);

        f.setSize(300, 300);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
