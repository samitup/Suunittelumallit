package ComplexParts;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class HardDrive {
	public byte[] read(long lba, int size) {
		System.out.println("HardDrive.read lba: " + lba + ", size: " + size);
		byte[] bytes = new byte[512];
		bytes = ByteBuffer.allocate(Long.SIZE / Byte.SIZE).putLong(lba).array();

		System.out.println("hd.read " + Arrays.toString(bytes));
		return bytes;
	}
}
