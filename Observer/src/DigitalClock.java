import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer{

	private ClockTimer timer;
	public DigitalClock(ClockTimer ct) {
		timer = ct;
		timer.attach(this);
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
