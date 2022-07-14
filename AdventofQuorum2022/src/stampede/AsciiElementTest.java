package stampede;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsciiElementTest {

	@Test
	void testToString() {
		
		AsciiElement ell = new AsciiElement();
		char[] arr = {'S','T','a','M','P','E','D','e'};
		ell.setChars(arr);
		System.out.println(ell.toString());
		assertTrue(ell.toString().equals("STaMPEDe"));
	}

}
