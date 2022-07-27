
public class Employee1 
{
	private int ID;
	private String Name;
	private String Email;
	private String Gen;
	private float Sal;
	
	public Employee1()
	{}
	
	public Employee1(int id,String name, String email, String gen, float sal)
	{
		ID=id;
		Name=name;
		Email=email;
		Gen=gen;
		Sal=sal;
	}
	
	public String  getEmployeeDetails()
	{
		return "Employee details[ Employee ID : "+ID+" Employee Name: "+Name+" Employee EmailID: "+Email+" Employee Gender :"+Gen+" Employee Salary : "+Sal+"]";
		
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void setID(int id)
	{
		ID=id;
	}
	
	public String getName()
	{
		return Name;
	}
	public void setName(String name)
	{
		Name=name;
	}
	public String getEmail()
	{
		return Email;
	}
	public void setEmail(String email)
	{
		Email=email;
	}
	public String getGen()
	{
		return Gen;
	}
	
	public void setGen(String gen)
	{
		Gen=gen;
	}
	public float getSal()
	{
		return Sal;
	}
	public void setSal(float sal)
	{
		Sal=sal;
	}
		
	
	
}
