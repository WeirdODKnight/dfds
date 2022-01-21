package someProject;

public class EmployeeAdd {
	
	int age;
	
	double salary;
	String name;

	 private void calculateAge() {
		System.out.println("something");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeAdd e = new EmployeeAdd();
		e.age = 40;
		e.salary = 5000;
		e.name = "craft employee";
		e.calculateAge();
		
		Customer a = new Customer();
		a.custname = "css";
		a.custnamePrint();

	}

}
