package Test1;



import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
	static Map<Integer, Employee> employeesMap = new HashMap<>() {
		{
			put(1001, new Employee(1001, "Srija", "soni", "7978971719", "Bengaluru"));
			put(1002, new Employee(1002, "robin", "", "7978971718", "Tata"));
			put(1003, new Employee(1003, "jahangir", "ansari", "7978971717", "Odisha"));
			put(1004, new Employee(1004, "sabbo", "hasrat", "7978971716", "Chattisgarh"));
			put(1005, new Employee(1005, "sadaf", "sada", "7978971715", "kolkata"));
		}
	};

	public String getEmployeeName(String data) {
		EmployeeUtility.checkBlank(data);
	     return data;
	}
	public Employee getEmployee(int id) {
		EmployeeUtility.IsIdBlank(id);
		return employeesMap.get(id);
	}

	public void addEmployee(Employee employee) {
		EmployeeUtility.validateData(employee);
		    employeesMap.put(employee.getId(), employee);
	}
	public Employee deleteEmployee(int id) {
		EmployeeUtility.IsIdBlank(id);
		  return employeesMap.remove(id);
	}

	public void updateEmployee(Employee employee) {
		EmployeeUtility.validateData(employee);
		 employeesMap.replace(employee.getId(), employee);
		//employeesMap.put(employee.getId(), employee);
	}
}