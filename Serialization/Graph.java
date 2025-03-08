package Serialization;

import java.io.*;

class DogOne implements Serializable {
	CatOne catOne = new CatOne();
}
class CatOne implements Serializable{
	RatOne ratOne = new RatOne();
}
class RatOne implements Serializable{
	int i = 20;
}
public class Graph {
	public static void main(String[] args){
		DogOne dog1 = new DogOne();

		try{
			System.out.println("Serialization is Started.");
			FileOutputStream fos = new FileOutputStream("Graph.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dog1);

			System.out.println("Serialization is Done.");
			System.out.println("Deserialization is started.");

			FileInputStream fis = new FileInputStream("Graph.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			DogOne d1 = (DogOne) ois.readObject();

			//Graph is here>>>>>
			System.out.println("Value: "+d1.catOne.ratOne.i);

			System.out.println("Deserialization is Done.");
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}
