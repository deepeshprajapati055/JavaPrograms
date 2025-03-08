//Example of Default Serialization.
package Serialization;

import java.io.*;

class AccountInformation implements Serializable {
	String name = "Deepesh Prajapati";
	transient String password = "Deepesh@123";
	@Serial
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.defaultWriteObject();
		String pwd = 1234567+password;
		oos.writeObject(pwd);
	}
	@Serial
	private void readObject(ObjectInputStream ois) throws Exception{
		ois.defaultReadObject();
		String pwd = (String) ois.readObject();
		password = pwd.substring(7);
	}
}
public class Account {
	public static void main(String[] args){
		AccountInformation ai = new AccountInformation();

		try{
			System.out.println("Serialization is Started.");
			FileOutputStream fos = new FileOutputStream("Account.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ai);

			System.out.println("Serialization is Done.");
			System.out.println("Deserialization is Started.");

			FileInputStream fis = new FileInputStream("Account.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			AccountInformation ai1 = (AccountInformation)ois.readObject();

			System.out.println("Name: "+ai1.name+" :: "+"Password: "+ai1.password);

			System.out.println("Deserialization is Done.");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
