package Test1;

public class Employee {

	
		int id;
		String fName;
		String lName;
		 String mobile;
		 String address;
		 
		  public Employee() {
			  
		  }
		public Employee(int id,String fName, String lName, String mobile,String address) {
			super();
			this.id= id;
			this.fName= fName;
			this.lName= lName;
			this.mobile= mobile;
			this.address= address;
	}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", mobile=" + mobile + ", address="
					+ address + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getfName() {
			return fName;
		}
		public void setfName(String fName) {
			this.fName = fName;
		}
		public String getlName() {
			return lName;
		}
		public void setlName(String lName) {
			this.lName = lName;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
}	
