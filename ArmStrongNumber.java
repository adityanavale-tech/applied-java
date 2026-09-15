import java.util.Scanner;


public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        String num = scanner.nextLine();
        int chars = num.length();
        int sumArmStrong = 0;
        for(char c : num.toCharArray()){
            //char c is each character in the word
            int digit = c - '0';
            sumArmStrong += Math.pow(digit,chars);
        }
        int ognum = Integer.parseInt(num);
        if(sumArmStrong == ognum) {
            System.out.println(num + " Is a armstrong number!");
        }
        else{
            System.err.println("Not an ArmStrong Number!");
        }




    }
}
