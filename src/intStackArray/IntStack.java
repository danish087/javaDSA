package intStackArray;
public class IntStack {
	
	private int stack[];
	private int top;
	private int size;
	
	public IntStack (int size)
	{
		this.size=size;
		top=-1;
		stack=new int [this.size];
	}
	
	public IntStack ()
	{
		this.size=50;
		top=-1;
		stack=new int [50];
	}
	
	public boolean push(int ele)
	{
		stack[++top]=ele;
		return true;
	}
	public int pop()
	{
		int ele=stack[top--];
		return ele;
	}

}
