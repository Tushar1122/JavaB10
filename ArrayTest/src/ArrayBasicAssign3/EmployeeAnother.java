package ArrayBasicAssign3;

public class EmployeeAnother {

	
	
	void getArray(Employee[] emp) {
		System.out.println("Employee Another Class");
		for(Employee eObj : emp) {
			//System.out.println("Roll No is : => " + eObj.eno);
			//System.out.println("Emp Name is : => " + eObj.ename);
			
			System.out.println(eObj.toString());
		}
	}

}
