package Tricky;

public class First {
    public static void main(String[] args){
        int sum=0;
        for(int i=0, j=0; i<5 && j<5; ++i, j=i+1){
            sum  += i;
            System.out.print(sum+" ");
        }

        // for(int i=0, j=0; i<5 && j<5; ++i, j=i+1)
        //     sum  += i;
        //     System.out.print(sum+" ");
    }
}
