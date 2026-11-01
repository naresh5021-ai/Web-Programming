import java.awt.*;
import java.awt.event.*;

class MenuDemo extends Frame {

    MenuDemo() {

        MenuBar mb = new MenuBar();

        Menu file = new Menu("File");

        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");

        file.add(open);
        file.add(save);
        file.add(exit);

        mb.add(file);

        setMenuBar(mb);

        setSize(400, 300);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}