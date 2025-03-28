
public class SevenEightPattern{
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("7");
                }else{
                    System.out.print("8");
                }
            }
            System.out.println();
        }
    }
}