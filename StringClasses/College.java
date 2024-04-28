import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException; 
import java.io.IOException; 
class College
{
	public static void main(String asrg[])throws FileNotFoundException,IOException
	{
		Student ss=new Student(01,"Akshta");
		FileOutputStream fos=new FileOutputStream("D:\\Programming\\serial.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ss);
		

	
	}
}
//public final void writeObject(Object obj)throws IOException