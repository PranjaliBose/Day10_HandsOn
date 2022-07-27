//import java.util.ArrayList;
import java.util.*;

public class Employee3DB 
{
	Vector<Employee1> list=new Vector<>(5);
	
	public boolean addEmployee(Employee1 e)
	{
		return list.add(e);
	}
	
	public boolean deleteEmployee(int id)
	{
		boolean isDeleted=false;
		
		Iterator<Employee1> i=list.iterator();
		
		while(i.hasNext())
		{
			Employee1 emp=i.next();
			if(emp.getID()==id) 
			{
				isDeleted=true;
				i.remove();
				
			}
		}
		return isDeleted;
	}
	
	public String showPaySlip(int id)
	{
		String payslip=" Invalid ID";
		
		for(Employee1 e: list)
		{
			if(e.getID()==id)
			{
				payslip="Payslip of Employee ID: "+id+ " is "+e.getSal();
			}
		}
		return payslip;
	}
	
	public Employee1[] listAll()
	{
		Employee1[] arr=new Employee1[list.size()];
		for(int i=0;i<list.size();i++)
		{
			arr[i]=list.get(i);
		}
		return arr;
			

	}
}
