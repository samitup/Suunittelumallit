import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Pokemon poke = new Pokemon();
		int xp = 0;
		Scanner scanner = new Scanner(System.in);
		LevelState max = new CharizadState();
	AbstractPokemon asd = new CharmeleonState();
	CharmanderState qwe = new CharmanderState();
	
	asd.accept(new BonusVisitor(5));
	qwe.accept(new BonusVisitor(6));
	int bonus =asd.getBonus();
	System.out.println("you got bonuspoint: "+bonus);
		poke.printStatus();
		for (int i = 0; i < 6; i++) {
			xp += scanner.nextInt();
			if (xp == 3 || xp == 6) {
				poke.levelUp(xp);
				poke.printStatus();
			}
		}	max.next(poke);
			scanner.close();
	}
}
