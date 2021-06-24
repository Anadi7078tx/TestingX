package my.java.gui;

// import static org.junit.Assert.*;

// import org.junit.After;
// import org.junit.AfterClass;
// import org.junit.Before;
// import org.junit.BeforeClass;
// import org.junit.Test;

// public class HelloWorldPageTest {

// 	@BeforeClass
// 	public static void setUpBeforeClass() throws Exception {
// 	}

// 	@AfterClass
// 	public static void tearDownAfterClass() throws Exception {
// 	}

// 	@Before
// 	public void setUp() throws Exception {
// 	}

// 	@After
// 	public void tearDown() throws Exception {
// 	}

// 	@Test
// 	public void testBuild() {
//     	System.out.println("This is the testcase in this class");
//         String str1="This is the testcase in this class";
//         assertEquals("This is the testcase in this class", str1);
// 	}
	
// 	@Test
// 	public void testingHelloWorld() {
// 		System.out.println( "Hello + World");
// 	}
// }



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnit5Sample1Test {

  @BeforeAll
  static void beforeAll() {
    System.out.println("**--- Executed once before all test methods in this class ---**");
  }

  @BeforeEach
  void beforeEach() {
    System.out.println("**--- Executed before each test method in this class ---**");
  }

  @Test
  void testMethod1() {
    System.out.println("**--- Test method1 executed ---**");
  }

  @DisplayName("Test method2 with condition")
  @Test
  void testMethod2() {
    System.out.println("**--- Test method2 executed ---**");
  }

  @Test
  @Disabled("implementation pending")
  void testMethod3() {
	  System.out.println("**--- Test method3 executed ---**");
  }

  @AfterEach
  void afterEach() {
    System.out.println("**--- Executed after each test method in this class ---**");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("**--- Executed once after all test methods in this class ---**");
  }


}
