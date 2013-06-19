/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filabanco;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Cauê
 */
public class Gerador {

    Timer timer;
 
    
    public void Gerador(int tempo) {
        timer = new Timer();
        timer.schedule(new RemindTask(), tempo*1000);
    }

    class RemindTask extends TimerTask {
        @Override
        public void run() {
            timer.cancel(); //Terminate the timer thread
        }
    }

    

}
