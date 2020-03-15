package QueuePersonArray;

import PersonstackArray.Person;

public class QueuePerson {
	
	private Person queue[];
	private int front;
	private int rear;
	private int total;
	private int size;
	
	public QueuePerson (int size)
	{
		this.size=size;front=0; rear=0;total=0;
		queue=new Person [this.size];
	}
	
	public QueuePerson ()
	{
		this.size=100; front=0; rear=0; total=0;
		queue=new Person  [this.size];
	}
	
	public boolean enque(Person ele)
	{ 
		if(isFull())
		{
			return false;
		} 
		else
		{
		 total++;
		 queue[rear]=ele;
		 rear=(rear+1)%size;
		 return true;
		}
	}
	
	public boolean isFull()
	{
		if(size==total)
			return true;
		return false;
	}
	
	public Person dequeue()
	{
		if(isEmpty())
		{
			return null ;
		}
		else 
		{
		   Person ele=queue[front];
		   total--; 
		   front=(front+1)%size;
		   return ele;
		}
	}
	public boolean isEmpty()
	{
		if(total==0)
			return true;
		return false;
	}
	public void showAll()
	{
		int f=front;
		while(total!=0)
		{
			System.out.println(" "+queue[f].toString());
			f=(f+1)%size; total--;
		}
	}

}
