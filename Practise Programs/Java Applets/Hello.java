import javax.swing.JFrame;
import java.awt.Graphics;

public class Hello extends JFrame 
{
    public void paint(Graphics g) 
	{
        g.drawString("Applet is running", 50, 50);
    }
	public static void main(String[] args)
	{
	Hello f= new Hello();
	f.setSize(500,500);
	f.setVisible(true);
	}
}

