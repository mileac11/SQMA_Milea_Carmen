package teste;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import clase.Utils;

public class TestCase2Utils {


	private static Utils object;
	
	@BeforeClass
	public static void setupObject() {
		object = new Utils();
	}
	@Test
	public void testNumarCompus() {
		boolean rezultatActual = object.IsPrime(7);
		boolean rezultatAsteptat = false;
		assertEquals(rezultatAsteptat, rezultatActual);
		fail("Not yet implemented");
	}
	
	@Test
	public void testPalindrom() {
		boolean rezultatActual = object.IsPalindrome(252);
		boolean rezultatAsteptat = true;
		assertEquals(rezultatAsteptat, rezultatActual);
		fail("Not yet implemented");
	}
	
	@Test
	public void testNePalindrom() {
		boolean rezultatActual = object.IsPalindrome(2252);
		boolean rezultatAsteptat = false;
		assertEquals(rezultatAsteptat, rezultatActual);
		fail("Not yet implemented");
	}

}