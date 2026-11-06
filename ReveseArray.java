public class ReveseArray {
    public static void main(String[] args) {
        int[] array = {2,3,2,1,4};
        int[] reversedArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reversedArray[i] = array[array.length - (i + 1)];
            System.out.print(reversedArray[i]);
        }
    }
}
