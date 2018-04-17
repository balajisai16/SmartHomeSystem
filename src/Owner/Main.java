package Owner;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class MyTimerTask extends TimerTask {	
	public void run() {
		System.out.println("Timer task executed.");
	}
}

public class Main {
	public static void main(String[] args) {
		// creating timer task, timer
		TimerTask tasknew = new MyTimerTask();
		Timer timer = new Timer();
		Date date = new Date();
		date.setMinutes(37);
		// scheduling the task
		timer.schedule(tasknew, date);
	}

	// this method performs the task
	public void run() {
		System.out.println("working on");
	}
}
