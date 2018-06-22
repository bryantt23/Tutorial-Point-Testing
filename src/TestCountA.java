import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestCountA {

	Methods methods = new Methods();

	@Test
	public void testSquareWithValidResult() {
		System.out.println("Inside square() 1");
		assertEquals(25, methods.square(5));
	}

	@Test
	public void testSquareWithInvalidResult() {
		System.out.println("Inside square() 2");
		assertNotEquals(252, methods.square(5));
	}
	@Test
	public void testCountForValidResult() {
		System.out.println("Inside countA() 1");
		assertEquals(2, methods.countA("alphabet"));				
	}

	@Test
	public void testCountForInvalidResult() {
		System.out.println("Inside countA() 2");
		assertNotEquals(222, methods.countA("alphabet"));				
	}


}