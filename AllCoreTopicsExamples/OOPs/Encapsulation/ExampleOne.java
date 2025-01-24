package AllCoreTopicsExamples.OOPs.Encapsulation;

//Encapsulation is the process of binding data member's and corresponding methods into a single unit.
//Every members should be private that process is nothing but data hiding.
//If any component follows data-hiding and abstraction then that component is said to encapsulated component.
// ENCAPSULATION = DATA_HIDING + ABSTRACTION

public class ExampleOne {

    //Data-Hiding
    private Integer id;
    //Data-Hiding
    private String name;

    //Getter method - It is used to get the value from the object's is nothing but getter method.
    //It's always public to get the private data-member values.
    public Integer getId(){
        return id;
    }

    //Setter method - It is used to set the value into the object is nothing but setter method. 
    //It's always public to set the private data-member values.
    public void setId(Integer id1){
        //⦁ this keyword is the reference variable that refers to the current object.
        //⦁ this keyword can be used to refer current class instance variable.
        this.id = id1;
    }

    //Getter method - It is used to get the value from the object's is nothing but getter method.
    //It's always public to get the private data-member values.
    public String getName(){
        return name;
    }

    //Setter method - It is used to set the value into the object is nothing but setter method. 
    //It's always public to set the private data-member values.
    public void setName(String name1){
        //⦁ this keyword is the reference variable that refers to the current object.
        //⦁ this keyword can be used to refer current class instance variable.
        this.name = name1;
    }

    public static void main(String[] args){
        //Create an Object of ExampleOne class.
        //ex1 is the reference variable by which help us to call method's and variable's.
        ExampleOne ex1 = new ExampleOne();

        //Set the name and id into the private data member's.
        ex1.setId(101);
        ex1.setName("Deepesh Prajapati");

        //Calling the getter method to get the private data member's value which i set using the setter method.
        System.out.println("ID - "+ex1.getId());
        System.out.println("NAME - "+ex1.getName());
    }
}

