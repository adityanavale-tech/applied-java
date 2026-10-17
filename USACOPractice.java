import java.util.Scanner;





public class USACOPractice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.charAt(s.length() - 2));
    }
}