import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class controller {
    private clicker model;
    private canvas view;

    public controller(clicker model, canvas view) {
        this.view = view;
        this.model = model;
        JFrame frame = new JFrame("canvas");
        frame.setContentPane(view.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(new SpaceListener());
        frame.pack();
        frame.setVisible(true);

    }
    public class SpaceListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            if (e.getKeyChar() == ' ') {
                System.out.println("SPACE!");
                clicker.clicks ++;
                System.out.println(clicker.clicks);
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    public static void main(String[] args) {
        controller c  =new controller( new clicker(),new canvas());
        new clicker.start;
    }


}

