
public class PullDownCommander implements Command {
	private Screen screen;

	public PullDownCommander(Screen screen) {
		this.screen = screen;
	}

	@Override // Command
	public void execute() {
		screen.pullDown();
	}

}
