import java.util.Scanner;




public class Factorials {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number getting factorialed: ");
        int num = scanner.nextInt();
        
        int total = 1;
        for(int i = num;i>0;i--){
            total *= i;

        }
        System.out.println(num +"! = " + total);

        scanner.close();
    }
}
