import static org.junit.Assert.*;

public class CalculatorTest {

	public static void tearDownAfterClass() throws Exception {
		
	}
	public void setUp() throws Exception {
		
	}
	public void tearDown() throws Exception{
		
	}
	
	public void testAdd() {
		int a = 5;
		int b = 5;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		assertEquals (10, actual);
	}
}
