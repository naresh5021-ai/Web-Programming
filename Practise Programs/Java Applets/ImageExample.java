import javax.swing.*;

public class ImageExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image in Swing");
        
        // Load image
        ImageIcon icon = new ImageIcon("image.jpg"); // or give full path C:/...
        
        // Scale image (optional)
        // Image img = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        // icon = new ImageIcon(img);

        JLabel label = new JLabel(icon);
        frame.add(label);

        frame.setSize(1400, 1400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}