package PatternPrograms;

public class BinaryZeroOne {
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            int ans = 0;
            for(int j=1; j<=i; j++){
                System.out.print(ans+" ");
                ans = 1-ans;
            }
            System.out.println();
        }
    }
}
