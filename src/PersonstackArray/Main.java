package PersonstackArray;

public class Main {
	
	public static void main(String [] args)
	{
		Person p1=new Person("danish",24);
		Person p2=new Person("karimi",22);
		StackP i=new StackP();
		i.push(p1);
		i.push(p2);
		System.out.println(i.pop());
		System.out.println(i.pop());
		//System.out.println(i.pop());
		
		
	}

}
