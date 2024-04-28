import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException; 
import java.io.IOException;

class University
{
	public static void main(String args[])throws FileNotFoundException , IOException ,ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream("D:\\Programming\\serial.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object ob=ois.readObject();
		Student ss1=(Student)ob;
		System.out.println(ss1.studid+" "+ss1.studname);
	}
}
//public final Object readObject()throws IOException,ClassNotFoundException