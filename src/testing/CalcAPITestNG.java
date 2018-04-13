//package testing;
//
//import assignments.CalcAPI;
//import org.testng.annotations.*;
//import static org.testng.Assert.*;
//
//public class CalcAPITestNG {
//
//	CalcAPI capi = new CalcAPI();
//
//	
//    @DataProvider(name = "provider")
//    public Object[][] createData() {
//    	return new Object[][] {
//    			{ 1, "lastname1" },
//    			{ 2, "lastname2" },
//    			{ 3, "Bakhru" },
//    	};
//    }
//     
//
//    @Test(dataProvider = "provider")
//    public void verifyDP(Integer n1, String n2) {
//    	System.out.println("full name is " +n1+" "+n2);
//    }
//
//	//BeforeTest
//    //BeforeClass
//    //BeforeMethod
//    //Test
//    //AfterMethod
//    //AfterClass
//    //AfterTest
//	
//	//@BeforeMethod used as @setup and @AfterMethod used as @teardown
//		@BeforeMethod
//		public void beforeMethod() {
//			System.out.println("Before Method call");
//		}
//	
//		@AfterMethod
//		public void afterMethod() {
//			System.out.println("After Method call");
//		}
//	
//		@BeforeClass
//		public void beforeClass() {
//			System.out.println("BeforeClass is run only once before all the testcases are run");
//		}
//	
//		@AfterClass
//		public void afterClass() {
//		  System.out.println("AfterClass is run only once after all the testcases are run");
//		}
//	  
//	  
//	  @BeforeTest
//	  public void beforeTest() {
//		  System.out.println("Before Test call");
//	  }
//	
//	  @AfterTest
//	  public void afterTest() {
//		  System.out.println("After Test call");
//	  }
//	  
//	  
//	@Test(groups={"sanity","browserCompatibility"})
//	public void testAddPositive() {
//		System.out.println("test ADD positive testcases");
//		assertEquals(capi.Add(2, 2.2), 4.2 ,0);
//		assertEquals(capi.Add(0, 0), 0, 0);
//		assertEquals(capi.Add(3.1, 3.2), 6.3, 0.001);
//	}
//
//	@Test
//	public void testAddNegative() {
//		System.out.println("test ADD negative testcases");
//		assertEquals(capi.Add(6, -2.2), 3.8, 0);
//		assertEquals(capi.Add(-3.1, -3.2), -6.3, 0.001);
//	}
//
//	@Test(enabled=false)
//	public void testAdd1() {
//		assertEquals(capi.Add(6, -2), 4, 0);
//		method();
//	}
//
//	@Test(groups="sanity")
//	public void testSubtract() {
//		System.out.println("test SUBTRACT testcases");
//		assertEquals(capi.Subtract(0, 0), 0, 0);
//		assertEquals(capi.Subtract(-3.1, -3.2), 0.1, 0.001);
//		assertEquals(capi.Subtract(2, 2.2), -0.2, 0.001);
//		assertEquals(capi.Subtract(6, -2), 8, 0);
//	}
//
//	@Test
//	public void testDivide() {
//		System.out.println("test DIVIDE testcases");
//		assertEquals(capi.Divide(10, 5), 2, 0);
//		assertEquals(capi.Divide(6.4, 2), 3.2, 0);
//		assertEquals(capi.Divide(-8, -2), 4, 0);
//		assertEquals(capi.Divide(-8, 1), -8, 0);
//	}
//	
//	@Test(expectedExceptions=ArithmeticException.class)
//	public void testDivideByZero() {
//		System.out.println("test DIVIDE by ZERO testcases");
//		//assertEquals(capi.Divide(10, 0), 0, 0);
//		assertNotNull(capi.Divide(5, 0));
//	}
//	
//	
//	@Test
//	public void testMultiply() {
//		System.out.println("test MULTIPLY testcases");
//		assertEquals(capi.Multiply(-8, -2), 16, 0);
//		assertEquals(capi.Multiply(5, 0), 0, 0);
//		assertEquals(capi.Multiply(4, 2.1), 8.4, 0);
//	}
//	
//	public void method(){
//		System.out.println("Method call from testcase");
//	}
//  
//}
