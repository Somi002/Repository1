package Test1;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println(EmployeeService.employeesMap.size());
		
		EmployeeService emp = new EmployeeService();
		System.out.println("addes employee successfully :" + emp.employeesMap);
		emp.addEmployee(new Employee(1006,"nunu", "wuhu", "7205641719", "china"));
		System.out.println("Fetched employee details based on employee ID: " +emp.getEmployee(1006));
		
		emp.deleteEmployee(1006);
		System.out.println("employee got deleted succesfully :+emp.employeesMap");
		
		emp.updateEmployee(new Employee(1004, "john", "wuhu", "7978971715", "china"));
		System.out.println("updated suceesfully" + emp.getEmployee(1004));
		System.out.println("addes employee successfully :" + emp.employeesMap);
	}

}
