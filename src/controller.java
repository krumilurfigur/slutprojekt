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
        frame.pack();
        frame.setVisible(true);

    }
    public class SpaceListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent keyEvent) {

        }

        @Override
        public void keyPressed(KeyEvent VK_SPACE) {
            System.out.println("click");
        }

        @Override
        public void keyReleased(KeyEvent keyEvent) {

        }
    }

    public static void main(String[] args) {
        controller c  =new controller( new clicker(),new canvas());
        if SpaceListener
    }

}

