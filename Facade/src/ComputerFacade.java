import ComplexParts.CPU;
import ComplexParts.HardDrive;
import ComplexParts.Memory;

public class ComputerFacade {
	private static final long BOOT_ADDRESS = 0x08000000;
	private static final long BOOT_SECTOR = 0x7C00; // BIOS selects a boot device, then copies the first sector from the device into physical memory at this memory address
	private static final int SECTOR_SIZE = 512;
	private final CPU processor;
	private final Memory ram;
	private final HardDrive hd;

	public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

	public void start() {
		processor.freeze();
		ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
		processor.jump(BOOT_ADDRESS);
		processor.execute();
	}
}
