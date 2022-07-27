
public class TestingEmployee2

{

	public static void main(String[] args) 
	{
		Employee1DB edb=new Employee1DB();
		
		Employee1 emp1=new Employee1(1001, "Riya","riya@gmail.com","Female", 40000);
		Employee1 emp2=new Employee1(1002, "Shyam","shyam@gmail.com","Male", 50000);
		Employee1 emp3=new Employee1(1003, "Rohit","rohit@gmail.com","Male", 60000);
		Employee1 emp4=new Employee1(1004, "Sonia","sonia@gmail.com","Female", 70000);
		Employee1 emp5=new Employee1(1005, "Ayan","ayan@gmail.com","Male", 80000);
		
		
		
		edb.addEmployee(emp1);
		edb.addEmployee(emp2);
		edb.addEmployee(emp3);
		edb.addEmployee(emp4);
	
		for(Employee1 emp : edb.listAll())
			System.out.println(emp.getEmployeeDetails());
		
		System.out.println();
		edb.deleteEmployee(1003);
		
		for(Employee1 emp : edb.listAll())
			System.out.println(emp.getEmployeeDetails());
		
		System.out.println();
		System.out.println(edb.showPaySlip(1001));
		
		
	}

}
