import java.util.Scanner;



public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        //input is the number of watermelons
        if((input%2) == 0){
            System.out.println("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
