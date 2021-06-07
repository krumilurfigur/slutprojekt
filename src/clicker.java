import java.util.Timer;
import java.util.TimerTask;

public class clicker {
    public static int clicks = 0;


}

class timer {
    Timer timer = new Timer();
    public timer(){
        timer.schedule(new EndTask(), 10000);
    }
}

class EndTask extends TimerTask{
    public void run() {
        System.out.println("Time's up!");
    }
}