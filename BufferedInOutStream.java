import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException; 
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

class BufferedInOutStream
{
	public static void main(String args[])throws FileNotFoundException,IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Programming\\Bufsource.txt");
		BufferedInputStream br=new BufferedInputStream(fis);

		FileOutputStream fos=new FileOutputStream("D:\\Programming\\Bufdest.txt");
		BufferedOutputStream bw=new BufferedOutputStream(fos);
		int info;
		while((info=br.read())!=-1)
		{
			System.out.print((char)info);//char-->typecasting
			bw.write(info);
		}
         bw.flush();
		fis.close();
		fos.close();
		br.close();
		bw.close();


	}
}
//public BufferedReader(Reader in)
//public int read()throws IOException