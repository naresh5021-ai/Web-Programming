import java.awt.*;

class GraphicsDemo extends Frame {

    public void paint(Graphics g) {

        g.drawLine(50, 50, 200, 50);

        g.drawRect(50, 80, 150, 100);

        g.drawOval(50, 200, 100, 100);

        g.drawString("Hello Java", 200, 200);
    }

    public static void main(String[] args) {

        GraphicsDemo f = new GraphicsDemo();

        f.setSize(400, 400);
        f.setVisible(true);
    }
}
