
public class CEORaisePower extends RaisePower{
	private final double ALLOWABLE = 5 * BASE;

	public void processRequest(RaiseRequest request) {
		if (request.getAmount() >= ALLOWABLE) {
			System.out.println("CEO will approve " + request.getAmount() + "% raise!");
		} else {
			super.processRequest(request);
		}
	}
}
