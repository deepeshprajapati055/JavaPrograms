package AllCoreTopicsExamples.OOPs.Encapsulation;

import java.util.Scanner;

public class Validation {
    private String name;
    private Integer age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(!name.isEmpty() || name==null){
            this.name = name;
        }else{
            throw new RuntimeException("Please enter your name");
        }
        
    }

    public Integer getAge(){
        return age;
    }
    
    public void setAge(Integer age){
        if(age>18){
            this.age = age;
            System.out.println("You are eligible for vote.");
        }else{
            System.out.println("Sorry :(");
            throw new RuntimeException("Age must be greater than 18.");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        Integer age = sc.nextInt();

        Validation obj = new Validation();
        
        obj.setName(name);
        obj.setAge(age);

        System.out.println("Name- "+obj.getName());
        System.out.println("Age- "+obj.getAge());

        sc.close();
    }
}
