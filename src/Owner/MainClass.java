package Owner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.Timer;

public class MainClass {

	
  public static void main(String[] args) {
    Timer timer = new Timer(2000, new MyTimerActionListener());

    timer.start();
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
    }
    timer.stop();
  }

}


class MyTimerActionListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
	  Calendar cal = Calendar.getInstance();
	  //if(Calendar.MINUTE)
    System.out.println(cal.get(Calendar.MINUTE));

  }
}









