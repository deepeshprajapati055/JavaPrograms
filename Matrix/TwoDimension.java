import java.io.IOException;

public class TwoDimension{
    public static void main(String[] args) throws IOException{
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
        for(int i=0; i<=arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}