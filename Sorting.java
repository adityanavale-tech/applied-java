import java.util.*;

public class Sorting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] array = {4,2,7, 200, 1, 5, 100};
        for(int i = 0; i <= array.length - 1; i++){
            if(i + 1 != array.length){
            
            if(array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        System.out.print(array[i] + " ");
        }
     }
}