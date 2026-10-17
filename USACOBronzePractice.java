public class USACOBronzePractice {
    public static void main(String[] args) {
         //final printint
         int num[] = {6, 3, 8, 2, 5, 7, 4};
         int l = 0;
         int r = 4;
         int sum1 = 0;
         
         for(int i = l;i<r;i++){
            sum1 += num[i];
         }
         System.out.println("The sum of the first query is: " + sum1);

    }

}
