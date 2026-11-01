import java.awt.*;
import java.awt.event.*;

class EventDemo extends Frame implements ActionListener {

    Button b;

    EventDemo() 
    {
        b = new Button("Click Me");

        b.setBounds(100, 100, 100, 50);
        add(b);

        b.addActionListener(this);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) 
            {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) 
    {
        System.out.println("Button Clicked");
    }

    public static void main(String[] args) 
    {
        new EventDemo();
    }
}