package Test1;

public class EmployeeUtility {
	public static void validateData(Employee employee) {
		if (employee == null) {
			throw new EmployeeException("Employee is null");
		}
		if(employee.getId() <= 0) {
			throw new EmployeeException("Employee ID should not be blank");
		}
		if(employee.getfName() == null) {
			throw new EmployeeException("Employee fname should not be blank");
		}
		if(employee.getlName() == null) {
			throw new EmployeeException("Employee lname should not be blank");
		}
		if(employee.getMobile() == null) {
			throw new EmployeeException("Employee mobile should not be blank");
		}
		if(employee.getAddress() == null) {
			throw new EmployeeException("Employee address should not be blank");
		}
	}

	public static void IsIdBlank(int id) {
		if (id <= 0) {
			throw new EmployeeException("Employee ID should not be blank");
		}
	}
	
	public static void checkBlank(String data) {
		if(data == null) {
			throw new EmployeeException("Data should not be blank");
		}
	}

}
