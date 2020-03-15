package QueuePersonArray;

import PersonstackArray.Person;
import QueueIntArray.QueueInt;

public class Main {

	public static void main(String [] args)
	{  
		Person p1=new Person("dan", 23);
		Person p2=new Person("danish", 323);
		QueuePerson i=new QueuePerson(); 
		i.enque(p1);
		i.enque(p2);
		i.enque(new Person("ddh",45)); 
		i.showAll();
	}
}
