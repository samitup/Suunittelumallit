import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) {
		BossRaisePower boss = new BossRaisePower();
		HeadRaisePower head = new HeadRaisePower();
		CEORaisePower ceo = new CEORaisePower();
		boss.setSuccessor(head);
		head.setSuccessor(ceo);
		// Press Ctrl+C to end.
		try {
			while (true) {
				System.out.println("Kuinka suuren palkankorotuksen haluat prosentteina?.");
				System.out.print(">");
				double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
				boss.processRequest(new RaiseRequest(d));
			}
		} catch (Exception e) {
			System.exit(1);
		}
	}
}
