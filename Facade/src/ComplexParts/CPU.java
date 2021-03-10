package ComplexParts;

public class CPU {
	public void freeze() {
		System.out.println("CPU.freeze printed!");

	}

	public void jump(long position) {
		System.out.println("CPU.jump position: " + position);

	}

	public void execute() {
		System.out.println("CPU.execute printed!");

	}
}
