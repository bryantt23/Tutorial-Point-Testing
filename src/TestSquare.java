import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestSquare {

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
}