package Test1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class EmployeeServiceTest {

	
	EmployeeService es = new EmployeeService();
	@Test
	 public void test() {
		int  value = es.employeesMap.size();
		assertEquals(5,value);
		assertNotEquals(6,value);
	}
	@Test
	public void TestEmployeeName()
	{
		String result = es.getEmployeeName("somi");
		assertEquals("somi",result,"emp name should be equal");
	   assertNotEquals("Abbu",result) ;
	}
	@Test
	public void TestEmpId() {
		Employee result1 = (es.getEmployee(1004));
		assertEquals(EmployeeService.employeesMap.get(1004),result1);
		assertNotEquals(EmployeeService.employeesMap.get(1010),result1);
	}
	@Test()
	public void addNewDataCheck() {
		es.addEmployee(new Employee(1016, "era", "nunu", "777777777", "punjab"));
		Employee result1 = (es.getEmployee(1016));
		assertEquals(EmployeeService.employeesMap.get(1016),result1);
		assertEquals("era",EmployeeService.employeesMap.get(1016).getfName());
		
	}
	@Test
	public void checkDelete() {
		es.deleteEmployee(1001);
		assertNull(es.getEmployee(1001));
          // assertNotNull(es.getEmployee(1001));
	}
	@Test
	public void checkUpdate() {
		es.updateEmployee(new Employee(1004,"naaz", "hasrat", "7978971716", "rkl"));
		assertEquals("naaz",EmployeeService.employeesMap.get(1004).getfName());
		assertEquals("rkl",EmployeeService.employeesMap.get(1004).getAddress());
		
}
}
