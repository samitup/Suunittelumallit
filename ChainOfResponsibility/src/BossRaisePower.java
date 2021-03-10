
public class BossRaisePower extends RaisePower {
	private final double ALLOWABLE = 2 * BASE;

	public void processRequest(RaiseRequest request) {
		if (request.getAmount() <= ALLOWABLE) {
			System.out.println("Boss will approve " + request.getAmount()+"% raise!");
		} else {
			super.processRequest(request);
		}
	}
}
