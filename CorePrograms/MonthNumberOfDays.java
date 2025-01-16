import java.util.Scanner;
public class MonthNumberOfDays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Month: ");
        int n = sc.nextInt();

        if(n==1){
            System.out.println("January - 31 Days");
        }else if(n==2){
            System.out.println("February - 28 Days");
        }else if(n==3){
            System.out.println("March - 31 Days");
        }else if(n==4){
            System.out.println("April - 30 Days");
        }else if(n==5){
            System.out.println("May - 31 Days");
        }else if(n==6){
            System.out.println("June - 30 Days");
        }else if(n==7){
            System.out.println("July - 31 Days");
        }else if(n==8){
            System.out.println("August - 31 Days");
        }else if(n==9){
            System.out.println("September - 30 Days");
        }else if(n==10){
            System.out.println("October - 31 Days");
        }else if(n==11){
            System.out.println("November - 30 Days");
        }else if(n==12){
            System.out.println("December - 31 Days");
        }
        else{
            System.out.println("You have entered wrong number. ");
        }
        sc.close();
    }
}