
public class Main {
	public static void main(String args[]) {
		VaateTehdasInterface tehdas = new AdidasVaateTehdas();
		String hattu = tehdas.pueHattu().getHattu();
		String paita = tehdas.puePaita().getPaita();
		String housut = tehdas.pueHousut().getHousut();
		String kengät = tehdas.pueKengät().getKengät();
		System.out.println(hattu +","+ paita +","+ housut +" ja "+ kengät);
	}

}
