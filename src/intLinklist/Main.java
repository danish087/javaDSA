package intLinklist;

import intStackArray.IntStack;

public class Main {
 
	public static void main(String [] args)
	{
		IntLinklist i=new IntLinklist(2);
		i.insertbegin(5);
		i.insertbegin(9);
		i.insertbegin(19);
		i.insertlast(29);
		i.insertbegin(59);
		i.printlist();
        i.sort();
		i.printlist();
		
	}
	
}
