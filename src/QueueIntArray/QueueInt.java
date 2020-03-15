package QueueIntArray;

public class QueueInt {
	
	private int queue[];
	private int front;
	private int rear;
	private int total;
	private int size;
	
	public QueueInt (int size)
	{
		this.size=size;front=0; rear=0;total=0;
		queue=new int [this.size];
	}
	
	public QueueInt ()
	{
		this.size=100; front=0; rear=0; total=0;
		queue=new int [this.size];
	}
	
	public boolean enque(int ele)
	{ 
		if(isFull())
		{
			return false;
		} else
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
	public int dequeue()
	{
		if(isEmpty())
		{
			return -1;
		}
		else {
			int ele=queue[front];
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
			System.out.println(queue[f]+" ");
			f=(f+1)%size; total--;
		}
	}

}
