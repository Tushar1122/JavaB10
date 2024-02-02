package ArrayBasicAssign3;

public class ObjectInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee();
		employee1.setEno(10);
		employee1.setEname("Ram");
		employee1.setCity("Pune");
		
		//employee1.eno = 10;
		//employee1.ename = "Ram";
		
		Employee employee2 = new Employee();
		employee2.setEno(20);
		employee2.setEname("Shyam");
		employee2.setCity("Mumbai");
		
		//employee2.eno = 20;
		//employee2.ename = "Shyam";
		
		Employee employee3 = new Employee();
		employee3.setEno(30);
		employee3.setEname("Rohit");
		employee3.setCity("Nagpur");
		
		//employee3.eno = 30;
		//employee3.ename = "Rohit";
		
		Employee employee4 = new Employee();
		employee4.setEno(40);
		employee4.setEname("Mohit");
		employee4.setCity("Nanded");
		
		//employee4.eno = 40;
		//employee4.ename = "Mohit";
		
		Employee employee5 = new Employee();
		employee5.setEno(50);
		employee5.setEname("Krisna");
		employee5.setCity("Solapur");
		//employee5.eno = 50;
		//employee5.ename = "Krisna";

		
		Employee[] employees = new Employee[5];
		
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		employees[3] = employee4;
		employees[4] = employee5;
		
		ObjectInArray obj = new ObjectInArray();
		obj.getEmployee(employees);
		
		EmployeeAnother employeeAnother = new EmployeeAnother();
		employeeAnother.getArray(employees);
	}

	void getEmployee(Employee[] emp) {
		
		for(int i = 0; i < emp.length;i++) {
			Employee empObj = emp[i];
			
			//System.out.println("Roll No is =>" + empObj.eno);
			//System.out.println("Emp Name is => " + empObj.ename);
			System.out.println(empObj.toString());
			
			
		}
		System.out.println();
	}
	
	
}
