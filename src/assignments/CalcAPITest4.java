//package assignments;
//
//import org.junit.*;
////import org.testng.annotations.Test;
//
//public class CalcAPITest4 {
//
//	CalcAPI capi = new CalcAPI();
//	
//	@BeforeClass
//	public static void BeforeClassRun() {
//		System.out.println("BeforeClass is run only once before all the testcases are run");
//	}
//	
//	@AfterClass
//	public static void AfterClassRun() {
//		System.out.println("AfterClass is run only once after all the testcases are run");
//	}
//	
//	@Before
//	public void BeforeTest() {
//		System.out.println("Before the test case is run");
//	}
//	
//	@After
//	public void AfterTest() {
//		System.out.println("After the test case is run");
//	}
//	
//	
//	@Test
//	public void testAdd() {
//		assertEquals(4.2, capi.Add(2, 2.2),0);
//		assertEquals(4, capi.Add(6, -2), 0);
//		
//	}
//
//	@Ignore
//	@Test
//	public void testAdd1() {
//		assertEquals(0, capi.Add(0, 0), 0);
//	}
//
//	@Test
//	public void testSubtract() {
//		assertEquals(0, capi.Subtract(0, 0), 0);
//	}
//	
//	@Test(expected=ArithmeticException.class)
//	public void testDivideByZero() {
//		System.out.println("test DIVIDE by ZERO testcases");
//		//assertEquals(capi.Divide(10, 0), 0, 0);
//		assertNotNull(capi.Divide(5, 0));
//	}
//
//
//}
