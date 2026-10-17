import java.util.Scanner;




public class USACOBronzePractice {
    public static void main(String[] args) {
         //final printing
         Scanner scanner = new Scanner(System.in);
         int num[] = {6, 3, 8, 2, 5, 7, 4};
         System.out.println("Enter l: ");
         int l = scanner.nextInt();
         System.out.println("Enter r: ");
         int r = scanner.nextInt();
         int sum1 = 0;
         
         for(int i = l;i<r;i++){
            sum1 += num[i];
         }
         System.out.println("Query Sum = " + sum1);

    }

}
