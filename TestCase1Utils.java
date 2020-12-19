import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase1Utils {

private static Utils object;
	
	@BeforeClass
	public static void setupObject() {
		object = new Utils();
	}
	@Test
	public void testNumarDivizibilLa4() {
		boolean rezultatActual = object.MultipleOfFour(20);
		boolean rezultatAsteptat = true;
		assertEquals(rezultatAsteptat, rezultatActual);
	}
	
	@Test
	public void testNumarNedivizibilLa4() {
		boolean rezultatActual = object.MultipleOfFour(25);
		boolean rezultatAsteptat = false;
		assertEquals(rezultatAsteptat, rezultatActual);
	}
	
	@Test
	public void testNumarPrim() {
		boolean rezultatActual = object.IsPrime(7);
		boolean rezultatAsteptat = true;
		assertEquals(rezultatAsteptat, rezultatActual);
	}
	

}
