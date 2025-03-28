package Tricky;

import java.util.Scanner;
public class JsonString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your email address: ");
        String email = sc.next();
        System.out.println("Enter your mobile number: ");
        Long mobileNo = sc.nextLong();
        System.out.println("Enter your address: ");
        String address = sc.next();

        String jsonString = """
            {
                "name":"%s",
                "age":"%d",
                "email":"%s",
                "mobileNo":"%d",
                "address":"%s"
            }
                """.formatted(name, age, email, mobileNo, address);
        System.out.println("Json Data :-");
        System.out.println(jsonString);

        sc.close();
    }    
}
