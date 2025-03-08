package ArrayPrograms.Important;

public class MovingZeros {
    public static void main(String[] args){
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int index = 0;

        //move non-zero element to the front.
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }

        //filled remaining position with zeros.
        while(index < arr.length){
            arr[index] = 0;
            index++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
