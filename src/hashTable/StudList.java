package hashTable;

public class StudList {
	private Node h;
	
	public StudList()
	{
		h=new Node();
		h.data=null;
		h.next=null;
	}
	
	public  boolean insertStud(Student std)
	{
		Node n=new Node();
		n.data=std;
		n.next=h.next;
		h.next=n;
		
		return true;
	}
	
	boolean haveRoll(String rollno)
	{
		Node a=h.next;
		 boolean have=false;
		 while(a!=null)
		 {
			 if(a.data.getRoll().contentEquals(rollno))
			 {
				 have =true;
				 break;
			 }
			 a=a.next;
		 }
		return have;
	}
	
	public Student fetchData(String rollno) {
		Student data=null;
		Node p=h.next;
		while(p!=null)
		{
			if(p.data.getRoll().contentEquals(rollno))
			{
				data=p.data;
				
			}
			p=p.next;
		}
		
	  return data;
	}
	
	public void deleteStudent(String rollno)
	{
		Node p=h;
		Node q=h.next;
		while(q!=null && !(q.data.getRoll().equals(rollno))){
			p=q;
			q=q.next;
		}
		if(q!=null)
		{
			p.next=q.next;
		}
		else
		{
			//no found
		}
	}
	
	public void showAll()
	{
		Node x=h.next;
		while(x!=null)
		{
			System.out.println(" "+x.data);
			x=x.next;
		}
	}
	
class Node
	{
		private Student data;
		private Node next;
	}

}
