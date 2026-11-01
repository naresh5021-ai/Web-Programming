import javax.swing.JFrame;
import java.applet.Applet;
import java.awt.Graphics;

public class LifeCycleAppletNew extends JFrame 
{
    public void init() {
        System.out.println("init() called");
    }

    public void start() {
        System.out.println("start() called");
    }

    public void paint(Graphics g) {
        g.drawString("Applet is running", 50, 50);
    }

    public void stop() {
        System.out.println("stop() called");
    }

    public void destroy() {
        System.out.println("destroy method called");
	}
	public static void main(String[] args)
	{
	Hello f= new Hello();
	f.setSize(300,300);
	f.setVisible(true);
	}
}
