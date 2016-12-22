package oops;
import java.io.*;
 class Stu implements Serializable {
int eid;
String name;

public Stu(int eid,String name) 
{
	this.eid=eid;
	this.name=name;
}
 }
class Student 
{
	public static void main(String[]args) throws Exception
	{
	Stu s=new Stu(100,"sekku");
	FileOutputStream fos=new FileOutputStream("D:/serial.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(s);
	System.out.println("serialize");
	  FileInputStream fis=new FileInputStream("D:/serial.txt");
	    ObjectInputStream ois=new ObjectInputStream(fis);
	    Stu s1=(Stu)ois.readObject();
	    System.out.println("deserialize");
	  
    
}
}
