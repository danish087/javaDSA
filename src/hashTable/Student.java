package hashTable;

public class Student {

	private String name;
	private String  roll;
	private double cgpa;
	
	public Student(String name,String roll,double cgpa)
	
	{
		this.name=name;
		this.roll=roll;
		this.cgpa=cgpa;
	}
	public Student() {}
	public String getName()
	{
		return this.name;
	}
	public String getRoll()
	{
		return this.roll;
	}
	public double getCgpa()
	{
		return this.cgpa;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setRoll(String roll)
	{
		this.roll=roll;
	}
	public void setCgpa(double cgpa)
	{
		this.cgpa=cgpa;
	}
	public String toString()
	{
		return this.name +"  "+this.roll+"  "+this.cgpa;
	}
}
