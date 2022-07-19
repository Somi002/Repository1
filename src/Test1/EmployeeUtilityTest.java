package Test1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeUtilityTest {

	private static final int expection = 0;
	EmployeeUtility eu;

	// Employee employee;
	@BeforeClass
	public void setUpBeforeClass() {
		eu = new EmployeeUtility();
		// employee = new Employee();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// @Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void test2() throws Exception {
		Assertions.assertThrows(EmployeeException.class, () -> {
			eu.validateData(null);
		});
	}
	@Test
	public void test3() throws Exception {
		Assertions.assertThrows(EmployeeException.class, () -> {
			eu.validateData(new Employee(0,"somi","somu","135637686","bangalore"));
		});
	}
	@Test
	public void test4() throws Exception {
		Assertions.assertThrows(EmployeeException.class, () -> {
			eu.validateData(new Employee(1, null,"somu","135637686","bangalore"));
		});
	}
	@Test
	public void test5() throws Exception {
		Assertions.assertThrows(EmployeeException.class, () -> {
			eu.validateData(new Employee(1,"somi",null,"135637686","bangalore"));
		});
	}
	@Test
	public void test6() throws Exception {
		Assertions.assertThrows(EmployeeException.class, () -> {
			eu.validateData(new Employee(1,"somi","somu",null,"bangalore"));
		});
	}
	@Test
	public void test7() throws Exception {
		Assertions.assertThrows(EmployeeException.class, () -> {
			eu.validateData(new Employee(1,"somi","somu","135637686",null));
		});
	}
	@Test
	public void test8() throws Exception {
		Assertions.assertThrows(EmployeeException.class, () -> {
			eu.IsIdBlank(0);
		});
		Assertions.assertDoesNotThrow( () -> {
			eu.IsIdBlank(2);
		});
	}
	@Test
	public void test9() throws Exception {
		Assertions.assertThrows(EmployeeException.class, () -> {
			eu.checkBlank(null);
		});
		Assertions.assertDoesNotThrow( () -> {
			eu.checkBlank("somi");
		});
	
	}
}
