package PersonLinklist;

import PersonstackArray.Person;
import PersonstackArray.StackP;

public class Main {
	public static void main(String [] args)
	{
		Person p1=new Person("danish",24);
		Person p2=new Person("kar",25);
		Person p3=new Person("ka",22);
		Person p4=new Person("karimi",29);
		PersonLinklist i=new PersonLinklist(p1);
		i.insertbegin(p2);
		//i.insertlast(p1);
		i.insertbegin(p4);
		i.insertlast(p3);
		
		i.printlist();
		i.sort();
		i.printlist();
	}

}
