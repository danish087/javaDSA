package hashTable;

public class Main {
	
	public static void main(String args[])
	{
		Hashtable ht=new Hashtable();
		Student s1=new Student("abc","15",8.56);
		Student s2=new Student("def","16",7.57);
		Student s3=new Student("ghi","16",6.76);
		Student s4=new Student("abcd","15",8.56);
		
		int std1key=ht.toHashCode(s1.getRoll());
		int std2key=ht.toHashCode(s2.getRoll());
		int std3key=ht.toHashCode(s3.getRoll());
		int std4key=ht.toHashCode(s4.getRoll());
		
		ht.insertInHash(std1key, s1);
		ht.insertInHash(std2key, s2);
		ht.insertInHash(std3key, s3);
		ht.insertInHash(std3key, s4);
		
		ht.deleteStudent("15");
		
		Student new_std=ht.fetchStudInfo(s1.getRoll());
		///if()
		ht.showAllStud();
		
	}

}
