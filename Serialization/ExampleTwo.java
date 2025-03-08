package Serialization;

import java.io.*;

class BasicInformation implements Serializable {
	 transient int a = 10;
	 transient String name = "Deepesh Prajapati";

	 //Custom deserialization logic.
	@Serial
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
		ois.defaultReadObject();
		this.a = 10;
		this.name = "Deepesh Prajapati";
	}
}
public class ExampleTwo {
	public static void main(String[] args){
		BasicInformation bi = new BasicInformation();
		try{
			System.out.println("Serialization is started.");
			FileOutputStream fos = new FileOutputStream("basicinformation.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(bi);
			oos.close();

			System.out.println("Serialization is done.");
			System.out.println("Deserialization is started.");

			FileInputStream fis = new FileInputStream("basicinformation.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			BasicInformation bis = (BasicInformation) ois.readObject();
			ois.close();

			System.out.print(bis.a+" "+bis.name);

		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
