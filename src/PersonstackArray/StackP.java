package PersonstackArray;

public class StackP {
	
	private Person stack[];
	private int top;
	private int size;
	
	public StackP(int size)
	{
		this.size=size;
		top=-1;
		stack=new Person [this.size];
	}
	
	public StackP()
	{
		this.size=50;
		top=-1;
		stack=new Person [50];
	}
	
	public boolean push(Person ele)
	{
		stack[++top]=ele;
		return true;
	}
	public Person pop()
	{
		Person ele=stack[top--];
		return ele;
	}

}

