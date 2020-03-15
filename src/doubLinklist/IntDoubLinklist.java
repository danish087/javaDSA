package doubLinklist;

public class IntDoubLinklist {
		
		private Node head;
		
		public IntDoubLinklist(int item)
		{
			head=new Node();
			head.value=item;
			head.prev=null;
			head.next=null;
		}
		public boolean insertbegin(int item)
		{
			Node n=new Node();
			n.value=item;
			n.prev=null;
			head.prev=n;
			n.next=head;
			head=n;
			return true;
			
		}
		/*public boolean insertlast(int item)
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
		}*/
		public void printlist()
		{
			Node z=head;
			while(z!=null)
			{
				System.out.println(z.value);
				z=z.next;
			}
			System.out.println();
		}
		
		public boolean delete(int item)
		{
		 
		 if(head.value==item)
		 {
			 head=head.next;
			 return true;
		 }
		 else
		 {
			 Node x=head;
			 Node y=head.next;
			 while(true)
			 {
				 if(y==null || y.value==item)
				 {
					 break;
				 }
				 else
				 {
					 x=y;
					 y=y.next;
				 }
			 }
			 if(y!=null)
			 {
				 x.next=y.next;
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
			private Node prev;
			private Node next;
		}

	}
	    
