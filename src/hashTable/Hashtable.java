package hashTable;

public class Hashtable {
	
	private StudList[] arr;
	private int size;
	private int totalstud;
	
	public Hashtable()
	{
		size=1000;
		arr=new StudList[1000];
	}
	
	public int toHashCode(String rollno)
	{ 
		int addasci=0;
		int codevalue=0;
		for(int i=0;i<rollno.length();i++)	
		{
			addasci=addasci+(int)rollno.charAt(i);
		}
		codevalue=addasci%arr.length;
		return codevalue;
	}
 
    public boolean insertInHash(int key, Student data)
    {
    	if(arr[key]==null)//if empty create instance of  student
    	{
    		arr[key]=new StudList();
    	}
    	arr[key].insertStud(data);
    	totalstud++;
    	return true;
    }

    public int getTotal()
    {
    	return totalstud;
    }

    public Student fetchStudInfo(String rollno)
   {
	   int key=toHashCode(rollno);
	   if(arr[key]==null)
	   {
		   return null;
	   }
	   else {
		   Student q=arr[key].fetchData(rollno);
		   if(q!=null)
		   {
			   return q;
		   }
		   else
		   {
			   return null;
		   }
		   
	   }
   }

    public boolean deleteStudent(String rollno)
    {
    	int key=toHashCode(rollno);
    	boolean have=arr[key].haveRoll(rollno);
    	if(have)
    	{
    		arr[key].deleteStudent(rollno);
    		totalstud--;
    		return have;
    	}
    	return false;
    }

    public void showAllStud()
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]!=null)
    		{
    			arr[i].showAll();
    		}
    	}
    	
    }
}
