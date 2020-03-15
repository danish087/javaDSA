package bstPerson;

import PersonstackArray.Person;

public class Main {

	public static void main(String [] args)
	{
		Person p1=new Person("danish",24);
		Person p2=new Person("akar",25);
		Person p3=new Person("bka",22);
		Person p4=new Person("dkarimi",29);
		BST i=new BST();
		i.insert(p1);
		i.insert(p2);
		i.insert(p3);
		i.insert(p4);
		i.showAll(i.findNode("akar"));
		//i.getParent();
	}
}
