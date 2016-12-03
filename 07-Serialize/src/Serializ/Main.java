package Serializ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		car Car=new car("Lamborgini","Aventador Coup","Black");
		ObjectOutputStream oo =new ObjectOutputStream(new FileOutputStream("car-db"));
		try {
			oo.writeObject(Car);
			oo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("car-db"));
		
			car c=(car)oi.readObject();
		
		System.out.println(c.getModel());
	}

}
