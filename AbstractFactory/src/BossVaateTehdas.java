
public class BossVaateTehdas implements VaateTehdasInterface{

	@Override
	public HattuInterface pueHattu() {
		BossHattu hattu = new BossHattu();
		return hattu;
	}

	@Override
	public PaitaInterface puePaita() {
		BossPaita paita = new BossPaita();
		return paita;		
	}

	@Override
	public HousutInterface pueHousut() {
		BossHousut housut = new BossHousut();
		return housut;		
	}

	@Override
	public KenkäInterface pueKengät() {
		BossKengät kenkä = new BossKengät();
		return kenkä;		
	}

}
