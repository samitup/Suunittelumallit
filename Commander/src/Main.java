
public class Main {
	public static void main(String[] args) {
		Screen screen = new Screen();
		Command pullUp = new PullUpCommander(screen);
		Command pullDown = new PullDownCommander(screen);
		WallButton button1 = new WallButton(pullUp);
		WallButton button2 = new WallButton(pullDown);
		button1.push();
		button2.push();

	}
}