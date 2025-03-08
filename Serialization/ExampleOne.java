package Serialization;

import java.io.*;

class MyInformation implements Serializable {
	private String name;
	private Integer age;
	private Long mobileNo;
	private String address;

	public void setName(String name){this.name = name; }
	public void setAge(Integer age){ this.age = age; }
	public void setMobileNo(Long mob){ this.mobileNo = mob; }
	public void setAddress(String add){ this.address = add; }

	public String getName(){ return name; }
	public Integer getAge(){ return age; }
	public Long getMobileNo(){ return mobileNo; }
	public String getAddress(){ return address; }

}
public class ExampleOne {
	public static void main(String[] args) {
		MyInformation mi = new MyInformation();

		mi.setName("Deepesh Prajapati");
		mi.setAddress("Gwalior, Madhya Pradesh");
		mi.setAge(24);
		mi.setMobileNo(7724818791L);

		try {
			System.out.println("Serialization is started");

			FileOutputStream fos = new FileOutputStream("myinformation.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(mi);

			System.out.println("Serialization is done.");
			System.out.println("Deserialization is started");

			FileInputStream fis = new FileInputStream("myinformation.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			MyInformation mi1 = (MyInformation) ois.readObject();

			System.out.println("Name: "+mi1.getName());
			System.out.println("Age: "+mi1.getAge());
			System.out.println("Mobile NO: "+mi1.getMobileNo());
			System.out.println("Address: "+mi1.getAddress());

			System.out.println("Deserialization is Done");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
