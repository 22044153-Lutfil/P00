import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		// Prepare the testing datas
	}


	@Test
	public void testAdd() {
		int a = 555;
		int b = 111;
			
		Calculate cal = new Calculate();
		int actual = cal.add(a, b); 
			 
		int expected = 666;
		assertEquals (expected, actual);
		}

	
	public void testSubstract () {
		int a = 50;
		int b = 30;
			
		Calculate cal = new Calculate();
		int actual = cal.substract (a, b); 
			 
		int expected = 20;
		assertEquals (expected, actual);
		}
	
	public void testMultiply() {
		int a = 111;
		int b = 9;
			
		
		Calculate cal = new Calculate();
		int actual = cal.add(a, b); 
			 
		int expected = 999;
		assertEquals (expected, actual);
		}

	public void testDivide () {
		int a = 369;
		int b = 3;
			
		Calculate cal = new Calculate();
		int actual = cal. divide (a, b); 
			 
		int expected = 123;
		assertEquals (expected, actual);
		}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
}
