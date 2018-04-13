//package testing;
//
//import assignments.CalcAPI;
//import junit.framework.TestCase;
//
//public class CalcAPITest extends TestCase {
//	CalcAPI capi = new CalcAPI();
//
//	//runs once per testcase before the testcase execution
//	public void setUp() {
//		
//	}
//	
//	//runs once per testcase after the testcase execution
//	public void tearDown() {
//		
//	}
//	
//	public void testAdd() {
//		assertEquals(4.2, capi.Add(2, 2.2),0);
//		assertEquals(0, capi.Add(0, 0), 0);
//		assertEquals(4, capi.Add(6, -2), 0);
//
//	}
//
//	public void testSubtract() {
//		assertEquals(-0.2, capi.Subtract(2, 2.2),0.001);
//		assertEquals(0, capi.Subtract(0, 0), 0);
//		assertEquals(8, capi.Subtract(6, -2), 0);
//
//	}
//	
//	public void testDivideByZero() {
//		int s = 0;
//		
//		try {
//			capi.Divide(5, 0);
//		}
//		catch(ArithmeticException e){
//			System.out.println("exception caught");
//			s = 1;
//		}
//		finally{
//			if (s==0){
//				fail();
//			}
//		}
//	}
//	
//	
//}
