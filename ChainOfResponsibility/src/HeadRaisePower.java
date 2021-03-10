
public class HeadRaisePower extends RaisePower {
	private final double MIN_ALLOWABLE = 2 * BASE;
	private final double MAX_ALLOWABLE = 5 * BASE;

	public void processRequest(RaiseRequest request) {
		if (request.getAmount() > MIN_ALLOWABLE && request.getAmount() < MAX_ALLOWABLE) {
			System.out.println("Head will approve " + request.getAmount() + "% raise!");
		} else {
			super.processRequest(request);
		}
	}
}
