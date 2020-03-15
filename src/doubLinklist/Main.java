package doubLinklist;

public class Main {
	public static void main(String [] args)
	{
		IntDoubLinklist i=new IntDoubLinklist(2);
		i.insertbegin(5);
		i.insertbegin(9);
		i.insertbegin(19);
		i.insertbegin(59);
		i.printlist();
        // i.sort();
		i.delete(9);
		i.printlist();
		
	}
		

}
