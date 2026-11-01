import java.awt.*;
import java.awt.event.*;

class TextDemo {
    public static void main(String[] args) {

        Frame f = new Frame("Text Example");

        Label l = new Label("Name:");
        TextField t = new TextField();

        l.setBounds(50, 50, 100, 30);
        t.setBounds(150, 50, 150, 30);

        f.add(l);
        f.add(t);

        f.setSize(400, 200);
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}