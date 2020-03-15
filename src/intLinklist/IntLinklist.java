package intLinklist;

public class IntLinklist {
	
	private Node head;
	
	public IntLinklist(int item)
	{
		head=new Node();
		head.value=item;
		head.link=null;
	}
	public boolean insertbegin(int item)
	{
		Node n=new Node();
		n.value=item;
		n.link=head;
		head=n;
		return true;
		
	}
	public boolean insertlast(int item)
	{
		Node n=new Node();
		Node temp=head;
		while(temp.link!=null)
		{
			temp=temp.link;
		}
		n.value=item;
		n.link=null;
		temp.link=n;
		return true;
		
	}
	
	public void sort()
	{
		Node f=head;
		while(f.link!=null)
		{
			Node s=head;
			while(s.link!=null)
			{
				if(s.value>s.link.value)
				{
					int c=s.value;
					s.value=s.link.value;
					s.link.value=c;
				}
		   	 s=s.link;
			}
		 f=f.link;
		}
	}
	public void printlist()
	{
		Node z=head;
		while(z!=null)
		{
			System.out.println(z.value);
			z=z.link;
		}
		System.out.println("END");
	}
	
	public boolean delete(int item)
	{
	 
	 if(head.value==item)
	 {
		 head=head.link;
		 return true;
	 }
	 else
	 {
		 Node x=head;
		 Node y=head.link;
		 while(true)
		 {
			 if(y==null || y.value==item)
			 {
				 break;
			 }
			 else
			 {
				 x=y;
				 y=y.link;
			 }
		 }
		 if(y!=null)
		 {
			 x.link=y.link;
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	
	}
	}
	 
	class Node
	{
		private int value;
		private Node link;
	}

}
    