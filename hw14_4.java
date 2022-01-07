package Java14;
import java.io.*;

public class hw14_4 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		char data[]=new char[128];
		FileReader fr=new FileReader("c:\\donkey.txt");
		
		int num=fr.read(data);
		String str=new String(data,0,num);
		System.out.println("read= "+num);
		System.out.println(str);
		fr.close();
	}

}
/*
不一樣 換行也被算成字元
*/