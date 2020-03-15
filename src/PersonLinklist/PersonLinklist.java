package PersonLinklist;

import PersonstackArray.Person;

public class PersonLinklist {

		private Node head;
		
		public PersonLinklist(Person p)
		{
			head=new Node();
			head.value=p;
			head.link=null;
		}
		public boolean insertbegin(Person p)
		{
			Node n=new Node();
			n.value=p;
			n.link=head;
			head=n;
			return true;
			
		}
		public boolean insertlast(Person p)
		{
			Node n=new Node();
			Node temp=head;
			while(temp.link!=null)
			{
				temp=temp.link;
			}
			n.value=p;
			n.link=null;
			temp.link=n;
			return true;
			
		}
		
		public void sort()  //based on age
		{
			Node f=head;
			while(f.link!=null)
			{
				Node s=head;
				while(s.link!=null)
				{
					if(s.value.getAge()>s.link.value.getAge())
					{
						Person c=s.value;
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
				System.out.println(z.value.toString());
				z=z.link;
			}
			System.out.println("END");
		}
		
		public boolean delete(String name)
		{
		 
		 if(name.equals(head.value.getName()))
		 {
			 head=head.link;
			 return true;
		 }
		 else
		 {
			 Node x=head;
			 Node y=head.link;
			 while(y!=null && !(y.value.getName().equals(name)))
			 {
					 x=y;
					 y=y.link;
				 
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
			
			private Person value;
			private Node link;
		}

	}
	    

