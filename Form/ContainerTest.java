import java.awt.*;
import javax.swing.*;

public class ContainerTest extends JFrame {
  ContainerTest(){
    getGUI();
  }
  private void getGUI() {
    setTitle("Container Example");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel();
    panel.setSize(200,200);

    JLabel lbl = new JLabel();
    lbl.setText("This is a label.");
    lbl.setBounds(0, 0, 100, 30);

    JTextField jtf = new JTextField(20);
    jtf.setBounds(0, 10, 100, 50);

   JButton jbn = new JButton("Submit");
   jbn.setBounds(20, 20, 10, 50);


    panel.add(lbl);
    panel.add(jtf);
    panel.add(jbn);

    add(panel);
    setSize(400,400);
    setVisible(true);
  }

  public static void main(String[] args) {
   ContainerTest ct = new ContainerTest();
  }
}
