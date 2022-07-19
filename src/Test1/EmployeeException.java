package Test1;

public class EmployeeException extends RuntimeException{// Runtime exception

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public EmployeeException(String msg) {
		super(msg);
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "msg=" + msg ;
	}
	
	
}
