
public class Main {
	public static void main(String[] args) {
		Arvuuttaja a = new Arvuuttaja();
		Säie s1 = new Säie(1,a);
		Säie s2 = new Säie(2,a);
		Säie s3 = new Säie(3,a);


		s1.start();
		s2.start();
		s3.start();

	}
}
