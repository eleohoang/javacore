package InOut;
import java.io.*;

public class DataOutputStreamEx {
	public static void main(String[] args) throws IOException
	{
		String filepath = "D:\\myfileout.dat";
		// Create a FileOutputStream object to connect with myfileout.dat file.
		FileOutputStream fos = new FileOutputStream(filepath);

		// Create a DataOutputStream object to wrap on fos.  
		DataOutputStream dos = new DataOutputStream(fos);

		// Write following primitive data to the "myfileout.dat" file.
		dos.writeUTF("Welcome to Scientech Easy");
		dos.writeInt(124);
		dos.writeDouble(125.25);
		dos.writeBoolean(true);
		dos.writeChar('A');

		dos.close();
		fos.close();

		// Read data from the "myfileout.dat" file.
		FileInputStream fis = new FileInputStream(filepath);
		DataInputStream dis = new DataInputStream(fis);

		System.out.println(dis.readUTF()); 
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());

		dis.close();
		fis.close();
	}
}
