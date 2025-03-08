package Serialization;

import java.io.*;

class Dog implements Serializable {
	private String bark;
	public String getBark(){ return bark; }
	public void setBark(String bark){ this.bark = bark; }
}
class Cat implements Serializable{
	private String meow;
	public String getMeow(){ return meow; }
	public void setMeow(String meow){ this.meow = meow; }
}
class Rat implements Serializable{
	private String chewy;
	public String getChewy(){ return chewy; }
	public void setChewy(String chewy) { this.chewy = chewy; }
}
public class OrderSerialization {
	public static void main(String[] args){
		Dog dog = new Dog();
		Cat cat = new Cat();
		Rat rat = new Rat();
		dog.setBark("Dog is barking.");
		cat.setMeow("Cat is sleeping.");
		rat.setChewy("Rat is crawling.");
		try{
			System.out.println("Serialization is Started.");

			FileOutputStream fos = new FileOutputStream("Animals.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dog);
			oos.writeObject(cat);
			oos.writeObject(rat);

			System.out.println("Serialization is Done.");
			System.out.println("Deserialization is started.");

			FileInputStream fis = new FileInputStream("Animals.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// Order of object is important in serialization. (Runs Successfully)
			/*
			Dog dog1 = (Dog)ois.readObject();
			Cat cat1 = (Cat)ois.readObject();
			Rat rat1 = (Rat)ois.readObject();
			System.out.println(dog1.getBark());
			System.out.println(cat1.getMeow());
			System.out.println(rat1.getChewy());
			*/

			/* If we change an order of object then it will throw and exception	(Throw an exception)
			java.lang.ClassCastException: class Serialization.Dog cannot be cast to class Serialization.Cat
			*/
			Rat rat1 = (Rat)ois.readObject();
			Dog dog1 = (Dog)ois.readObject();
			Cat cat1 = (Cat)ois.readObject();

			System.out.println(dog1.getBark());
			System.out.println(cat1.getMeow());
			System.out.println(rat1.getChewy());

			//If we don't know the order then we should go like this >>>>>

			//Object object = ois.readObject();

			//It will not throw an exception it will print dog specific functionality.
			/*if(object instanceof Cat c){
				System.out.println(c.getMeow());
			} else if (object instanceof Dog d) {
				System.out.println(d.getBark());
			}else if(object instanceof Rat r){
				System.out.println(r.getChewy());
			}*/

			/*if(object instanceof Cat c){
				System.out.println(c.getMeow());
			}
			if (object instanceof Dog d) {
				System.out.println(d.getBark());
			}
			if(object instanceof Rat r){
				System.out.println(r.getChewy());
			}*/
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
