package QueueIntArray;

import PersonstackArray.Person;
import QueuePersonArray.QueuePerson;

public class Main {
	public static void main(String [] args)
	{
		
		QueueInt i=new QueueInt();
		i.enque(5);
		i.enque(10);
		System.out.println(i.dequeue());
		System.out.println(i.dequeue());
		i.enque(15); 
		
	
		//System.out.println(i.dequeue());
		i.showAll();
	}

	
}
