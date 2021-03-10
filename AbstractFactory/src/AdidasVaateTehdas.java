
public class AdidasVaateTehdas implements VaateTehdasInterface {

	@Override
	public HattuInterface pueHattu() {
		AdidasHattu hattu = new AdidasHattu();
		return hattu;
		}

	@Override
	public PaitaInterface puePaita() {
		AdidasPaita paita = new AdidasPaita();
		return paita;
	}

	@Override
	public HousutInterface pueHousut() {
		AdidasHousut housut = new AdidasHousut();
		return housut;
	}

	@Override
	public KenkäInterface pueKengät() {
		AdidasKengät kenkä = new AdidasKengät();
		return kenkä;
	}

}
