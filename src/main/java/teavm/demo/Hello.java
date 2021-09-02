package teavm.demo;

import org.teavm.interop.Export;

public class Hello {
	@Export(name = "sayHi")
	public static int sayHi(int number) {
		return number;
	}

	public static void main(String[] args) {
	}
}
