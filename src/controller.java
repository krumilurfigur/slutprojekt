import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class controller {
    private clicker = theModel;
    private canvas = theView;

    public controller(clicker theModel, canvas theView) {
        this.theView = theView;
        this.theModel = theModel;
        this.theview.addSpaceListener(new SpaceListener());
    }
}

    private class SpaceListener implements KeyListener{
        @Override
        public void keyPressed(KeyEvent keyEvent) {

        }
    }
