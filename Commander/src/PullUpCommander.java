
public class PullUpCommander implements Command {
	private Screen screen;

	public PullUpCommander(Screen screen) {
		this.screen = screen;
	}
	

	@Override		//Command
	public void execute() {
		screen.pullUp();
	}

}
