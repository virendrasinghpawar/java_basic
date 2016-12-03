package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Clientjava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File read =new File("C:/Users/Public/Pictures/Sample Pictures/Chrysanthemum.jpg");
		File write =new File("C:/Users/Public/Pictures/Chrysanthemum.jpg");

		try {


			FileInputStream fi=new FileInputStream(read);
			FileOutputStream fo =new FileOutputStream(write);
			byte byteValue[]=new byte[1024];
			int byteRead;
			while ((byteRead=fi.read(byteValue)) !=-1){
				fo.write(b, 0, len);
			}

			/*Single byte reading from the file*/
			//			byte byteValue;
			//		while ((byteValue=(byte) fi.read())!=-1) {
			//			fo.write(byteValue);
			//		}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}

}
